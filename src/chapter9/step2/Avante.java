package chapter9.step2;

public class Avante extends Car {
	@Override
	public void turnOn() {
		System.out.println("Avante �õ��� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Avante �õ��� ���ϴ�.");
	}

	@Override
	public void goCar() {
		System.out.println("Avante �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("Avante ����ϴ�.");
	}
}
