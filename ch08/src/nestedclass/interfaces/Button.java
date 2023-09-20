package nestedclass.interfaces;

public class Button {
	//필드 - 인터페이스형 멤버변수 listener
	private OnClickListener listener;
	
	//클래스(Button)의 내부 인터페이스
	interface OnClickListener{
		public void onClick();
	}
	
	//외부에서 구현객체 입력
	public void setListener(OnClickListener listener) { 
		this.listener = listener;
	}
	//버튼 터치
	public void touch() {
		listener.onClick();
	}
}
