package encapsule;
/**
 * @file_name : Kaup.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 23.
 * @story     : 인스턴스변수
 */
public class Kaup {	
	private String name;
	private double height;
	private double weight;
	private String result;
	//Alt + Shift + S 를 이용하면
	//getter와 setter를 생성함
	
	public void getResult() {
		// TODO Auto-generated method stub
		int kaupResult = (int)((weight/(height*height))*10000);
		result = name + "님 의 카우프 지수는 " + kaupResult;
		if (kaupResult >= 30) {
			result = result.concat("이며 비만입니다.");
		}else if (kaupResult >= 24) {
			result = result.concat("이며 과체중입니다.");
		}else if (kaupResult >= 20) {
			result = result.concat("이며 정상입니다.");
		}else if (kaupResult >= 15) {
			result = result.concat("이며 저체중입니다.");
		}else if (kaupResult >= 13) {
			result = result.concat("이며 마름입니다.");
		}else if (kaupResult >= 10) {
			result = result.concat("이며 영양실조입니다.");
		}else {
			result = result.concat("이며 소모증입니다.");
		}
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.result;
	}
}
