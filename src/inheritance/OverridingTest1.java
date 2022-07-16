package inheritance;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer customerChoi = new Customer(10010, "개발 초보");
		customerChoi.bonusPoint = 1000;

		VIPCustomer customerKim = new VIPCustomer(10020, "간호사", 12345);
		customerKim.bonusPoint = 10000;

		int price = 10000;
		System.out.println(
				customerChoi.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerChoi.calcPrice(price) + " 원입니다. ");
		System.out
				.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + " 원입니다. ");
	}
}
