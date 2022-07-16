package inheritance;

public class VIPCustomer extends Customer {
	private int agentID; // VIP 고객 담당 상담원 아이디
	double saleRatio; // 할인율

	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

	public int getAgentID() {
		return agentID;
	}

	public String showVIPInfo() {
		return super.showCustomerInfo() + " 담당 상담원의 ID는 " + agentID + " 입니다. ";
	}
}
