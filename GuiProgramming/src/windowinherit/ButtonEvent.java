package windowinherit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// 1. 프레임 생성 | 2. 컴포넌트 생성 | 3. 액션 이벤트 | 4. 디스플레이 
public class ButtonEvent extends JFrame{
	
	// 생성자 구현!
	public ButtonEvent() {
		// 프레임 생성 (상속을 받으면 frame 객체를 생성 안해도 됨)
	//	JFrame frame = new JFrame();	
		this.setTitle("Say hello, Program"); // frame 제목
	//	this.setSize(250, 100);	// frame 창 크기 -> 35행,23행
		this.setLocation(200, 100); // frame 생성 위치(x,y)
		
		// 컴포넌트 생성 - BorderLayout배치 시, 입력상자, 버튼, 레이블
		JTextField text = new JTextField();
		text.setPreferredSize(new Dimension(200, 40)); // frame크기 생성하지 않고, 입력상자 크기설정!
		text.setFont(new Font("맑은고딕", Font.PLAIN, 30)); // font설정! Font.PLAIN 보통, BOLD 굵게
		text.setForeground(new Color(255, 255, 255)); // 입력상자 글 RGB 색상 표현 : (255,255,255)
			// 색상표현 16진수 방식 : (new Color(0x00f00));
		text.setBackground(Color.gray); 
		
		JButton button = new JButton("check");
		
		JLabel label = new JLabel("hello :)");
		label.setPreferredSize(new Dimension(200,50)); //setPreferredSize 선호하는 사이즈 입력
		label.setFont(new Font("맑은고딕", Font.PLAIN, 30)); // 레이블 글 font설정
		
		// 프레임에 객체 추가 BorderLayout 배치 사용!
		this.add(text, BorderLayout.CENTER);
		this.add(button, BorderLayout. EAST);
		this.add(label, BorderLayout.SOUTH);
		
		// 액션 이벤트
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = text.getText();
				label.setText("Hello! " + username + " :)");
				
			}
		};
		button.addActionListener(listener); //버튼 사용문! ****
		
		this.pack(); // frame역할 -> 프레임 생성 시, size가 없어도 생성할 수 있는 명령어(=초기화)
		// 디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료
		this.setVisible(true);
	
	}
	public static void main(String[] args) {
		// 생성자를 통해 구현 (호출, 함수를 통해 조립)
		ButtonEvent event = new ButtonEvent();
	}
}
