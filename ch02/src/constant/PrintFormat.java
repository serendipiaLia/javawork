package constant;

public class PrintFormat {

	public static void main(String[] args) {
		// printf ("문자열 포맷", 객체(변수))
		// 대응 성식 : %d, 실수 : %f, 문자 : %s  *3개만 알고 있어두 됨
		// decimal(10진수==정수) 
		// 줄바꿈 문자 : \n 
		//Tab(4칸 띄어쓰기) : \t
		
		int year = 2023;
		System.out.println("올해는 " + year + "년 입니다.");
		System.out.printf("올해는 %d년 입니다.\n", year);
		
		
		float weight = 63.7F; //double은 16자리 소수점 나옴 
		System.out.println("무게는 " + weight + "kg 입니다.");
		System.out.printf("무게는 %.2fkg 입니다.\n", weight); //소수점 자리 줄임표현 %.1 : 소수점한자리 
		
		String nick = "얼음공주";
		System.out.printf("그녀의 별명은 %s입니다.\n", nick);
		
		// '\t' 사용
		int num = 0; //0으로 초기화
		num += 1; //num = num + 1; 
		
		String table = ""; //빈 문자열 초기화
		table += "-------------------------\n";
		table += "이름\t나이\t나라\n";
		table += "-------------------------\n";
		table += "강감찬\t82\t고려\n";
		table += "이순신\t53\t조선\n";
		table += "-------------------------\n";
		
		System.out.println(table);
		
		
	} //m
}
