package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainClass03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("label example");
		
		Container con = frame.getContentPane();
		
		JLabel label = new JLabel("test label");
		label.setText("aaaaA"); // 안에있는 글자 변경
		Font font = new Font(null, Font.ITALIC, 32); // 글자 스타일 변경
		label.setFont(font);
		
		con.add(label);
		
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();
		
		frame.setVisible(true);
		// JFrame 종료시 콘솔도 종료
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for(int i=0;;i++) {
			label.setText(i+".변경");
		}
		
	}
}
