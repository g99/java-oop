package encapsule;

import java.util.Scanner;

/**
 * @file_name : AccountMain.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 24.
 * @story     : 계좌 개설 프로그램
 */
public class AccountMain {
	/**
	 * 생성자를 만드시오.
	 * 단, 통장을 만듦과 동시에
	 * 은행이름이 통장 바깥에 새겨지며(상수)
	 * 계좌번호는 랜덤숫자로 만들어 지며(총 6자리)
	 * 계좌주인의 이름은 새겨지며
	 * 비번도 설정
	 * 잔액은 통장 만든 후 입금
	 */
	public static void main(String[] args) {
		Account account = new Account("홍길동","12345");
		Scanner scanner = new Scanner(System.in);
		int money = 10000;
		account.deposit(money);
		money = 5000;
		account.withdraw(money);
		System.out.println(account.toString());
	}
}
