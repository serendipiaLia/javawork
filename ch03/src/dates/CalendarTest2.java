package dates;

import java.util.Calendar;

public class CalendarTest2 {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //getInstance는 static
		
		// 지나온 시간 측정
		// 1970. 1. 1 자정 이후부터 측정 - 밀리 초
		// 유닉스 시스템 소프트웨어(ex.윈도우,리눅스) 개시된 시간
		// 1/1억(나노초,ns) >  1/백만(마이크로초) > 1/1000초(밀리초,ms) > 1초(s)
		//	System.out.println(24*60*60*1000);
		
		long passedTime = cal.getTimeInMillis();
		System.out.println(passedTime);
		
		//밀리초(ms)를 1로 환산
			passedTime = passedTime / (24*60*60*1000);
			System.out.println(passedTime);
		
		//특정한 날짜로 부터 현재까지 얼마나 지났는지 구하기
			
			// 시작일 , 종료일 객체 생성
			Calendar startDay = Calendar.getInstance();
			Calendar today = Calendar.getInstance();
			
			startDay.set(2023, 9, 1);	// 시작일
			today.set(2023, 9, 15);		// 종료일
			
			//초로 계산
			long betweenTime = today.getTimeInMillis() - 
					startDay.getTimeInMillis();
			
			//1로 환산
			betweenTime = betweenTime / (24*60*60*1000);
			System.out.println(betweenTime + "일 지났습니다.");
			
			//현재 까지의 시간 (밀리초)
			System.out.println(System.currentTimeMillis());
			
			//현재 까지의 시간 (나노초)
			System.out.println(System.nanoTime());
			
	}
}
