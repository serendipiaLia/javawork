package collection.queue;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		List<String> myList = new LinkedList<>();
		
		//자료 추가
		myList.add("A"); //0번인덱스
		myList.add("B"); //1번
		myList.add("C"); //2번
		
		//객체myList 출력 
		System.out.println(myList); // [A, B, C]
		
		//특정 위치에 자료 추가
		myList.add(2, "D"); //2번 인덱스에 'D'추가
		System.out.println(myList); // [A, B, D, C]
		
		//전체 요소 출력
		for(String list : myList) {
			System.out.print(list + " "); // A B D C -> 선입선출 Queue방식! 
		}
	}
}
