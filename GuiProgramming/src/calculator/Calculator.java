package calculator;

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

public class Calculator extends JFrame{
	//필드
	String[] operator = {"+", "-", "x", "÷"};
	JComboBox<String> comboBox;
	
	//생성자
	public Calculator() {
		//윈도우(frame 생성)
		this.setTitle("사칙연산 프로그램");
		this.setSize(300, 120);
		this.setLocation(200,100);
		
		//패널 2개 생성 - BorderLayout 사용
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
			//pane 배치
			this.add(pane1, BorderLayout.NORTH);
			this.add(pane2, BorderLayout.CENTER);
		
/* -------------------- 컴포넌트 객체 생성 - FlowLayout 사용	------------------------- */
		
		// pane 1 객체 생성
		pane1.setLayout(new FlowLayout());
		JTextField text1 = new JTextField(5);
		// comboBox 생성 (사칙연산 하기위해)
		comboBox = new JComboBox<>(operator); 	
		JTextField text2 = new JTextField(5);
		// 레이블Label
		JLabel label = new JLabel("=");
		JTextField text3 = new JTextField(5);
		
		// pane 2 버튼 객체 생성
		pane2.setLayout(new FlowLayout());
		JButton calcBtn = new JButton("계산");
		JButton resetBtn = new JButton("취소");
			
			// pane 1에 올리기 
			pane1.add(text1);
			pane1.add(comboBox);
			pane1.add(text2);
			pane1.add(label);
			pane1.add(text3);
		
			//	pane 2에 올리기
			pane2.add(calcBtn);
			pane2.add(resetBtn);
		
/*-------------------------------- 이벤트 ------------------------------------*/
		
		ActionListener listener1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// if~else 나 switch 구문으로 구현하기
				int num1 = Integer.parseInt(text1.getText()); // 입력상자에서 입력딘 문자를 숫자로 변환
				String op = (String)comboBox.getSelectedItem();
				int num2 = Integer.parseInt(text2.getText()); 
				
				// switch문
				switch(op) {
				case "+" :
					int result = num1 + num2;
					text3.setText(String.valueOf(result)); break;
				case "-" :
					result = num1 - num2;
					text3.setText(String.valueOf(result)); break;
				case "x" :
					result = num1 * num2;
					text3.setText(String.valueOf(result)); break;
				case "÷" :
					double result2 = (double)num1 / num2;	
					text3.setText(String.valueOf(result2)); break;
				} // switch
				
			} // @override
		};
		calcBtn.addActionListener(listener1);
	
		ActionListener listener2 = new ActionListener() {
			//취소 버튼 눌렀을 때 입력 초기화 구현
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText(""); // "" = null
				text2.setText("");
				text3.setText("");
			}
		};
		resetBtn.addActionListener(listener2);	
		
/* ------------------------------- 디스플레이 ------------------------------------	*/
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	} //생성자 public calculator 
}
