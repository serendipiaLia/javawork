package inheritance.person;
//Engineer이 Person에게 상속  받음 
public class Engineer extends Person { //Person 과 상속관계 맺기
	int companyId;
	
	//매개변수 있는 생성자를 상속 받을때 super()사용
	public Engineer(String name, int age, int companyId) {	
		super(name, age);	//부모클래스 
		this.companyId = companyId;	//자식 클래스의 필드 초기화
	}
	
	public int getCompanyId() {
		return companyId;
	}
}
