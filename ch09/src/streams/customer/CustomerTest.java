package streams.customer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {
	
	public static void main(String[] args) {
		//고객을 저장할 자료 구조 - ArrayList : customerList 
		List<Customer> customerList = new ArrayList<>();
		
		//고객 객체 생성
		Customer lee = new Customer("이나경", 25, 100);
		Customer rim = new Customer("임예은", 25, 100);
		Customer seo = new Customer("서지훈", 15, 50);
		
		//자료 저장(추가)
		customerList.add(lee); //0번 인덱스
		customerList.add(rim); //1번
		customerList.add(seo); //2번
		
		System.out.println("========= 고객 명단 출력 ==========");
/*		
  		for(Customer customer : customerList)
		System.out.println(customer.getName());
*/		
		//Stream과 람다식 사용해서 고객명단 출력하기
		Stream<Customer> stream = customerList.stream();
		stream.map(c -> c.getName())
			  .forEach(s -> System.out.println(s));
		
		
		//총 여행 비용
		int total= customerList.stream()
							   .mapToInt(c -> c.getPrice())
							   .sum();
		
		System.out.println("\n총 여행 비용 : " + total + " 만원 입니다.\n");
		
		System.out.println("==== 나이가 20세 이상인 고객의 명단 ====");
		//중간 연산 - filter(), map(), sorted()
		//최종 연산 - forEach()
		customerList.stream()
					.filter(c -> c.getAge() >= 20)
					.map (c -> c.getName())
					.forEach (s -> System.out.println(s));
	}	
}
