package inheritance.transport;

//(자료형) 사람 클래스
public class Person {
	//필드
	String name;	//이름
	int money;		//가진 돈
	
	public Person(String name, int money) {	//외부에서 만들어서 가져옴
		this.name = name;
		this.money = money;
	}
	
	//교통수단 이용 메서드
	public void take(Vehicle vehicle, int fare) {
		vehicle.carry(fare); 
		this.money -= fare;	// 승객이 가진돈에서 vehicle 요금(fare)빼주기!
	}

	//사람의 정보
		public void showPersonInfo() {
			System.out.printf("%s님의 잔액은 %,d원 입니다.\n" , name, money);
		}
	
	
}
