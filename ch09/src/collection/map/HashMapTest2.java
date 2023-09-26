package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		//Map 자료구조의 객체 생성 
		Map<String, Integer> map = new HashMap<>();
		int idx = 0; //초기화
		
		//자료 저장 ("key", value)
		map.put("Java", ++idx);
		map.put("Python", ++idx);
		map.put("C", ++idx);
		map.put("Python", ++idx); //value는 변경 가능, key값은 변경안됨 
		map.put("JavaScript", ++idx);
		
		
		//key 가져오기
		Set<String> keys = map.keySet();

		//자료의 크기
		System.out.println("총 객체수 : " + map.size());
		System.out.println("총 엔트리(key)수 : " + keys.size());
		
		//key, value 조회 (Iterator 또는 향상for문)
		System.out.println("======== key 조회 ==========");

		for(String key : keys)
			System.out.println(key + " : " + map.get(key)); //map.get(key) : value
		
		//자료 존재 유무
		System.out.println(map.containsKey("C++"));
			//C++은 없으므로 false값 나옴
		
		//자료 삭제
		if(map.containsKey("Python")) { //Python은 중복이므로 자료삭제 해주기
			map.remove("Python");
		}
		
		//람다식 조회
		System.out.println("======== 람다식 조회 ===========");
		
		keys.forEach(key -> System.out.println(key + " : " + map.get(key)));
		
	}
}
