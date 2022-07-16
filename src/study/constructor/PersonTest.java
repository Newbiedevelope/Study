package study.constructor;

public class PersonTest {
	public static void main(String[] args) {
		Person personChoi = new Person();
		personChoi.name = "choi";

		System.out.println(personChoi.name);
		Person personKim = new Person("±è¿¹Âù");
		{

			System.out.println(personKim.name);
		}
		Person personPark = new Person(906);
		{

			System.out.println(personPark.weight);
		}
		Person personLee = new Person(180.1f);
		{
			System.out.println(personLee.height);
		}
	}
}
