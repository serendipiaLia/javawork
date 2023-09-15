package kr.or.iei.model;
//회원정보를 배열에 저장한 후 전체회원 정보를 출력하는 코드를 작성하였으나, 정상적으로 동작하지 않았다.
//아래 소스코드를 확인하여 문제가 발생한 원인과 조치내용(수정된 소스코드)를 작성하시오.
public class User {
	// 예상결과 , 아이디, 비밀번호, 이름, 나이, 전화번호
	//			user01 pass01 유저1 23 01011112222
	//			user02 pass02 유저2 27 01022223333
	//			user03 pass03 유저3 34 01033334444
	private String id; //ok get,set
	private String pwd; //ok
	private String name; // ok
	private int age;	//ok
	private String phone; //ok
	
	//매개변수 
	public User(String id, String pwd, String name, int age, String phone) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	//메서드 getter 먼저사용 setter
	public String getId() {	
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	@Override
	public String toString() {
		return "id : " + id + ",pwd : " + pwd + ",name : " + name + ", age : " 
				+ age + ", phone :" + phone;
	}
	
	
	
}