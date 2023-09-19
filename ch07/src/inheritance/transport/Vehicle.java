package inheritance.transport;

public class Vehicle {
	//필드
	String vehicleName;	//차량 이름
	int money;	//수입
	int passengerCount;	//승객수
	
	//생성자
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	//메서드 - 태우다
	public void carry(int fare) { //요금(fare)
		this.money += fare; // 요금(fare)을 받아서 money(수입)에 더해주기
		passengerCount++;
	}
	//차량 정보
	public void showInfo() { // %s = string , %d = decimal정수
		System.out.printf("%s의 수입은 %,d원이고, 승객수는 %d명 입니다.\n", 
				vehicleName, money, passengerCount);
	}



}
