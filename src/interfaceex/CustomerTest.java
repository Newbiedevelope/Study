package interfaceex;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer();

		Buy buyer = c1;
		buyer.buy();
		buyer.order();

		Sell seller = c1;
		seller.sell();
		seller.order();

		if (seller instanceof Customer) {
			Customer c2 = (Customer) seller;
			c2.buy();
			c2.sell();
		}

		c1.order();
	}
}
