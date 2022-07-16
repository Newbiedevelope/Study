package cooperation;

public class Taxi {
	int money;
	int passengerCount;



	public void take(int money) {
		this.money += 10000;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(" 택시의 승객은 " + passengerCount + " 명이고, 수입은 " + money + " 입니다. ");
	}

}
