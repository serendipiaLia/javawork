package switchexample;

public class SwitchCaseTest {
	
	public static void main(String[] args) {
		// 랭킹에 따른 메달 출력
		// 1등: 금 | 2등 : 은 | 3등 : 동 
		// 변수 - rank
		
		int rank = 1;
		
		switch(rank) {
		case 1 : // :(콜론)으로 끝남
			System.out.println("금메달 입니다.");
			break;  // 중괄호 블럭이 하나이므로 중간에 break 필수!
		case 2 :
			System.out.println("은메달 입니다.");
			break;
		case 3 :
			System.out.println("동메달 입니다.");
			break;
		default:
			System.out.println("메달이 없습니다."); //case에 없는 내용 -> esle if 같은 느낌
			break;
		}
		
		
	} // main
}
