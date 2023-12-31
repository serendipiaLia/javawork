package customers;

//고객 - VIP고객
public class VIPCustomer extends Customer{
	private int agentId;	//전문 상담원 
	double saleRatio; 	//구매 할인율
	
	public VIPCustomer() {
		customerGrade = "VIP";
		saleRatio = 0.1;	//10%
		bonusRatio = 0.05;	//5%
	}
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId, customerName);
		customerGrade = "VIP";
		saleRatio = 0.1;	
		bonusRatio = 0.05;	
		this.agentId = agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	
	// 구매 가격 = 가격 - (가격 * 구매할인율)
	@Override
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio); //누적해야하기 때문에 +=
		return price;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n전문 상담원 ID는"
			+ agentId + "입니다.";
	}


}
