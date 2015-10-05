package statics;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @file_name : Statics.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 5.
 * @story : 스태틱 초기화 블록
 */
public class Statics {
	/**
	 * 스태틱 초기화 블록 - 생성자보다 먼저 호출되는 블록이다. A a = new A()와 상관없이 초기화 작업을 위해 만들어진 블록
	 * 힙영역과 상관없이 스태틱 영역에서 초기화 되는 것이다.
	 */
	public static void main(String[] args) {
		System.out.println("메인을 타고 들어옴");
		Box box = new Box(); 
//		System.out.println("스태틱 필드 값 : " + Box.name);
	}
}

class Box {
	public static String name = "한빛학원"; // 스태틱은 고정된 값이기 때문에 반드시 값이 할당되어야 함.
	// 그렇다면 final과 차이점이 무엇일까?
	// 메모리에 저장되는 장소가 다르다. 또한 static은 먼저 메모리공간을 점유한다.

	public Box() { //생성될때 static -> 인스턴스 -> 생성자 순으로 생성
		System.out.println("기본 생성자");
	}

	static { // 생성될때 가장먼저 딱 한번만 호출됨
		System.out.println("스태틱 초기화 블록");
	}
		
	{ // 생성될때마다 생성자보다 앞서서 출력됨
		System.out.println("인스턴스 초기화 블록");
	}
	
	public String getName() {
		return "한빛 인스턴스";
	}
}