package polymorphism;

public class AdminService implements Admin{
	private Account[] accountList;
	private int count;

	public AdminService() {
		// TODO Auto-generated constructor stub
		accountList = new Account[1000];
	}
	
	@Override
	public String openAccount(int accountNo, String name, int restMoney) {
		// TODO Auto-generated method stub
		Account account = new Account();
		String msg = "";
		//account.setAccountNo(accountNo);
		account.setOwnerName(name);
		account.setRestMoney(restMoney);
		accountList[count] = account;
		count++;
		msg = account.toString();
		return msg;
	}
	
	@Override
	public Account searchAccountByAccountNo(int accountNo) {
		// TODO Auto-generated method stub
		Account searchAccount = null;
		for (int i = 0; i < count; i++){
		//난 스트링이라그럼
		//	if(accountList[i].getAccountNo() == accountNo){
				searchAccount = accountList[i];
			}

		return null;//searchAccount;
	}

	@Override
	public Account[] searchAccountsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String closeAccount(int accountNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
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
