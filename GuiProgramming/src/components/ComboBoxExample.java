package components;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxExample extends JFrame{
	
	//1.생성자
	public ComboBoxExample() {	
		//2.프레임
		this.setTitle("목록 상자");
		this.setSize(300, 200);
		this.setLocation(300,200);
		
		//4.컴포넌트 객체 생성
		String[] currency = {"달러", "위안", "유로", "엔"};
		JComboBox<String> comboBox = new JComboBox<>(currency);
		JLabel label = new JLabel("화폐를 선택하세요.");
		
		//5.배치 - BorderLayout
		this.add(comboBox, BorderLayout.NORTH);
		this.add(label, BorderLayout.CENTER);
		
		//6.콤보 이벤트
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String currency = (String)comboBox.getSelectedItem();
				label.setText(currency + " 을(를) 선택하셨습니다.");
			}
		};
		comboBox.addActionListener(listener); //***필수
		
		//3.디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	} // ComboBox
	
	//2. 생성자를 통해 구현
	public static void main(String[] args) {
		new ComboBoxExample();
	}
}
