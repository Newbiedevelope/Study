package chapter9.step2;

public class Sonata extends Car {
	@Override
	public void turnOn() {
		System.out.println("Sonata �õ��� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata �õ��� ���ϴ�.");
	}

	@Override
	public void goCar() {
		System.out.println("Sonata �޸��ϴ�.");
	}

	@Override
	public void stop() {
		System.out.println("Sonata ����ϴ�.");
	}
}
