package exercise.ex03;
//1분복습 : 증가,감소 연산자를 사용하여 값 연산하기
public class Ex76p {
	public static void main(String[] args) {
		int gameScore = 150;	//게임에서 획득한 점수는150점
		
		--gameScore;
		System.out.println(gameScore);
		
		int lastScore1 = gameScore++; // 
		System.out.println(lastScore1);	//150
		
		int lastScore2 = gameScore--; //
		System.out.println(lastScore2); //151
	}
}