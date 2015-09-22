package encapsule;

/**
 * @file_name : ArrayTest.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 21.
 * @story : Array 응용문제 - Money 금액을 화폐단위별로 분류
 */

public class Money {
	/**
	 * 예를 들어서 134,530원 이면 돈을 화폐 단위로 표시해주면 됨. ex) 5만원 2, 1만원 3, 천원 4 ... (10원 미만은
	 * 절삭)
	 */

	public String[] countMoney(int money) {
		int[] moneyUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
		int[] moneyCount = new int[moneyUnit.length];
		String[] results = new String[moneyUnit.length];
		for (int i = 0; i < moneyUnit.length; i++) {
			moneyCount[i] = money / moneyUnit[i];
			money %= moneyUnit[i];
			results[i] = moneyUnit[i] + "원 : " + moneyCount[i] + "개"; //promotion으로 전부 literal로 바뀜
		}
		return results;
	}
}
