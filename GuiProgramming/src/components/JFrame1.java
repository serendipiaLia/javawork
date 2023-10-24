package components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame1 {
	
	public static void main(String[] args) {
		// 프레임 - 윈도우 전체
		JFrame frame = new JFrame();
		
		// 제목 표시줄 - 내용
		frame.setTitle("처음 만드는 윈도우"); // 실행 창의 bar이름
		frame.setSize(300, 200); // 300px - 너비, 200px 높이 (실행 창이 크기)
		frame.setLocation(100, 100); // x좌표 200, y좌표 100 (실행 창이 나타나는 지점)  
	
		// 레이블(글자 출력)
	/*	JLabel label = new JLabel();
		label.setText("  I wanna go home RN  !!"); 
	*/	
		JLabel label = new JLabel("I wanna go home RN !!!");
			
			//레이블 정렬1 (alignment : 왼쪽, 가운데, 오른쪽)
			label.setHorizontalAlignment(JLabel.CENTER);
			//레이블 정렬2 (BorderLayout : 프레임을 동, 서, 남, 북 중앙으로 배치
			frame.add(label, BorderLayout.CENTER); // 프레임에 라벨을 추가해야 화면에 출력됨!
			
		// 버튼 생성
		JButton button = new JButton("check");
		frame.add(button, BorderLayout.SOUTH);	
						//BorderLayout : 프레임을 동, 서, 남, 북 중앙으로 배치
		
		// 윈도우 종료(닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 윈도우 디스플레이
		frame.setVisible(true);
	}// m
}
