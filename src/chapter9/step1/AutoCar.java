package chapter9.step1;

public class AutoCar extends Car {

	@Override
	public void refuel() {
		System.out.println("õ�� ������ �����մϴ�.");
	}

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	public void takeLoad() {
		System.out.println("���� �ƽ��ϴ�.");
	}
}
