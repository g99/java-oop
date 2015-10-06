package person;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @file_name : PersonMain.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 6.
 * @story : String 클래스 예제
 */
public class PersonMain {
	/**
	 * p1과 p2가 동일인물인지 체크하는 로직을 완성하시오 삼항연산자로 처리 바랍니다. 현재 2015년 입니다. p1의 나이는
	 * 몇살입니까? 결과물은 [ p1과 p2는 동일인물이며, 나이는 **살입니다. ]
	 */
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat today = new SimpleDateFormat("yyyy");
		Person p1 = new Person("800101-123456");
		Person p2 = new Person("800101-123456");
		Test t1 = new Test("800101-123456");
		String agePart = p1.getSsn().substring(0, 2);
		int age = 0;
		int THISYEAR = Integer.parseInt(today.format(date));
		if (p1.getSsn().charAt(7) == '1' || p1.getSsn().charAt(2) == '2') {
			age = THISYEAR - Integer.parseInt("19".concat(agePart));
		} else if (p1.getSsn().charAt(7) == '3' || p1.getSsn().charAt(2) == '4') {
			age = THISYEAR - Integer.parseInt("20".concat(agePart));
		}
		p1.setAge(String.valueOf(age));
		t1.setAge(String.valueOf(age));
		p1.setName("홍길동");
		t1.setName("홍길동");
		System.out.println(p1.getSsn().equals(t1.getSsn()) ? "[ p1과 p2는 동일인물이며, 나이는 " + age + "살입니다. ]" : "다른사람입니다.");
		if (p1.equals(p2)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		if (p1.equals(t1)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}

class Person {
	private String ssn; // 주민번호
	private String age; // 나이
	private String name; // 이름

	public Person(String ssn) { // 태어나자마자 주민번호를 부여 받는다.
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public String getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) {
			return true;
		} else {
			return false;
		}
	}
}

class Test {
	private String ssn; // 주민번호
	private String age; // 나이
	private String name; // 이름

	public Test(String ssn) { // 태어나자마자 주민번호를 부여 받는다.
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public String getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}
}