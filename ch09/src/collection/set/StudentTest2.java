package collection.set;

import java.util.HashMap;
import java.util.Map;

public class StudentTest2 {
	
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<>();
		
		//학생 인스턴스 생성
		Student std1 = new Student("이나경" , 101);
		Student std2 = new Student("임예은" , 102);
		Student std3 = new Student("서지훈" , 103);
		Student std4 = new Student("임예은" , 102);
		
		//객체 추가
		map.put("이나경", std1);
		map.put("임예은", std2);
		map.put("서지훈", std3);
		map.put("임예은", std4);
		
		//객체 출력
		System.out.println(map);
		
		
	}
}
