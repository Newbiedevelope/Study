package chapter9.step2;

public class Genesis extends Car {
	@Override
	public void turnOn() {
		System.out.println("Genesis �õ��� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Genesis �õ��� ���ϴ�.");
	}

	@Override
	public void goCar() {
		System.out.println("Genesis �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("Genesis ����ϴ�.");
	}
}
