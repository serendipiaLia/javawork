package actionevent;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonActionEvent {
	
	public static void main(String[] args) {
		// 프레임
		JFrame frame = new JFrame("Layout example");
		frame.setSize(250, 100);
		frame.setLocation(200, 100);
		
		// 컴포넌트 객체 생성 - JTextField(입력상자), JButton, JLabel
		JTextField text = new JTextField();
		JButton button = new JButton("check");
		JLabel label = new JLabel("hello :>");
		
		// ** button event > ConfirmBtnActionListener 클래스
		ConfirmBtnActionListener listener = new ConfirmBtnActionListener(text, label);
		
		button.addActionListener(listener);
		
		// 컴포넌트 배치 - BorderLayout 사용
		frame.add(text, BorderLayout.CENTER); // 가운데
		
		button.setPreferredSize(new Dimension(60, 30)); // 크기조절
		frame.add(button, BorderLayout.EAST); // 버튼 오른쪽(동쪽) 배치 
		
		label.setPreferredSize(new Dimension(250, 40));
		frame.add(label, BorderLayout.SOUTH); // 하단
		
		// 디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
