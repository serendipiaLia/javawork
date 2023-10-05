package regexp;

import java.util.regex.Pattern;

public class PatternExample {

	public static void main(String[] args) {
		
		//전화번호 형식 검증하기 - 경로 슬래시('\')와 구분을 위해서 한개 더 붙힘
		// \d는 [0-9]와 같음
		// {3, 4} : 최소 3개, 최대 4개
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String phone = "010-1234-56789";
		// matches() : (A, B)검증 결과를 true / false로 반환함
		boolean result = Pattern.matches(regExp, phone);
		
		//System.out.println(result);
		if(result) { // result == true
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		//계좌번호
		regExp = "\\d{2}-\\{3, 4}";
		String account = "aa-1234";
		result = Pattern.matches(regExp, account);
		if(result) {
			System.out.println("계좌번호 형식과 일치합니다.");
		}else {
			System.out.println("계좌번호 형식이 아닙니다. 올바른 형식으로 입력하세요.");
		}
	}
}
