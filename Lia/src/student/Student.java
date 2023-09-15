package student;
// 이름, 학년, 반 
// 클래스 3가지 요소 : 필드, 생성자, 메서드
// 생성자 2가지 경우 : 기본 생성자, 매개변수가 있는 생성자
public class Student {  	
	//필드 
	String name;
	int grade;
	int studentClass;
	
	//기본 생성자
	public Student() {} // 뮤조건 생략가능!
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	
	public int getStudentClass() {
		return studentClass;
	}
	
	//메서드 (함수)
	public void showStudentInfo() {
		System.out.println("이름 : " + name + ", 학년 : " + grade + ", 반 :" + studentClass);
	}
	
	//매개변수가 있는 생성자
	public Student(String name, int grade, int studentClass) {
		this.name = name;
		this.grade = grade;
		this.studentClass = studentClass;
	}
	
	
		
	}
	
	
	

