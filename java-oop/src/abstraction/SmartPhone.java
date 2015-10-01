package abstraction;

public class SmartPhone extends Product{
	protected String camera, weight;
	public void setSmartPhoneInfo(String company, String name, String serialNo, String camera, String weight) {
		super.setProductInfo(company, name, serialNo);
		this.camera = camera;
		this.weight = weight;
	}
	@Override
	public String display() {
		return    "제조회사 : " + super.company +"\n"
				+ "제 품 명 : " + super.name + "\n"
				+ "고유번호 : " + super.serialNo + "\n"
				+ "카 메 라 : " + this.camera + "\n"
				+ "무    게 : " + this.weight;
	}
}
