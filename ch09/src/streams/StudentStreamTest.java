package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamTest {
	
	public static void main(String[] args) {
		//ArrayList에 객체 생성
		List<Student> list = Arrays.asList( //Student 객체를 불러오므로 new
			new Student("흥민", 80),
			new Student("강인", 70),
			new Student("민재", 90)				
		);
		//학생의 이름, 점수 출력
		Stream<Student> stdStream = list.stream();
		stdStream.forEach(std -> {

		/* 	System.out.println(std.getName() + " : " + std.getScore() + "점");   */ 
				 //문자가 아니여서 get으로 불러오기 
			String name = std.getName();
			int score = std.getScore();
			System.out.println(name + " : " + score);
		});
		System.out.println("===== 학생 이름만 출력하기 ======");
		//학생의 이름만 출력하기
		//stream 객체는 한번만 사용가능
		stdStream = list.stream();	//stream객체는 한번만 사용하면 소모되므로 다시 값을 저장해야함
		stdStream.map(std -> std.getName()) //map() : 매개변수에 매핑(일치)되는 것을 구현할 때 쓰는 함수
			.forEach(s -> System.out.println(s)); //문자니까 s
			//학생 객체에서 있는 이름만 출력 : 흥민, 강인, 민재
		
		//학생 점수에 해당되는 내용만 출력
		//정수인 경우 - mapToInt() 사용
		stdStream = list.stream();
		stdStream.mapToInt(std -> std.getScore())
			.forEach(n -> System.out.println(n)); //숫자니까 n
		
		//점수가 90점 이상인 학생의 이름을 출력 (민재)
		//filter() : 어떤 조건에 일치되는 내용을 걸러낼때 사용
/*		stdStream.filter는 사용불가										*/
		list.stream().filter(std -> std.getScore() >= 90)
					 .map(std -> std.getName())
					 .forEach(s -> System.out.println(s));
	}	//m
}