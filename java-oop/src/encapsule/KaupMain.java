package encapsule;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @file_name : Kaup.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 23.
 * @story     : 카우프지수
 */
public class KaupMain {
	/**
	 * To. U
	 * 사람의 이름을 입력하고, 몸무게, 키를 입력하면
	 * 해당 사람의 상태가 비만인지 저체중인지 알려주는
	 * 카우프 프로그램을 만들어주세요.
	 * 카우프 지수구하는 공식은 키의 제곱을 몸무게로 나눈 후
	 * 10000을 곱한 인덱스값이 랍니다.
	 * 
	 *  그 인덱스결과가 30이상이면 비만
	 *  24 이상이면 과체중
	 *  20 이상이면 정상
	 *  15 이상이면 저체중
	 *  13 이상이면 마름
	 *  10 이상이면 영양실조
	 *  그 미만은 소모증이라고 합니다.
	 *  
	 *  어플리케이션 제작 바랍니다.
	 */
	public static void main(String[] args) {
		Kaup instance = new Kaup(); //인스턴스 변수
		Scanner scanner = new Scanner(System.in); //인스턴스 변수(참조 변수 == 객체)
		double height, weight; // Local valuable
		String name;
		//---------입력------------------------
		System.out.println("이름");
		name = scanner.next();
		System.out.println("키");
		height = scanner.nextDouble();
		System.out.println("몸무게");
		weight = scanner.nextDouble();
		//---------연산------------------------
		instance.setName(name);
		instance.setHeight(height);
		instance.setWeight(weight);
		instance.getResult();
		//---------출력------------------------
		System.out.println(instance.toString());

	}
}
/**
 * get : read
 * set : write 
 */