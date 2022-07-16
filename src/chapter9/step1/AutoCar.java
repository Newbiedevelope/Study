package chapter9.step1;

public class AutoCar extends Car {

	@Override
	public void refuel() {
		System.out.println("천연 가스를 충전합니다.");
	}

	@Override
	public void run() {
		System.out.println("차가 달립니다.");
	}

	public void takeLoad() {
		System.out.println("짐을 싣습니다.");
	}
}
