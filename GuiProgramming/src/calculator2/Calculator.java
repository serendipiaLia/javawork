package calculator2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	//필드
	String[] operator = {"+", "-", "x", "÷"};
	JComboBox<String> comboBox;
	JButton calcBtn;
	JButton resetBtn;
	JTextField text1;  //첫째수 입력
	JTextField text2;  //둘째수 입력
	JTextField text3;  //결과 입력
	JLabel label;
	
	//생성자
	public Calculator() {
		//윈도우(프레임) 생성
		this.setTitle("사칙연산 프로그램");
		this.setSize(300, 120);
		this.setLocation(200, 100);
		
		//패널 2개 생성 - BorderLayout
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		
		this.add(pane1, BorderLayout.NORTH);
		this.add(pane2, BorderLayout.CENTER);
		
		//컴포넌트 객체 생성 - FlowLayout
		//pane1에 객체 올리기
		pane1.setLayout(new FlowLayout());
		text1 = new JTextField(5);
		//콤보 박스
		comboBox = new JComboBox<>(operator);
		
		text2 = new JTextField(5);
		//레이블
		label = new JLabel("=");
		text3 = new JTextField(5);
		
		//버튼 객체
		pane2.setLayout(new FlowLayout());
		calcBtn = new JButton("계산");
		resetBtn = new JButton("취소");
		
		//pane1, 2에 올리기
		pane1.add(text1);
		pane1.add(comboBox);
		pane1.add(text2);
		pane1.add(label);
		pane1.add(text3);
		
		pane2.add(calcBtn);
		pane2.add(resetBtn);
		
		//이벤트
		calcBtn.addActionListener(this);
		resetBtn.addActionListener(this);
		
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}// 생성자 끝

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == calcBtn) { //객체가 calcBtn이면
			int num1 = Integer.parseInt(text1.getText());
			String op = (String)comboBox.getSelectedItem();
			int num2 = Integer.parseInt(text2.getText());
			
			switch(op) {
			case "+":
				int result = num1 + num2;
				text3.setText(String.valueOf(result)); break;
			case "-":
				result = num1 - num2;
				text3.setText(String.valueOf(result)); break;
			case "x":
				result = num1 * num2;
				text3.setText(String.valueOf(result)); break;
			case "÷":
				double result2 = (double)num1 / num2;
				text3.setText(String.valueOf(result2)); break;
			}
		}//calcBtn인 경우 끝
		
		if(e.getSource() == resetBtn) { //객체가 resetBtn이면
			text1.setText("");
			text2.setText("");
			text3.setText("");
		} //resetBtn인 경우 끝
	}

}