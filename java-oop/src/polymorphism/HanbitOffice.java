package polymorphism;

import java.util.Scanner;

public class HanbitOffice {
	public static void main(String[] args) {
		int choice, money;
		String name, password;
		Scanner scanner = new Scanner(System.in);
		AdminService adminService = new AdminService();
		while (true) {
			System.out.println("원하는 업무를 선택해주세요.");
			System.out.println("관리자화면 : 1. 통장개설 2 .검색(계좌번호) 3. 검색(이름) 4. 해지 5. 총계좌수 6. 종료");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				return;
			default:
				break;
			}
		}
	}
}
