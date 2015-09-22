package encapsule;

import java.util.Scanner;

/**
 * @file_name : Pibo.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 22.
 * @story     : 피보나치수열 0 1 1 2 3 5 8 13
 */
public class Fibo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Fibo2 fibo2 = new Fibo2();
		int[] num = new int[2];
		System.out.println("피보나치 수열을 만들 두 초기값을 입력하시오");
		for (int i = 0; i < num.length; i++) {
			System.out.print("입력 : ");
			num[i] = scanner.nextInt();
		}	
		int result[] = fibo2.fiboCalc(num);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
	}
}
