package exercise.ex03;
//산술연산자 1분 복습문제 : 국어 점수를 의미하는 korScore 변수를 추가하고, 여러분이 원하는 점수를 대입하세요.
//그리고 국어점수까지 포함한 총점과 평균점수를 구해서 결과값을 출력하도록 예제 수정
public class Ex74p {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 80;
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore);	//240 
		
		double avgScore = totalScore / 3.0;
		System.out.println(avgScore);
		
	}
	
}







