package encapsule;

public class Pay {
	//멤버 필드
	private final double TAX_RATE = 0.097; //인스턴스변수
	private String name;
	private int salary;
	private String result;
	
//	//생성자
//	public Pay() {
//		//디폴트 생성자
//	}
//	
	public Pay(int salary, String name){
		this.name = name;
		this.salary = salary;
	}
	
	//멤버 메소드
	public void calc() {
		// TODO Auto-generated method stub
		result = (int) (salary * TAX_RATE) + "";
	}

	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String getResult() {
		return result;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + "님이 납부하실 세금은 " + result + "원 입니다.";
	}
}
