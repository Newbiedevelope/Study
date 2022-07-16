package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentChoi = new Student("Choi", 5000);
		Student studentKim = new Student("Kim", 10000);

		Bus bus6628 = new Bus(6628);
		studentChoi.takeBus(bus6628);
		studentChoi.showInfo();
		bus6628.showInfo();

		Subway subwayPurple = new Subway("5È£¼±");
		studentKim.takeSubway(subwayPurple);
		studentKim.showInfo();
		subwayPurple.showInfo();
	}
}
