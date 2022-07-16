package inheritance;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;

		Customer customer1 = new Customer(10010, "개발 초보");
		System.out.println(
				customer1.getCustomerName() + " 님이 지불해야 하는 금액은 " + customer1.calcPrice(price) + " 원입니다. ");

		VIPCustomer customer2 = new VIPCustomer(10020, "간호사", 12345);
		System.out.println(
				customer2.getCustomerName() + " 님이 지불해야 하는 금액은 " + customer2.calcPrice(price) + " 원입니다. ");

		Customer customer3 = new VIPCustomer(10030, "아무개", 1234);
		System.out.println(
				customer3.getCustomerName() + " 님이 지불해야 하는 금액은 " + customer3.calcPrice(price) + " 원입니다. ");
	}
}
