package reference.subjects2;

import reference.subjects.Subject;

public class Student {
	private int studentId;		//class안에서는 자동 초기화 됨.
								//main안에서는 초기화 해줘야함 ex) int studentId = 0 
	private String studentName;	//							String studentName = null
	private Subject[] subjects; //import 할때 reference에서 가져오기 (우리가 사용할거)
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10]; // 과목을 저장할 배열의 크기 10개 생성
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		// 과목 객체를 생성해서 값(과목이름, 점수)을 저장
		Subject subject = new Subject(name, score);
		//subject.setSubjectName(name);
		//subject.setScorePoint(score);
		
		//과목을 배열에 저장 
		//subjects[0] = subject; // 1개 저장
		for (int i=0; i < subjects.length; i++) {
			if(subjects[i] == null) {	//배열의 요소가 비어 있을때 
				subjects[i] = subject;	//배열 객체를 저장 
				break;	//빠져 나옴
			}
		}
	}
	
	// 학생 정보 출력 
	public void showStudentInfo() {
		int total = 0; 	//총점 
		double average; //평균은 선언만
		int count = 0; 	//개수 
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] != null) {	//배열의 요소가 비어있지 않을때,
			//	Subject subject = subjects[i];	//객체를 생성하고 출력
				count++;	//subjects[i]가 true일때마다 1증가
				total += subjects[i].getScorePoint(); //점수 누적
			System.out.println(studentId + "번 학생 " + studentName + "의 " +
				subjects[i].getSubjectName() + " 점수는 " + subjects[i].getScorePoint() + "점 입니다.");
			}
		}
		average = (double)total / count;
		//total은 for문 빠져나와서 만들기
		System.out.printf("과목의 총점은 %d점이고, 평균은 %.1f 입니다.\n" , total, average);
		
	}
}
