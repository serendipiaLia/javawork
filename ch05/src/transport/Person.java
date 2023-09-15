package transport;

//(자료형) 사람 클래스
public class Person {
	//필드
	String name;	//이름
	int money;		//가진 돈
	
	public Person(String name, int money) {	//외부에서 만들어서 가져옴
		this.name = name;
		this.money = money;
	}
	
	//버스를 탄다
	public void takeBus(Bus bus) { //매개변수로 클래스 이름 Bus가 들어갈 수 있음
		bus.take(1500);		//버스 요금을 내고
		this.money -= 1500;  //요금만큼 가진 돈 차감 == this.money - 1500;
	}
	
	//지하철을 탄다
	public void takeSubway(Subway subway) {
		subway.take(1350);
		this.money -= 1350;
	}
	
	//사람의 정보
	public void showPersonInfo() {
		System.out.printf("%s님의 잔액은 %,d원 입니다.\n" , name, money);
	}
	
}
