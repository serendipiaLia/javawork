package arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {
	
	public static void main(String[] args) {
		//String[] carts = new String[4];
		//carts[0] = "사과"
		//String[] carts = new String[]{"사과", "콩나물", "커피", "우유"};
		
		//리스트 공간이 10개 생성(디폴트 값 10)
		//리스트도 배열과 같이 순서가 있음(=인덱싱)
		//중복 허용
		ArrayList<String> carts = new ArrayList<>();
		
		//자료 추가 : add()함수 사용
		carts.add("사과");
		carts.add("콩나물");
		carts.add("사과");	// 중복허용 -> set()사용으로 전체조회 시 바나나 출력!
		carts.add("커피");
		
		//자료 출력 : get()함수 사용
		System.out.println(carts.get(0));
		System.out.println(carts.get(1));
		System.out.println("===========================");
		
		//자료 수정 : set()사용
		carts.set(2, "바나나");
		
		//자료 삭제 : remove()
		//carts.remove(1);
		carts.remove("콩나물");
		
		//자료의 크기(=리스트의 크기) : size() 사용
		System.out.println("리스트의 크기: " + carts.size()); 
		
		System.out.println("===전체조회==================");
		//전체 조회(출력)
		for(int i=0; i < carts.size(); i++) { //리스트를 처음부터 반복하면서
			String cart = carts.get(i);	//저장된 자료를 가져온 후 cart(객체)에 저장
			System.out.println(cart);
		}
		System.out.println("==향상된 for문==========");
		//향상된 for문 공식 : for(자료형 변수 : 리스트이름) { }
		for(String cart : carts)
			System.out.print(cart + " ");
	
	}
}
