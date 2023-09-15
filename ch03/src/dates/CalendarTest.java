package dates;

import java.util.Calendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		//연도
		int year = cal.get(Calendar.YEAR);
		System.out.println(year + "년");				//2023년
		System.out.println(cal.get(Calendar.YEAR));	//2023
		
		//월	(배열 기준 - 0 : 1월 이기때문에 +1 해줘야함!)
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println(month + "월");
		
		//일 (date)
		int date = cal.get(Calendar.DATE);
		System.out.println(date + "일");
		
		//요일 (day) - 미국기준 1:일, 2:월 ... 6:금, 7:토
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		
		String[] days = {"일요일", "월요일", "화요일", "수요일", "목요일",
				"금요일", "토요일"};
		System.out.println(days[0]);	
		System.out.println(days[day-1]);
		
		//시간
		System.out.println(cal.get(Calendar.HOUR));
		//분
		System.out.println(cal.get(Calendar.MINUTE));
		//초
		System.out.println(cal.get(Calendar.SECOND));
		
	}
}
