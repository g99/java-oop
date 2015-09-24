package encapsule;

import java.util.Scanner;

/**
 * @file_name : SumMain.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 23.
 * @story     : 입력받은 두 수 사이의 값을 모두 더해서 반환해라
 */
public class SumMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1 = 0, num2 = 0, result = 0;
		
		System.out.println("두 수를 입력하세요.");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
	
		Sum sum = new Sum(num1,num2);
		
		sum.calc();
		System.out.println(sum.toString());
	}
}
