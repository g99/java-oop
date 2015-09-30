package rps;

/**
 * @file_name : GameRpsValidation.java
 * @author : g9yong44@gmail.com
 * @date : 2015. 9. 30.
 * @story : 유효성 체크 클래스
 */
public class GameRpsValidation {
	public String showRange(int num) {
		if (num >= 1 && num <= 3) {
			return "정상";
		}else {
			return "1부터 3까지의 값만 입력하셔야 합니다.\n";
		}
	}
}
