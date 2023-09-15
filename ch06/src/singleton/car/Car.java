package singleton.car;

public class Car {
	//필드 
	private static int serialNum = 1000; //기준 번호 - 클래스 변수
	private int carNum; // 차량번호 (인스턴스 변수)
	
	//생성자
	public Car() {
		serialNum++;
		carNum = serialNum;
	}
	
	//자동차 번호 출력 메서드 (set 사용 x)
	public int getCarNum() {
		return carNum;
	}
	
	
}
