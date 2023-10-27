package exchange;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exchange extends JFrame implements ActionListener{
// 환율 변환 won = won/usd 
	//필드
	String[] currency = {"달러", "위안", "유로", "엔"};
	static final float USD = 1357.50f; // 미국 달러 환율
	static final float CNY = 185.58f; // 중국 위안 환율
	static final float EUR = 1432.43f; // 유럽 유로 환율
	static final float JPY = 9.04f; // 일본 엔 환율 (100엔 기준)
	
	JPanel pan1;
	JPanel pan2;
	JLabel label1;
	JTextField text;
	JComboBox<String> comboBox;
	JButton button;
	//panel 2
	JLabel label2; //변환 결과 출력할 label
	
	//생성자
	public Exchange() {
		//frame(this) 생성
		this.setTitle("환율 변환기");
		this.setSize(350, 150);
		this.setLocation(200,100);
		
		// 1. panel 2개 생성 - 위쪽, 가운데 배치 (border layout사용)
		pan1 = new JPanel();
		pan2 = new JPanel();
	
		this.add(pan1, BorderLayout.NORTH);
		this.add(pan2, BorderLayout.CENTER);
		
		// 2. panel 1에 올릴 객체 생성 및 추가
		label1 = new JLabel("원화");
		text = new JTextField(6);
		comboBox = new JComboBox<>(currency);
		button = new JButton("환율 변환");
		//panel 2
		label2 = new JLabel("변환 결과 입니다.");
		
		//글꼴 변경
		label1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		text.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label2.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		
		pan1.add(label1);
		pan1.add(text);
		pan1.add(comboBox);
		pan1.add(button);
		
		pan2.add(label2);
		
		// 3. 변환 버튼 이벤트
		button.addActionListener(this);
		
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
		float won = Float.parseFloat(text.getText());
		String currency = (String)comboBox.getSelectedItem();
		
		//if ~ else문, switch문
		if(currency.equals("달러")) {
			won = won / USD;
			label2.setText(String.format("%.2f$", won)); //소수 둘째 자리
		  //label2.setText(String.valueOf(won));
		}else if(currency.equals("위안")) {
			won = won / CNY;
			label2.setText(String.format("%.2f¥", won));
		}else if(currency.equals("유로")) {
			won = won / EUR;
			label2.setText(String.format("%.2f€", won));
		}else if(currency.equals("엔")) {
			won = won / JPY;
			label2.setText(String.format("%.2f¥", won));
		
		}
		}
	}
}
