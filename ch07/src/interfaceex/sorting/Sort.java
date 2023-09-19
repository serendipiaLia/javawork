package interfaceex.sorting;
//정렬 알고리즘이 구현해야 할 내용을 Sort인터페이스에 정의
public interface Sort {
	//정수형 배열을 인수로 받아서 오름차순으로 정렬하는 asending() 메서드
	//				       내림차순으로 정렬하는 descending() 메서드
	//이 알고리즘에 대한 설명은 description() 디폴트 메서드로 정의
	
	public void ascending(int[] numbers);
	
	public void descending(int[] numbers);
	
	//일반(구체화)메서드 - default 키워드 붙임
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
	}
	
}
