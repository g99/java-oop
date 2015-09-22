package encapsule;

import java.util.Scanner;

/**
 * @file_name : Pibo.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 22.
 * @story     : 피보나치수열 0 1 1 2 3 5 8 13 (이전 두항의 합이 다음항이 되도록)
 */
public class Fibo2 {
	public int[] fiboCalc(int[] num){
		int[] answer = new int[20]; //피보나치 수열 길이
		answer[0] = num[0];
		answer[1] = num[1];
		for (int i = 2; i < answer.length; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}
}
