package withArrayList;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customer1 = new Customer(10010, "���� �ʺ�");
		Customer customer2 = new Customer(10020, "��ȣ��");
		Customer customer3 = new GoldCustomer(10030, "�ƹ���");
		Customer customer4 = new GoldCustomer(10040, "ȫ�浿");
		Customer customer5 = new VIPCustomer(10050, "ô�ذ�", 12345);

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);

		System.out.println("===== �� ���� ��� =====");
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}

		System.out.println("===== �������� ���ʽ� ����Ʈ ��� =====");
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " ���� " + cost + " �� �����ϼ̽��ϴ�. ");
			System.out.println(customer.getCustomerName() + " ���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + " �Դϴ�. ");
		}
	}
}
