package singleton;

public class Company {
	//싱글톤 코딩 디자인 패턴 사용
	//멤버 변수가 객체 인스턴스
	//static을 활용함 - new로 생성하지 않음
	//클래스 이름으로 직접 접근 -> public static Company
	private static Company instance; //instance 멤버변수(==필드)
	
	private Company () {} //생성자 private 사용 
	
	//private 접근을 위해 getter setter 사용
	public static Company getInstance() { //public static Company 이름으로 직접 접근!
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
