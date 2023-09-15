package singleton.student;

public class Student {
	// 필드 
	private static int serialNum = 1000;
	private int sNumber; // 학번 (인스턴스 변수)

	// 생성자
	public Student() {
		serialNum++;
		sNumber = serialNum;
	}

	// 학번 출력 메서드
	public int getNumber() {
		return sNumber;
	}
	
}
