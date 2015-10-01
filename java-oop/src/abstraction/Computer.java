package abstraction;

public class Computer extends Product{
	protected String cpu;
	protected String ram;
	protected String hdd;
	
	public void setComputerInfo(String company, String name, String serialNo, String cpu, String ram, String hdd) {
		super.setProductInfo(company, name, serialNo);
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}
	
	@Override
	public String display() {
		
		return    "제조회사 : " + super.company +"\n"
				+ "제 품 명 : " + super.name + "\n"
				+ "고유번호 : " + super.serialNo + "\n"
				+ "C  P  U  : " + this.cpu + "\n"
				+ "R  A  M  : " + this.ram + "\n"
				+ "H  D  D  : " + this.hdd;
	}

}
