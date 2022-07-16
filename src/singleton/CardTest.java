package singleton;

public class CardTest {
	public static void main(String[] args) {
		Card shinhan = new Card();
		Card woori = new Card();
		System.out.println(shinhan.getCardNum());
		System.out.println(woori.getCardNum());
	}

}
