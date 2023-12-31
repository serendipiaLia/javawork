package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest {

	public static void main(String[] args) {
		// LocalDateTime 클래스 사용
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now); 
			//출력값: 2023-09-08T15:10:32.131727200
		
		//날짜 / 시간 포맷 설정 "yyyy/MM/dd HH:mm:ss a"
		DateTimeFormatter dtFormat = 
				DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a");
		
		System.out.println(now.format(dtFormat));
			//출력값 : 2023/09/08 15:13:04 오후
		
		//날짜만 설정
		LocalDate date = LocalDate.now();
		System.out.println(date);
			//출력값 : 2023-09-08
		
		//시간만 설정
		DateTimeFormatter timeFormat = 
				DateTimeFormatter.ofPattern("HH:mm:ss a");
		
		System.out.println(now.format(timeFormat));
		
		//특정 날짜 지정하기
		LocalDate startDay = LocalDate.of(2023, 8, 1);	//시작일
		LocalDate today = LocalDate.of(2023, 9, 15);	//종료일
		
		//지나온 날짜 계산하기
		long passedTime = ChronoUnit.DAYS.between(startDay, today);
		System.out.println(passedTime +  "일이 지났습니다.");
		
	}
	
}
