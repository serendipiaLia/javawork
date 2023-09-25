package streams.book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LibraryTest {
	
	public static void main(String[] args) {
		//책 목록을 저장할 자료 구조 - ArrayList : bookList
		List<Book> bookList = new ArrayList<>();
		
		//책 목록 생성
		Book j = new Book ("Java", 25000);
		Book p = new Book ("Python", 15000);
		Book a = new Book ("Android", 30000);
		
		//책 자료 저장(추가) add()
		bookList.add(j);
		bookList.add(p);
		bookList.add(a);
		
		//Stream과 람다식 사용해서 책 목록 출력하기
		System.out.println("========= Book List ===========");
		Stream<Book> stream = bookList.stream();
		stream.map(b -> b.getName())
			  .forEach(s -> System.out.println(s));
		
		//모든 책 가격의 합
		int total = bookList.stream()
							.mapToInt(b -> b.getPrice())
							.sum();
		System.out.println("모든 책 가격의 합은 " + total + " 원 입니다.\n");
		
		//책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력!
		// filter(), map(), sorted(), forEach() 사용
		System.out.println("=== 가격이 20000원 이상인 책 목록 ===");
		bookList.stream()
				.filter(b -> b.getPrice() >= 20000)
				.map(b -> b.getName())
				.forEach(s -> System.out.println(s));
		
	}
}
