package classes.student;

//참조(래퍼런스) 자료형 : 클래스어디서든 사용가능(import)
//3대 필수 요소
public class Student {
	//클래스 내부에서는 변수(필드-field)
	String name;	//학생 이름("홍길동")
	int studentId;	//학번(101)
	int grade;		//학년
	
	//함수가 아니므로 반환형이 없음
	//클래스 이름과 동일 
	//기본 생성자(매개변수 없는 생성자)는 생략가능 (컴파일러가 자동생성함)
	public Student() {} // 기본 생성자

	
	//학생의 정보를 출력하는 메서드(함수)
	public void showStudentInfo() {
		System.out.println("이름: " + name + 
				", 학번 : " + studentId + ", 학년 :" + grade);
	}
	
	
}
