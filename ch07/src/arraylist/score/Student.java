package arraylist.score;

import java.util.ArrayList;

import javax.net.ssl.SSLContext;

public class Student {
	private int studentId;
	private String studentName;
	private ArrayList<Subject> subjectList;	//ArrayList - Subject객체를 저장할 	
														//메모리공간(배열,리스트) 만들어줌
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	//과목 추가 
	public void addSubject(String name, int score) {
		Subject subject = new Subject(name, score); // 매개변수로 외부에서 입력
		subjectList.add(subject); //어레이리스트에 저장함(0번부터)
	}
	
	//학생의 정보 입력
	public void showStudentInfo() { 
		int total = 0; //총점 변수 선언
		double average; // 평균 변수 선언
		for(int i=0; i<subjectList.size(); i++) {
			Subject s = subjectList.get(i);
			total += s.getScorePoint(); //총첨 = 점수 더하기 
			System.out.printf("학생 %s의 %s 과목의 점수는 %d점 입니다.\n",
					studentName, s.getSubjectName(), s.getScorePoint());
		}
		//평균 계산
		average = (double)total / subjectList.size();	//total이 int형이므로 형변환!
		//전체 출력문
		System.out.printf("%s의 총점은 %d점이고, 평균은 %.1f점 입니다.\n", 
				studentName, total, average);
	}
}
