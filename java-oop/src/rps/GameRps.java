package rps;

/**
 * @file_name : GameRps.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 30.
 * @story :
 */
public class GameRps {
	int comVal; // 컴퓨터가 생성하는 랜덤 가위,바위,보

	public int getComVal() {
		return comVal;
	}

	public void setComVal() {
		this.comVal = (int) (Math.random() * 3 + 1);
		
	}
}
