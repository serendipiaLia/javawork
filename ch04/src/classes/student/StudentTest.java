package classes.student;

public class StudentTest {

	public static void main(String[] args) {
		// Student 객체(변수) 생성 (Student클래스에 활력넣기)
		// new를 사용하면 메모리에서 heap영역에 저장되어 사용가능!
		// 자료를 사용할 때, 점. 연산자로 접근함
			
		//Student는 class객체, student1은 변수
		Student student1 = new Student();
		student1.name = "홍길동";
		student1.studentId = 101;
		student1.grade = 1;
		student1.showStudentInfo();
		
		/* System.out.println(student1.name);
		System.out.println(student1.studentId);
		System.out.println(student1.grade); */
		
		System.out.println("========================");
		
		Student student2 = new Student();
		student2.name = "이나경";
		student2.studentId = 618;
		student2.grade = 2;
		
		System.out.println("이름 : " + student2.name);
		System.out.println("학번 : " + student2.studentId);
		System.out.println("학년 : " + student2.grade);
		
	} //m
}
