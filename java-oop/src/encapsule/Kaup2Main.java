package encapsule;

import java.util.Scanner;
/**
 * * To. U
	 * 사람의 이름을 입력하고, 몸무게, 키를 입력하면
	 * 해당 사람의 상태가 비만인지 저체중인지 알려주는
	 * 카우프 프로그램을 만들어주세요.
	 * 카우프 지수구하는 공식은 몸무게를 키의 제곱으로 나눈 후
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
	 *  어플리케이션 제작 바랍니다.     :
 */
public class Kaup2Main {
	public static void main(String[] args) {
		//변수선언
		Kaup2 kaup2 = new Kaup2();
		Scanner scanner = new Scanner(System.in);
		String name, result="";
		double height, weight;
		
		//입력
		name = scanner.next();
		height = scanner.nextDouble();
		weight = scanner.nextDouble();

		//호출
		kaup2.setName(name);
		kaup2.setHeight(height);
		kaup2.setWeight(weight);
		kaup2.calcResult();
		//출력
		System.out.println(kaup2.toString());
	}
}
