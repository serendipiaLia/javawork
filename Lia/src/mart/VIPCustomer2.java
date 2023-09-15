package mart;
	//필드, 생성자, 메서드 
	//고객이름, 고객등급, 고객아이디, 고객 주소, 보너스포인트 , 보너스적립율
	//제품살때 10%할인 , 보너스포인트 5%적립, 담당전문상담원 배정
public class VIPCustomer2 {
	// 필드
	private String name;
	private String grade;
	private String id;
	private String address;
	int point; 	//보너스포인트
	double ratio;	//보너스적립율
		
	//vip 구현하는 변수 : 상담원, 할인율
	private String agent;
	double sale; //할인율
	
	//기본생성자(디폴트생성자) : 등급, 10%할인율, 보너스포인트 적립5%
	public VIPCustomer2() {
		grade = "VIP";
		sale = 0.1;
		ratio = 0.05;
	}
	
	// += 복합연산자 : num1 += 2;  == num1 = num1 + 2;
	//VIP 메서드 : 적립되는포인트계산 = 가격* 적립율 
	public int calcPrice(int price) {
		point += price * ratio; 
		return price - (int)(price * sale); 
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
	
	
	


}
