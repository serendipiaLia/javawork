package collection.list;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		List<String> vegeList = new Vector<>();
		
		//1. 자료생성
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		//4. 객체 삭제 
		if(vegeList.contains("양파")) {
			vegeList.remove("양파");
		}
		
		//2. 리스트 객체의 개수
		System.out.println("총 객체 수 : " + vegeList.size());
		
		//3. 전체 조회 (향상된 for문사용)
		for(String vege : vegeList) {
			System.out.println(vege);
		}
	}
}
