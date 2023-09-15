package singleton.student;

public class StudentMain {

	public static void main(String[] args) {
		School school =  School.getInstance();
		School school2 = School.getInstance();
		
		Student myNumber = school.studentNumber();
		Student yourNumber = school.studentNumber();
		
		System.out.println("학번 : " + myNumber.getNumber());
		System.out.println("학번 : " + yourNumber.getNumber());
		
		// 학생 객체 주소
		System.out.println(myNumber);
		System.out.println(yourNumber);
		
		// 학교 객체 주소 -> 같음 static이므로! 같은 메모리
		System.out.println(school);
		System.out.println(school2);
		
	}
}
