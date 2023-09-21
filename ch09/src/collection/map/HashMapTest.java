package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*   Ctrl + Shift + O : 자동 import 하기     */
public class HashMapTest {

	public static void main(String[] args) {
		// 학생의 이름과 점수를 저장할 HashMap 객체 생성
		Map<String, Integer> map = new HashMap<>();
		
		// 객체 저장
		map.put("손흥민", 95);	//key, value
		map.put("이강인", 87);
		map.put("김민재", 79);
		map.put("손흥민", 85); 	//key값은 그대로, value가 바뀌어서 출력(입력순으로)
		map.put("백승호", 77);
		
		// 특정 객체 조회 (키,key -> 점수)
		System.out.println(map.get("이강인"));
		
		//객체 삭제
		if(map.containsKey("백승호")) {	//객체가 map에 포함되었다면
			map.remove("백승호");			// key를 삭제 -> value도 같이 삭제
		}
		
		// 총 객체수 
		System.out.println("총 객체 수 : " + map.size());	//3
		
		System.out.println("============= 전체조회 =============");
		// 전체조회 (Iterator : 반복자 클래스)
		Set<String> keySet = map.keySet();	//key값 객체 생성
		Iterator<String> ir = keySet.iterator(); //key값으로 반복할 반복자 객체 생성 ir
		while(ir.hasNext()) {	// 객체 수만큼 반복
			String key = ir.next(); //객체가 있으면 1개씩 가져옴(=next)
			Integer value = map.get(key);	//key를 매개로 값을 가져옴
			System.out.println(key + ":" + value); //입력한 순서로 출력되진 않음!
		}
		System.out.println("============ 전체조회2 ============");
		// 전체조회 2
		for(String key : keySet) {
			System.out.println(key + ":" + map.get(key));
		}
		System.out.println("========= 객체 자체를 출력 ==========");
		//객체 자체를 출력 - {key=value , }
		System.out.println(map);
	}
}
