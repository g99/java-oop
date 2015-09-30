package polymorphism;

import java.util.Scanner;

public class HanbitOffice {
	public static void main(String[] args) {
		int choice, money;
		String name, accountNo;
		Scanner scanner = new Scanner(System.in);
		AdminService adminService = new AdminService();
		while (true) {
			System.out.println("원하는 업무를 선택해주세요.");
			System.out.println("관리자화면 : 1. 통장개설 2 .검색(계좌번호) 3. 검색(이름) 4. 해지 5. 총계좌수 6. 종료");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("통장을 개설합니다. 이름/계좌번호/잔액을 입력해주세요.");
				System.out.print("이름 : ");
				name = scanner.next();
				System.out.println("입금 금액을 입력해주세요.");
				System.out.print("금액 : ");
				money = scanner.nextInt();
				System.out.println("계좌번호 자동생성 (y/n)");
				System.out.print("선택 : ");
				accountNo = scanner.next();
				if (accountNo.equals("y")) {
					System.out.println(adminService.openAccount(name, money));
				} else if (accountNo.equals("n")) {
					System.out.print("계좌번호(6자리) : "); // 예외처리 안해놈
					accountNo = scanner.next();
					System.out.println(adminService.openAccount(accountNo, name, money));
				} else {
					System.out.println("잘못 선택하셨습니다.");
				}
				break;
			case 2:
				System.out.println("계좌번호로 계좌를 검색합니다.");
				System.out.print("계좌번호 : ");
				accountNo = scanner.next();
				Account result = adminService.searchAccountByAccountNo(accountNo);
				if (result != null) {
					System.out.println("<" + result.getAccountNo() + "> 계좌번호로 찾으신 정보는 다음과 같습니다.");
					System.out.println(result.toString());
				} else {
					System.out.println("해당하는 계좌가 존재하지 않습니다.\n");
				}
				break;
			case 3:
				System.out.println("이름으로 계좌를 검색합니다.");
				System.out.print("이름 : ");
				name = scanner.next();
				Account[] results = adminService.searchAccountsByName(name);
				if (results.length == 0) {
					System.out.println("해당하는 계좌가 존재하지 않습니다.\n");
				} else {
					System.out.println("<" + name + "> 과 일치하는 " + results.length + "개의 계좌가 발견되었습니다.");
					for (int i = 0; i < results.length; i++) {
						System.out.println(results[i].toString());
					}
				}
				break;
			case 4:
				System.out.println("계좌번호로 계좌를 해지합니다.");
				System.out.print("계좌번호 : ");
				accountNo = scanner.next();
				System.out.println(adminService.closeAccount(accountNo));
				break;
			case 5:
				System.out.println("현재 등록된 총 계좌수는 " + adminService.countAll() + "입니다.\n");
				break;
			case 6:
				System.out.println("===============[서비스 종료]===============");
				return;
			default:
				break;
			}
		}
	}
}
