package interfaceex.sorting;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] numbers) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void descending(int[] numbers) {
		System.out.println("BubbleSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort 입니다.");
	}

}
