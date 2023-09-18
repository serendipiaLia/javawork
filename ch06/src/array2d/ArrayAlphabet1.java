package array2d;

public class ArrayAlphabet1 {

	public static void main(String[] args) {
		// 대문자 26자를 배열에 저장
		// for문 출력
		/*char c = 'A';
		System.out.println(c); // 65코드 값
		System.out.println((int)c); // A의 값
		
		char c2 = 66
		System.out.println(c2); */
		
		System.out.println("== 일반 for문 사용 알파벳 출력 ==");
		char c;
		for(c= 65;  c<= 90; c++) {	//65 코드값
			System.out.print(c + " ");
		}	
		System.out.println("\n 변수의 마지막 값: " + (char)(c-1)); // Z
		
		System.out.println("\n== 알파벳을 배열에 저장하고 출력 ==");
		char[] alphabets = new char[26];
		char ch = 'A';
		
		//alphabets[0] = ch;
		//System.out.println(alphabets[0]); // A
		///alphabets[1] = (char)(ch + 1);	// 자바 덧셈 연산하면 int형으로 바뀜 -> 다시 형 변환
		//ch++; // ch = ch+1; -> 1증가(후증가)
		//alphabets[1] = ch++;
		
		//System.out.println(alphabets[1]); // B
		
		//알파벳을 배열에 저장 : 1 증가
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
	
		//알파벳 출력
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + " ");  
		}
	
		
	}
}
