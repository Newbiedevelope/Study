package inheritance;

public class CustomerTest1 {
	public static void main(String[] args) {
		Customer customerChoi = new Customer(10010, "개발 초보");
		System.out.println(customerChoi.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer(10020, "간호사", 10000);
		System.out.println(customerKim.showCustomerInfo());
	}
}
