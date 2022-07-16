package polymorphism;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		customer1.setCustomerID(10010);
		customer1.setCustomerName("���� �ʺ�");
		customer1.bonusPoint = 1000;

		System.out.println(customer1.showCustomerInfo());

		Customer customer2 = new VIPCustomer(10020, "��ȣ��", 12345);
		customer2.bonusPoint = 1000;

		System.out.println(customer2.showCustomerInfo());
		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");

		int price = 10000;
		int price1 = customer1.calcPrice(price);
		int price2 = customer2.calcPrice(price);

		System.out.println(customer1.getCustomerName() + " ���� " + price1 + " �� �����ϼ̽��ϴ�. ");
		System.out.println(customer1.showCustomerInfo());
		System.out.println(customer2.getCustomerName() + " ���� " + price2 + " �� �����ϼ̽��ϴ�. ");
		System.out.println(customer2.showCustomerInfo());
	}
}
