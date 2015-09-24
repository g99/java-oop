package inheritance;

import polymorphism.Account;

public class MinusAccount extends Account{
	public static final String BANK_NAME = "러쉬앤캐시";
	public void loan(int money){
		if(this.restMoney - money < -3000000){
		}else {
			this.restMoney = this.restMoney - money;
		}
	}

}
