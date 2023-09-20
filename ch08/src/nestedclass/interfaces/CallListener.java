package nestedclass.interfaces;

public class CallListener implements Button.OnClickListener{
//Button class를 통해 Button class 내부 인터페이스 OnClickListener에 접근!
	
	@Override
	public void onClick() {
		System.out.println("전화를 겁니다.");
	}
}
