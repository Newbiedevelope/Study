package withArrayList;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customer1 = new Customer(10010, "개발 초보");
		Customer customer2 = new Customer(10020, "간호사");
		Customer customer3 = new GoldCustomer(10030, "아무개");
		Customer customer4 = new GoldCustomer(10040, "홍길동");
		Customer customer5 = new VIPCustomer(10050, "척준경", 12345);

		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);

		System.out.println("===== 고객 정보 출력 =====");
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}

		System.out.println("===== 할인율과 보너스 포인트 계산 =====");
		int price = 10000;
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + " 님이 " + cost + " 원 지불하셨습니다. ");
			System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + " 입니다. ");
		}
	}
}
