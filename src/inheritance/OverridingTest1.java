package inheritance;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer customerChoi = new Customer(10010, "���� �ʺ�");
		customerChoi.bonusPoint = 1000;

		VIPCustomer customerKim = new VIPCustomer(10020, "��ȣ��", 12345);
		customerKim.bonusPoint = 10000;

		int price = 10000;
		System.out.println(
				customerChoi.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customerChoi.calcPrice(price) + " ���Դϴ�. ");
		System.out
				.println(customerKim.getCustomerName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customerKim.calcPrice(price) + " ���Դϴ�. ");
	}
}
