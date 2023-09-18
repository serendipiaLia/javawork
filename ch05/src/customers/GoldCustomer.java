package customers;

//고객 - Gold고객
public class GoldCustomer extends Customer {
	double saleRatio; 	//구매 할인율
	
	public GoldCustomer() {
		customerGrade = "GOLD";
		saleRatio = 0.1; //10%
		bonusRatio = 0.02; //2%
	}

	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "GOLD";
		saleRatio = 0.1;
		bonusRatio = 0.02;
	}
	
	// 구매 가격 = 가격 - (가격 * 구매할인율)
	@Override
	public int calcPrice(int price) {
		price -= (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio); //누적해야하기 때문에 +=
		return price;
	}

}
