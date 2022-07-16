package singleton;

public class Card {
	private static int serialNum = 1000;
	private int cardNum;

	public Card() {
		serialNum++;
		cardNum = serialNum;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int number) {
		this.cardNum = number;
	}

}
