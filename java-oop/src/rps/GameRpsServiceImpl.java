package rps;

public class GameRpsServiceImpl implements GameRpsService {
	GameRps rps = new GameRps(); // 가위바위보를 만듦
	String result;

	@Override
	public void setResult(String result) {
		this.result = result;
	}

	@Override
	public String getResult() {
		return this.result;
	}

	@Override
	public int playGame(int num) {
		rps.setComVal();
		int sum = num + rps.getComVal();
		switch (sum) {
		case 2:
			this.setResult("가위 대 가위로 비겼습니다.");
			break;
		case 3:
			this.setResult((num > rps.getComVal()) ? "가위 대 바위로 유저 승리."	: "바위 대 가위로 컴퓨터 승리.");
			break;
		case 4:
			if (rps.getComVal() == num) {
				this.setResult("바위 대 바위로 비겼습니다.");
			}
			this.setResult((num > rps.getComVal()) ? "가위 대 보로 컴퓨터 승리."	: "보 대 가위로 유저 승리.");
			break;
		case 5:
			this.setResult((num > rps.getComVal()) ? "바위 대 보로 유저 승리."	: "보 대 바위로 컴퓨터 승리.");
			break;
		case 6:
			this.setResult("보 대 보로 비겼습니다.");
			break;
		default:
			break;
		}
		return 0;
	}
}
