package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class BoardTest {

	public static void main(String[] args) {
		// ArrayList 또는 Vector를 선택 사용
		
		// ArrayList<Board> list = new ArrayList<>(); 
		List<Board> list = new Vector<>();
		
		// Board 객체 (게시글)
		Board board1 = new Board("제목 1", "내용 1 입니다.", "글쓴이 1");
		Board board2 = new Board("제목 2", "내용 2 입니다.", "글쓴이 2");
		Board board3 = new Board("제목 3", "내용 3 입니다.", "글쓴이 3");
		
		// Board객체를 Vector 리스트에 저장
		list.add(board1);	//0번
		list.add(board2);	//1번	
		list.add(board3);	//2번
		
		// 게시글 1개 삭제(1번 인덱스)
		if(list.contains(board2)) {
			list.remove(board2); //index로 삭제가능 ex)list.remove(1)
		}
		
		// 맨 앞 0번 인덱스 객체 불러오기(가져오기)
		System.out.println("Title : " + list.get(0).getTitle()); //toString 사용가능
		System.out.println("Content : " + list.get(0).getContent()); //toString 사용가능
		System.out.println("Writer : " + list.get(0).getWriter()); //toString 사용가능
		
		System.out.println("=================================");
		// 전체 목록 조회
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getTitle() + ", " 
				+ board.getContent() + ", " + board.getWriter());
		}
		
		
		
	} //m
	
}
