package polymorphism;

import java.util.Scanner;

public class BankService implements Bank {
	Account account = new Account();

	@Override
	public String deposit(int money) {
		String result = "";
		if (money > 0) {
			account.restMoney = account.restMoney + money;
			result = money + " 입금완료.";
		} else {
			result = "잘못된 금액입력";
		}
		return result;
	}

	@Override
	public String withdraw(int money) {
		String result = "";
		if ((account.restMoney - money) < 0) {
			result = "잔액 초과로 불가";
		} else {
			account.restMoney -= money;
			result = money + " 출금완료.";
		}
		return result;
	}

	@Override
	public String search() {
		return "잔액 : " + account.getRestMoney() + "원";
	}

	@Override
	public String open(String name, String password) {
		account.setOwnerName(name);
		account.setPassword(password);
		return name + "님의 " + "계좌번호는 " + account.getAccountNo() + "입니다.";
	}
}
