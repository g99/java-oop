package encapsule;

public class Kaup2 {
	private String name;
	private double height, weight;
	private String result;
	
	//읽는거
	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}
	//쓰는거
	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	public void calcResult() {
		// TODO Auto-generated method stub
		int kaupResult = (int) (weight /(height*height) * 10000);
		
		if (kaupResult >= 30) {
			result = "비만";
		}else if (kaupResult >= 20) {
			result = "정상";
		}else {
			result = "저체중";
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return result;
	}

}
