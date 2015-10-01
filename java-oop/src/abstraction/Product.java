package abstraction;

/**
 * @file_name : Product.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 10. 1.
 * @story : 제품을 추상클래스로 만든 예제
 */
public abstract class Product {
	protected String company;
	protected String name;
	protected String serialNo;

	public void setProductInfo(String company, String name, String serialNo) { // 구상메소드 concrete method
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
	}
	public abstract String display(); // 추상 메소드 (메소드 바디가 없음) == abstract method
}
