package singleton.student;

public class School {
	private static School instance; // instance 멤버변수 (필드)
	
	private School() {} // 기본생성자
	
	//instance 생성 메서드 !
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}
	//학생 클래스 생성
	public Student studentNumber() {
		Student number = new Student();
		return number;
	}
	
}
