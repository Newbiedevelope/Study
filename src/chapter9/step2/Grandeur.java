package chapter9.step2;

public class Grandeur extends Car {
	@Override
	public void turnOn() {
		System.out.println("Grandeur �õ��� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Grandeur �õ��� ���ϴ�.");
	}

	@Override
	public void goCar() {
		System.out.println("Grandeur �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("Grandeur ����ϴ�.");
	}
}
