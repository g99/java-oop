package encapsule;

public class Card {
	
	public Card(String name, String kind) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.kind = kind;
	}
	
	private String kind; //카드무늬 (스페이드, 다이아, 하트, 클로버)
	private String name;
	private String result;
	private int number; //카드번호(1~13)
	static int WIDTH = 100; //카드 가로길이
	static int HEIGHT = 180; //카드 세로길이
	
	public int drawCard() {
		// TODO Auto-generated method stub
		this.number = (int) (Math.random() * 13 + 1);
		return this.number; 
	}
	
	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public int getNumber() {
		return number;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return result = "당신의 카드는 " + kind + "이고 " + number +"번 입니다.";
	}
}
