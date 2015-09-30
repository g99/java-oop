package polymorphism;
/**
 * @file_name : RoleMain.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 30.
 * @story     : 객체지향 특성을 모두 설명하는 간단한 예제
 */
public class RoleMain {
	/**
	 * 은닉화 : 객체의 속성과 행위를 하나로 묶고, 실제 구현 내용 일부를 외부에 감추어 은닉한다.
	 * 상  속 : 새로운 클래스가 기존의 클래스의 자료와 연산을 이용할 수 있게 하는 기능
	 * 추상화 : 불필요한 정보는 숨기고 중요한 정보만을 표현함으로써 프로그램을 간단히 만드는 것
     * 다형성 : 부모 객체에서 자식클래스들의 인스턴스를 담는 표현방식
	 */
	public static void main(String[] args) {
		//다형성, 은닉화
		Human husband = new Husband();
		Human employee = new Employee();
		Human father = new Father();
		Human[] human = {husband, employee, father};
		Man[] man = {new Husband(), new Employee(), new Father()}; //배열이기 때문에 성립가능
		
		for (int i = 0; i < human.length; i++) {
			human[i].role();
			human[i].worry();
		}
		for (int i = 0; i < man.length; i++) {
			man[i].role();
			man[i].worry();
			man[i].setAge(15);
			man[i].getAge();
		}
 	}
}

interface Human{
	public void role();
	public void worry();
}

class Man implements Human{
	public int age;
	public int getAge() {
		System.out.println("나이는 : " + age );
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void role() {
		System.out.println("남자 역할");
	}

	@Override
	public void worry() {
		System.out.println("남자만의 고민");
		
	}
}

class Husband extends Man{
	@Override
	public void role() {
		System.out.println("남편 역할");
	}
	public void worry(){
		System.out.println("남편만의 고민");
	}
}

class Employee extends Man{
	@Override
	public void role() {
		System.out.println("직원 역할");
	}
	public void worry(){
		System.out.println("직장인의 고민");
	}
}

class Father extends Man{
	@Override
	public void role() {
		System.out.println("아버지 역할");
	}
	public void worry(){
		System.out.println("아버지의 고민");
	}
}