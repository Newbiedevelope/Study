package template;

public class CarTest {
	public static void main(String[] args) {
		System.out.println("== ���� �����ϴ� �ڵ��� ==");
		Car myCar = new AICar();
		myCar.run();

		System.out.println("== ����� �����ϴ� �ڵ��� ==");
		Car yourCar = new ManualCar();
		yourCar.run();
	}
}
