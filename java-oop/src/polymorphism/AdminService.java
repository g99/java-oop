package polymorphism;

public class AdminService implements Admin {
	private Account[] accountList;
	private int count;

	public AdminService() {
		accountList = new Account[1000]; // 배열생성
		count = 0; // count 변수 초기화
	}

	@Override
	public String openAccount(String name, int money) {
		accountList[count] = new Account(); // 계좌생성후 초기화
		accountList[count].setOwnerName(name);
		accountList[count].setRestMoney(money);
		count++;
		return accountList[count - 1].toString();
	}

	@Override
	public String openAccount(String accountNo, String name, int money) {
		accountList[count] = new Account(); // 계좌생성후 초기화 + 계좌번호 입력
		accountList[count].setOwnerName(name);
		accountList[count].setRestMoney(money);
		accountList[count].setAccountNo(accountNo);
		count++;
		return accountList[count - 1].toString();
	}

	@Override
	public Account searchAccountByAccountNo(String accountNo) {
		Account searchAccount = null;
		for (int i = 0; i < count; i++) {
			if (accountList[i].getAccountNo().equals(accountNo)) {
				searchAccount = accountList[i];
			}
		}
		return searchAccount;
	}

	@Override
	public Account[] searchAccountsByName(String name) {
		int localCount = 0;
		for (int i = 0; i < count; i++) {
			if (accountList[i].getOwnerName().equals(name)) {
				localCount++;
			}
		}
		Account[] searchAccountList = new Account[localCount];
		localCount = 0;
		for (int i = 0; i < count; i++) {
			if (accountList[i].getOwnerName().equals(name)) {
				searchAccountList[localCount++] = accountList[i];
			}
		}
		return searchAccountList;
	}

	@Override
	public String closeAccount(String accountNo) {
		Account searchAccount = null;
		String name = null, result = "요청하신 계좌는 존재하지 않습니다.\n";
		for (int i = 0; i < count; i++) {
			if (accountList[i].getAccountNo().equals(accountNo)) {
				name = accountList[i].getOwnerName();
				for (int j = i; j < count; j++) {
					if (j != count - 1) {
						accountList[j] = accountList[j + 1]; //덮어써서 지워버림
					}				
				}
				result =  name + " 고객님, 요청하신 해지건이 완료되었습니다.\n";
			}
		}
		accountList[count-1] = null;
		count--;
		return result;
	}

	@Override
	public int countAll() {
		return count;
	}

	public Account[] getAccountList() {
		return accountList;
	}

	public int getCount() {
		return count;
	}

	public void setAccountList(Account[] accountList) {
		this.accountList = accountList;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
