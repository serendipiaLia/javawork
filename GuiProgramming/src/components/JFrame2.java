package components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame2 {
	
	public static void main(String[] args) {
		// 프레임 - 윈도우 전체
		JFrame frame = new JFrame();
		
		// 제목 표시줄 - 내용
		frame.setTitle("처음 만드는 윈도우"); // 실행 창의 bar이름
		frame.setSize(300, 200); // 300px - 너비, 200px 높이 (실행 창이 크기)
		frame.setLocation(100, 100); // x좌표 200, y좌표 100 (실행 창이 나타나는 지점)  
		frame.setLayout(null); // 레이아웃 객체가 생성하지 않은 상태
		
		// 레이블(글자 출력)
		JLabel label = new JLabel("I wanna go home RN !!!");
		label.setSize(80, 30);
		label.setLocation(100, 40);	// x좌표, y좌표
		frame.add(label); // 프레임에 라벨을 추가해야 화면에 출력
			
		// 버튼 생성
		JButton button = new JButton("check");
		button.setSize(70, 30);
		button.setLocation(100 ,80);
		frame.add(button);	
		
		// 윈도우 종료(닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 윈도우 디스플레이
		frame.setVisible(true);
		
	}// m

}
