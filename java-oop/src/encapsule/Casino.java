package encapsule;

public class Casino {
	private String result;
	private Card player1; //유저1
	private Card player2; //유저2
	
	public Casino(Card player1, Card player2) {
		// TODO Auto-generated constructor stub
		this.player1 = player1;
		this.player2 = player2;
	}
	public void game(){
		if(player1.drawCard() > player2.drawCard()){
			result = player1.getName() + " Win!!!";
		}else if (player1.drawCard() < player2.drawCard()) {
			result = player2.getName() + " Win!!!";
		}else {
			result = "Draw!!!";
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return result;
	}
}
