package inheritance;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;

		Customer customer1 = new Customer(10010, "���� �ʺ�");
		System.out.println(
				customer1.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customer1.calcPrice(price) + " ���Դϴ�. ");

		VIPCustomer customer2 = new VIPCustomer(10020, "��ȣ��", 12345);
		System.out.println(
				customer2.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customer2.calcPrice(price) + " ���Դϴ�. ");

		Customer customer3 = new VIPCustomer(10030, "�ƹ���", 1234);
		System.out.println(
				customer3.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customer3.calcPrice(price) + " ���Դϴ�. ");
	}
}
