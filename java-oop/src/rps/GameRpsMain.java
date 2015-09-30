package rps;

import java.util.Scanner;

public class GameRpsMain {
	/**
	 * [결과]
	 * 컴퓨터는 바위고 당신은 가위이므로 컴퓨터가 이겼습니다.
	 */
	public static void main(String[] args) {
		System.out.println("가위바위보 게임을 시작합니다.");
		Scanner scanner = new Scanner(System.in);
		GameRpsValidation valid = new GameRpsValidation();
		GameRpsService service = new GameRpsServiceImpl(); //깊은 복사(deep copy)
		while (true) {
			System.out.println("1.가위 2.바위 3.보자기 를 입력하세요.");
			int userVal = scanner.nextInt();
			if(valid.showRange(userVal).equals("정상")){
				service.playGame(userVal);
				System.out.println(service.getResult());
			}else {
				System.out.println(valid.showRange(userVal));
			}
		}
	}
}
