package chapter9.step1;

public class Bus extends Car {

	@Override
	public void refuel() {
		System.out.println("�ֹ����� �����մϴ�.");
	}

	public void takePassenger() {
		System.out.println("�°��� ������ �¿�ϴ�.");
	}

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

}
