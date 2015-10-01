package abstraction;

public class Himart {
	public static void main(String[] args) {
		TV tv = new TV();
		tv.setTVInfo("LG", "TV", "lg1234", "50인치", "올레드");
		Computer computer = new Computer();
		computer.setComputerInfo("삼성", "컴퓨터", "sm1234", "512GHz", "8G", "1TB");
		SmartPhone phone = new SmartPhone();
		phone.setSmartPhoneInfo("샤오미", "스마트폰", "s-1234", "1024만화소", "500g");
		Product[] products = {tv, computer, phone};
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}
	}
}
