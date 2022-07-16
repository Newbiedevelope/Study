package interfaceex;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("¾î¸° ¿ÕÀÚ1");
		shelfQueue.enQueue("¾î¸° ¿ÕÀÚ2");
		shelfQueue.enQueue("¾î¸° ¿ÕÀÚ3");

		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
