package gameLevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� jump�� ����� �ʾҽ��ϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("���� turn�� ����� �ʾҽ��ϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** �ʺ��� �����Դϴ�. *****");
	}

}
