package cooperation;

public class Person {
	public String personName;
	public int money;

	public Person(String name, int money) {
		this.personName = name;
		this.money = money;
	}

	public void buyStarAmericano(Star star) {
		star.sellAmericano(4000);
		this.money -= 4000;
	}

	public void buyStarLatte(Star star) {
		star.sellLatte(4500);
		this.money -= 4500;
	}

	public void buyBeenAmericano(Been been) {
		been.sellAmericano(4000);
		this.money -= 4000;
	}

	public void buyBeenLatte(Been been) {
		been.sellLatte(4500);
		this.money -= 4500;
	}

	public void showInfo() {
		System.out.println(personName + "의 남은 금액은 " + money + " 입니다. ");
	}
}
