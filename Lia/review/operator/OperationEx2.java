package operator;
//증가,감소 연산자를 사용하여 값 연산하기
public class OperationEx2 {
	public static void main(String[] args) {
		int gameScore = 150;	//게임에서 획득한 점수는150점
		
		int lastScore1 = ++gameScore; //gameScore에서 1만큼 더한 값 lastScore1에 대입
		System.out.println(lastScore1);	//151
		
		int lastScore2 = --gameScore; //gameScore에서 1을 뺀 값 lastScore2에 대입
		System.out.println(lastScore2); //150
	}
}
