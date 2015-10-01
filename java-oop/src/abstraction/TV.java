package abstraction;

public class TV extends Product {
	protected String size;
	protected String screen;

	public void setTVInfo(String company, String name, String serialNo, String size, String screen) {
		super.setProductInfo(company, name, serialNo);
		this.size = size;
		this.screen = screen;
	}

	@Override
	public String display() {
		return    "제조회사 : " + super.company +"\n"
				+ "제 품 명 : " + super.name + "\n"
				+ "고유번호 : " + super.serialNo + "\n"
				+ "인    치 : " + this.size + "\n"
				+ "화    면 : " + this.screen;
	}

}
