package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		/* 1.String 자료형으로 데이터 관리 (CRUD) */
		List<String> vegeList = new ArrayList<>(); //java.util에서 List와 ArrayList import하기
		
		//2. 자료 생성(Create : add()사용)
		vegeList.add("양파");   	//0번 인덱스에 저장
		vegeList.add("마늘");		//1번
		vegeList.add("감자");		//2번
		
		//3.특정 자료 조회(Read : get()사용)
		System.out.println(vegeList.get(1)); 
		
		System.out.println("========================================");
		//5.리스트 객체의 개수
		System.out.println("총 객체 수 : " + vegeList.size()); //3
		
		//6.객체 수정(Update : set()사용)
		vegeList.set(2, "상추");
		
		//7.객체 삭제(Delete : remove()사용)
		if(vegeList.contains("마늘"))		// "내용(마늘)"이 포함되어 있는지 확인! 
		vegeList.remove("마늘");

		//8.리스트 객체의 개수
		System.out.println("총 객체 수 : " + vegeList.size()); //2
		
		//4.전체 자료 조회(Read : get()사용)
		for(int i=0; i < vegeList.size(); i++) { //리스트를 순회하며
			String vege = vegeList.get(i); 		 //객체를 가져와서
			System.out.println(vege);			 //출력함
		}
		System.out.println(vegeList); // [] 리스트안에 차례로 출력!
	}
}
