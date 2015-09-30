package inheritance;

import java.util.Scanner;

/**
 * @file_name : Phone.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 30.
 * @story : 상속예제
 */
public class PhoneMain {
	public static void main(String[] args) {
		/**
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		Phone phone = new Phone(); // 타입 인스턴스(객체) = new 생성자
		Phone androidPhone = new AndroidPhone();
		Phone iphone = new Iphone();
		Phone nokia = new CelPhone();
		System.out.println("안드로이드폰으로 통화할 사람");
		String name = scanner.next();
		System.out.println("보낼 메시지 입력");
		String msg = scanner.next();
		System.out.println("화면 사이즈");
		String size = scanner.next();
		((AndroidPhone) androidPhone).setData(msg, name, size);
		System.out.println(((AndroidPhone) androidPhone).getData());
		System.out.println("=======================================");

		System.out.println("아이폰으로 통화할 사람");
		name = scanner.next();
		System.out.println("보낼 메시지 입력");
		msg = scanner.next();
		((Iphone) iphone).setData(msg, name);
		System.out.println(((Iphone) iphone).getData());
		System.out.println("=======================================");

		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany() + "를 사용합니다.");
		System.out.println("휴대폰으로 통화할 사람");
		nokia.setCall(scanner.next());
		System.out.println(nokia.getCall());
		System.out.println("=======================================");

		phone.setCompany("삼성 집전화기");
		System.out.println(phone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람");
		phone.setCall(scanner.next());
		System.out.println(phone.getCall());
		scanner.close();
	}
}

class AndroidPhone extends Iphone {
	public static String BRAND = "안드로이드폰"; // 오버라이딩
	private String size, data;

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setData(String data, String name, String size) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		super.setData(data);
		this.setSize(size);
		this.data = super.getCompany() + "\t" + super.getMove() + "\t" + super.getCall() + "\t" + "대화면 "
				+ this.getSize() + "로 볼수 있음\t" + data + " : 카톡메시지 전달";
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return this.data;
	}
}

class Iphone extends CelPhone {
	private String data;
	public static String BRAND = "아이폰"; // static은 고정된 이란 의미로
	// static이 붙은 변수는 클래스변수라고 한다.
	public static boolean TRUE = true;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setData(String data, String name) { // 오버로딩
		super.setCompany(BRAND); // 애플의 브랜드명은 무조건 아이폰
		super.setPortable(TRUE); // 애플은 무조건 휴대폰
		super.setCall(name);
		this.data = super.getCompany() + "\t" + super.getMove() + "\t" + super.getCall() + "\t" + data + " : 메시지 전달";
	}
}

class Phone { // 하나의 자바파일에 public 클래스는 하나만 있어야 함.
	private String company, call; // 인스턴스 변수
	final static double TAX_RATE = 0.095; // 스태틱 변수 => 전역변수
											// Phone이라는 클래스의 지배를 받지 않음
											// main과 함께 생성

	public String getCompany() {
		return company;
	}

	public String getCall() {
		return call;
	}

	public void setCompany(String company) { // 지역변수
		this.company = company;
	}

	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}

}

class CelPhone extends Phone {
	private boolean portable; // 이동성.. 가지고 다닐수 있는지 여부
	private String move;

	public boolean isPortable() { // boolean형의 get은 is로 바뀜!!!
		return portable;
	}

	public String getMove() {
		return move;
	}

	public void setPortable(boolean portable) {
		if (portable) {
			this.setMove("폰을 가지고 다닐 수 있음");
		} else {
			this.setMove("폰을 가지고 다닐 수 없음");
		}
		this.portable = portable;
	}

	public void setMove(String move) {
		this.move = move;
	}
}