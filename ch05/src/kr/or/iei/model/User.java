package kr.or.iei.model; //ch05

//회원 클래스(자료형) 정의
public class User {
	//필드(속성)
	private String id;
	private String password;
	private String name;
	
	
	public User() {}  //생성자 (숨어있음) -> UserTest의 9행 ..매개변수가 있는 생성자 사용시 표출!!
	
	
	//매개변수가 있는 생성자
	public User(String id, String password, String name) { //set이 있는거임
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	
	//set+필드이름() - 입력 , get+필드이름() - 출력 함수 -> private을 사용하기 위한 함수
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
}
