package mart;
	//필드, 생성자, 메서드 
	//고객이름, 고객등급, 고객아이디, 고객 주소, 보너스포인트 , 보너스적립율
	//제품살때 10%할인 , 보너스포인트 5%적립, 담당전문상담원 배정
public class VIPCustomer extends Customer{

	//vip 구현하는 변수 : 상담원, 할인율
	private String agent;
	double sale; //할인율
	
	//기본생성자(디폴트생성자) : 등급, 10%할인율, 보너스포인트 적립5%
	public VIPCustomer(String name, String id, 
			String address, String agent) { //매개변수
		super(name, id, address); //customer상위클래스에서 불러온 매개변수
		this.agent = agent;
		grade = "VIP";
		sale = 0.1;
		ratio = 0.05;
	}
	
	// += 복합연산자 : num1 += 2;  == num1 = num1 + 2;
	//VIP 메서드 : 적립되는포인트계산 = 가격* 적립율 
	@Override
	public int calcPrice(int price) {
		point += price * ratio; //보너스포인트 적립
		return price - (int)(price * sale); //메서드재정의:할인된 가격을 계산하여 반환
	} // 10000price - 1000(price * sale)
	
	public String agent() {
		return agent;
	}
	
	//저장이나 출력하는 메서드 
	public String showVIPCustomerInfo () {
		return name + "님의 등급은 " + grade + "이며, 아이디는 " + id 
				+ "입니다. 가입 시 입력하신 고객 주소는 " + address + "이며, 누적된 포인트는 "
				+ point + "점 입니다. 담당 전문 상담원은 " + agent + "입니다.";
	}
	//public String showVIPCustomerInfo() { 
	//  	return super.showCustomerInfo() + "담당 상담원아이디는 " + agent + "입니다.";}
	
	//상위클래스 Customer의 출력메서드가 하위클래스와 같은 내용일때 super()로 불러올수있음!!
	
	
	


}
