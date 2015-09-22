package encapsule;

import java.util.Scanner;

/**
 * @file_name : Test.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 22.
 * @story     : 
 */
public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String search;
		System.out.print("금액을 입력하세요 : ");
		search = scanner.next();
		Money money = new Money(); 
		String[] results = money.countMoney(Integer.parseInt(search)); //파라미터 = 매개변수//파라미터 = 매개변수
		for (int i = 0; i < results.length; i++) {
			System.out.println(results[i]);
		}
	}
}
