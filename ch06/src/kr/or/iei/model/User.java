package kr.or.iei.model;	//ch06

//필드, 생성자, 메서드 생성!
public class User {
	//필드 : 아이디, 비밀번호, 이름 
	private String id;
	private String password;
	private String name;
	
	//기본 생성자 
	public User() {}
	
	//매개변수가 있는 생성자 
	public User(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	} 
	
	//메서드 getter, setter 사용 
	public void setId(String id) {
		this.id = id;
	}
	public String getId () {
		return id;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword () {
		return password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	
	@Override
	public String toString() {
		return "아이디: " + id + ", 비밀번호 : " + password 
				+ ", 이름 : " + name;
	}
	
	
	
}
