package cooperation;

public class BuyCoffee {
	public static void main(String[] args) {
		Person personKim = new Person("Kim", 5000);
		Person personLee = new Person("Lee", 10000);

		Star star = new Star();
		Been been = new Been();

		personKim.buyStarAmericano(star);
		personLee.buyBeenLatte(been);

		personKim.showInfo();
		personLee.showInfo();
	}
}
