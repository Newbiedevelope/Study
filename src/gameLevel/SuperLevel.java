package gameLevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("아주 빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 상급자 레벨입니다. *****");
	}

}
