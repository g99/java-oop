package polymorphism;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class HanbitBank {
	public static void main(String[] args) {
		int choice, money;
		String name, password;
		Scanner scanner = new Scanner(System.in);
		BankService bankService = BankService.getInstance();
		while (true) {
			System.out.println("원하는 업무를 선택해주세요.");
			System.out.println("1. 통장개설, 2. 입금, 3. 출금, 4. 잔액조회, 5. 정지");	
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("이름입력 : ");
				name = scanner.next();
				System.out.print("비번입력 : ");
				password = scanner.next();
				System.out.println(bankService.open(name, password));
				break;
			case 2:
				System.out.print("입금금액 : ");
				money = scanner.nextInt();
				System.out.println(bankService.deposit(money));
				break;
			case 3:
				System.out.print("출금금액 : ");
				money = scanner.nextInt();
				System.out.println(bankService.withdraw(money));
				break;
			case 4:
				System.out.println(bankService.search());
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
