package encapsule;

public class Sum {
	
	private String result;
	private int num1; 
	private int num2;
	
	public Sum(int num1, int num2) {
		// TODO Auto-generated constructor stub
		this.num1 = num1;
		this.num2 = num2;
	}

	public void calc() {
		// TODO Auto-generated method stub
		int max = 0, min = 0, sum = 0;
		if(num1 > num2){
			max = num1;
			min = num2;
		}else {
			max = num2;
			min = num1;
		}
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		result = sum + "";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return result;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
}
