package encapsule;

public class Account {

	private String accountNo; // rPwhkqjsgh
	private String ownerName; // 이름
	private String password; // 비번
	private int restMoney; // 잔액
	public static final String BANK_NAME = "한빛뱅크";

	public Account(String name, String password) {
		// TODO Auto-generated constructor stub
		this.ownerName = name;
		this.password = password;
		accountNo = "";
		for (int i = 0; i < 6; i++) {
			accountNo += ((int) (Math.random() * 10) + "");
			if (i == 0 && accountNo.indexOf(0) == 0) {
				i--;
			}
		}
	}

	public void deposit(int money) {
		// TODO Auto-generated method stub
		restMoney += money;
	}

	public void withdraw(int money) {
		// TODO Auto-generated method stub
		restMoney -= money;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return BANK_NAME + "\n" + accountNo + "\t" + ownerName + "\n" + "잔액 : " + restMoney;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getPassword() {
		return password;
	}

	public int getRestMoney() {
		return restMoney;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRestMoney(int restMoney) {
		this.restMoney = restMoney;
	}

}
