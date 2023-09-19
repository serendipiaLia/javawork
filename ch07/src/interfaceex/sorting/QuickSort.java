package interfaceex.sorting;

public class QuickSort implements Sort{

	@Override
	public void ascending(int[] numbers) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[] numbers) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort 입니다.");
	}

}
