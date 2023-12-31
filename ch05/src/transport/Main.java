package transport;

public class Main {

	public static void main(String[] args) {
		//사람 객체 생성
		Person p1 = new Person("이강인", 10000);
		Person p2 = new Person("손흥민", 20000);
		Person p3 = new Person("이나경", 30000);
		
		//버스 객체 생성
		Bus bus100 = new Bus(100);
		Bus bus66 = new Bus(66);
		
		//지하철 객체 생성
		Subway green = new Subway("2호선");
		
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p3.takeBus(bus66);
		
		p1.takeSubway(green);
		
		p1.showPersonInfo();
		p2.showPersonInfo();
		p3.showPersonInfo();
		System.out.println("=bus===============================");
		bus100.showBusInfo();
		bus66.showBusInfo();
		System.out.println("=subway=============================");
		green.showSubwayInfo();
	}
}
