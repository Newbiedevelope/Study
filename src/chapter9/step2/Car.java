package chapter9.step2;

public abstract class Car {
	public abstract void turnOn();

	public abstract void turnOff();

	public abstract void goCar();

	public abstract void stop();

	public void wash() {
		System.out.println("������ �մϴ�.");
	}

	final public void run() {
		turnOn();
		goCar();
		stop();
		turnOff();
		wash();
	}
}
