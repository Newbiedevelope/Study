package polymorphism;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setCustomerID(10010);
		customer1.setCustomerName("개발 초보");
		customer1.bonusPoint = 1000;

		System.out.println(customer1.showCustomerInfo());

		Customer customer2 = new VIPCustomer(10020, "간호사", 12345);
		customer2.bonusPoint = 1000;

		System.out.println(customer2.showCustomerInfo());
		System.out.println("===== 할인율과 보너스 포인트 계산 =====");

		int price = 10000;
		int price1 = customer1.calcPrice(price);
		int price2 = customer2.calcPrice(price);

		System.out.println(customer1.getCustomerName() + " 님이 " + price1 + " 원 지불하셨습니다. ");
		System.out.println(customer1.showCustomerInfo());
		System.out.println(customer2.getCustomerName() + " 님이 " + price2 + " 원 지불하셨습니다. ");
		System.out.println(customer2.showCustomerInfo());
	}
}
