package cooperation;

public class Taxi {
	int money;
	int passengerCount;



	public void take(int money) {
		this.money += 10000;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println(" �ý��� �°��� " + passengerCount + " ���̰�, ������ " + money + " �Դϴ�. ");
	}

}
