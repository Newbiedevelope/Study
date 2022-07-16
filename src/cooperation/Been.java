package cooperation;

public class Been {
	int money;

	public Been() {

	}

	public void sellAmericano(int money) {
		this.money = money;
	}

	public void sellLatte(int money) {
		this.money += money;
	}
}
