package chapter9.step2;

public class Genesis extends Car {
	@Override
	public void turnOn() {
		System.out.println("Genesis 시동을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Genesis 시동을 끕니다.");
	}

	@Override
	public void goCar() {
		System.out.println("Genesis 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Genesis 멈춥니다.");
	}
}
