package components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JButton1 {
	
	public static void main(String[] args) {
		// 프레임
		JFrame frame = new JFrame("Layout Example");
		frame.setSize(250, 120);
		frame.setLocation(200, 100);
		
		// 버튼 : SOUTH, NORTH - 프레임의 가로 크기와 일치
		JButton button1 = new JButton("North");
		frame.add(button1, BorderLayout.NORTH); // 버튼을 프레임에 추가
		
		JButton button2 = new JButton("South");
		frame.add(button2, BorderLayout.SOUTH);
		
		JButton button3 = new JButton("East");
		frame.add(button3, BorderLayout.EAST);
		
		JButton button4 = new JButton("West");
		frame.add(button4, BorderLayout.WEST);
		
		JButton button5 = new JButton("Center");
		frame.add(button5, BorderLayout.CENTER);
		
		// 디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
