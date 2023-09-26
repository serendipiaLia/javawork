package collection.stack;

import java.util.ArrayList;

// DAO - 데이터 관리
public class MyStack {
	
	private ArrayList<String> arrayList;
	
	//생성자
	public MyStack() {
		arrayList = new ArrayList<>();
	}
	
	//자료추가(저장)
	public void push(String data) {
		arrayList.add(data);
	}
	
	//자료삭제(꺼내기)
	public String pop() {
		int size = arrayList.size(); //배열크기 size 3 인데, 인덱스는 2번까지 있음! 0 1 2
		if(size == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayList.remove(size-1);
	}
}
