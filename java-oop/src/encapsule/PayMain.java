package encapsule;

import java.util.Scanner;

/**
 * @file_name : PayMain.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 23.
 * @story     : 세금 공제한 실급여 환산 프로그램
 */
public class PayMain {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 연봉을 입력받아서
	 * 연봉 ***만원을 받으시는 XXX님께서 납부할 세금은 ???만원 입니다.
	 * 로 출력하는 프로그램을 만들어 주세요.
	 * 단) 세율이 정권이 바뀔 때 마다 변하니,
	 * 관리자가 쉽게 적용가능하도록 만들어 주세요.
	 * 현 정권은 세율이 9.7프로라고 합니다.
	 */
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		String name;
		int salary;
		Pay pay = new Pay(3600,"홍길동"); //생성자를 이용해 인자값을 초기화
//		System.out.print("이름 : ");
//		name = scanner.next();
//		System.out.print("연봉 : ");
//		salary = scanner.nextInt();
//		pay.setName(name);
//		pay.setSalary(salary);
		pay.calc();
		System.out.println(pay.toString());
	}
}
