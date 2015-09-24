package inheritance;

import java.util.Scanner;

/**
 * @file_name : AccountMain.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 24.
 * @story : 계좌 개설 프로그램
 */
public class AccountMain {
	/**
	 * 생성자를 만드시오. 단, 통장을 만듦과 동시에 은행이름이 통장 바깥에 새겨지며(상수) 계좌번호는 랜덤숫자로 만들어 지며(총 6자리)
	 * 계좌주인의 이름은 새겨지며 비번도 설정 잔액은 통장 만든 후 입금
	 */
	public static void main(String[] args) {
		BankMenu bankMenu = new BankMenu();
		Scanner scanner = new Scanner(System.in);
		MinusAccount minus = new MinusAccount();
		int choice = 0, status = 0, money = 0;
		String name, password;
		System.out.println(minus.BANK_NAME + "에 오신걸 환영합니다.");
		while (true) {
			bankMenu.bankStart();
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("이름 : ");
				name = scanner.next();
				System.out.print("비밀번호 : ");
				password = scanner.next();
				minus.setOwnerName(name);
				minus.setPassword(password);
				status++;
				break;
			case 2:
				if (status == 0) {
					System.out.println("통장 개설부터 해주세요!!!\n");
				} else {
					System.out.println("잔액 " + minus.getRestMoney());
				}
				break;
			case 3:
				if (status == 0) {
					System.out.println("통장 개설부터 해주세요!!!\n");
				} else {
					System.out.print("입금금액 : ");
					money = scanner.nextInt();
					//minus.deposit(money);
				}
				break;
			case 4:
				if (status == 0) {
					System.out.println("통장 개설부터 해주세요!!!\n");
				} else {
					System.out.print("출금금액 : ");
					money = scanner.nextInt();
					minus.loan(money);
				}
				break;
			case 5:
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
				break;
			}
		}
		
	}
}
