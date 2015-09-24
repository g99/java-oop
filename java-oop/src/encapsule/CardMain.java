package encapsule;
/**
 * @file_name : CardMain.java
 * @author    : g9yong44@gmail.com
 * @date      : 2015. 9. 23.
 * @story     : 트럼프 게임
 */
public class CardMain {
	/**
	 * 무늬는 하트로 동일한 상태에서
	 * 두 카드의 숫자를 비교해서 더 높은
	 * 수의 카드가 이기는 게임(1~13) 
	 * int n = (int) (Math.random*10) + 1
	 */
	public static void main(String[] args) {
		Card player1 = new Card("홍길동","heart");
		Card player2 = new Card("김유신","heart");
		Casino casino = new Casino(player1,player2);
		casino.game();
		System.out.println(casino.toString());
	}
}
