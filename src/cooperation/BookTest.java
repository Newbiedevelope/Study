package cooperation;

public class BookTest {
	public static void main(String[] args) {
		Student studentEdward = new Student("Edward", 15000);
		
		Taxi taxi1 = new Taxi();
		studentEdward.takeTaxi(taxi1);
		studentEdward.showInfo();
		taxi1.showInfo();
	}
}
