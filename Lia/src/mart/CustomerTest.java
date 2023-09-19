package mart;
	//일반고객: 이름 '이순신' , 아이디 '10010' 누적된 포인트'1000점'
	//vip고객: 이름 '김유신' , 아이디 '10020' 누적된 포인트 '10000점'
public class CustomerTest {
	public static void main(String[] args) {
		//일반고객 불러오기 (매개변수 생성자)
		Customer customerLee = new Customer("이순신", "10010", "서울시 마포구");
		
		/*(기본생성자 불러오기)
	 	customerLee.name = "이순신";
		customerLee.id = "10010";
		customerLee.address = "서울시 마포구";
		customerLee.point = 1000; */
		
		customerLee.point = 1000;
		customerLee.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerLee.name + "님의 지불할 금액은 " 
		 + customerLee.calcPrice(20000) + "원 입니다.");
		
		
		//(매개변수) VIP고객 불러오기
		VIPCustomer customerKim = new VIPCustomer("김유신", "10020", "경기도 부천", "Lia");
	
		/*(vip기본생성자 불러오기)
		customerKim.name = "김유신";
		customerKim.id = "10020";
		customerKim.address = "경기도 부천";
		customerKim.point = 10000; */
		
		customerKim.point = 1000;
		customerKim.calcPrice(10000);
		
		System.out.println(customerKim.showVIPCustomerInfo());
		System.out.println(customerKim.name + "님의 지불할 금액은 " 
		+ customerKim.calcPrice(20000) + "원 입니다.");
		// 결과값 : 김유신님의 등급은 VIP이며, 아이디는 10020입니다.
		// 가입 시 입력하신 고객 주소는 경기도 부천이며, 누적된 포인트는 10000점 입니다. 
	
	
	
	
	
	}
	
	
}
