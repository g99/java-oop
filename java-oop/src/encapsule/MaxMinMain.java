package encapsule;

import java.util.Scanner;

/**
 * @file_name : MaxMin.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 22.
 * @story     : 최고점 최저점 구하기
 */
public class MaxMinMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MaxMin maxMin = new MaxMin();
		int[] scores = new int[5];
		String result = null;
		System.out.println("학생들 점수를 입력하시면 최고점, 최저점이 출력됩니다.");
		System.out.println("단, 정원은 5명입니다.");
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scanner.nextInt();
		}
		result = maxMin.calc(scores);
		System.out.println(result);
	}
}
