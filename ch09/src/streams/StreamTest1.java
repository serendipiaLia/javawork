package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {
	
	public static void main(String[] args) {
		// ArrayList에 객체 생성해서 저장함
		List<String> list = Arrays.asList("LG", "Samsung", "Hyundai");
	/*	
	  	List<String> list = new ArrayList<>(); -> ArrayList를 import하면됨
		
		list.add("LG");
		list.add("Samsung");
		list.add("Hyundai");
	*/	
		// companyStream 생성 후, 한번만 사용되고 다시 사용하려면 재 생성을 해야함.
		Stream<String> companyStream = list.stream(); // list의 모든 객체를 가져옴
		companyStream.forEach(company -> System.out.println(company)); 	//람다식으로 출력
	
		//for(), forEach() 객체를 각각 출력 -> StreamTest2 참고!
	}
}
