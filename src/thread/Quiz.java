package thread;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

class A04 extends Thread {
	JFrame frame;
	JLabel label;
	String s_t = null;
	public A04() {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("aa hh시 mm분 ss초");
		s_t = s.format(d);
		
		frame = new JFrame("label example");
		
		Container con = frame.getContentPane();
		
		label = new JLabel("test label");
		label.setText("aaa"); // 안에있는 글자 변경
		Font font = new Font(null, Font.ITALIC, 32); // 글자 스타일 변경
		label.setFont(font);
		
		con.add(label);
		
		frame.setLocation(1000, 200);
		frame.setPreferredSize(new Dimension(500,200));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		frame.setVisible(true);
		for(int i=0;;i++) {
			label.setText(i+".변경");
		}
		*/
	}
	public void run() {
		frame.setVisible(true);
		for(int i=0;;i++) {
			label.setText(s_t);
		}
	}
}
public class Quiz {
	public static void main(String[] args) {
		A04 a = new A04();
		Scanner sc = new Scanner(System.in);
		int num, index=0;
		ArrayList<String> id = new ArrayList<>();
		ArrayList<String> pwd = new ArrayList<>();
		String inputId, inputPwd;
		while(true) {
			System.out.println("1.로그인 2.가 입 3.로그아웃");
			System.out.print(">>> ");
			num = sc.nextInt();
			if(num==1) {
				System.out.println("=== 로그인 ===");
				System.out.print("아이디 : ");
				inputId = sc.next();
				System.out.print("비밀번호 : ");
				inputPwd = sc.next();
				boolean bool = id.contains(inputId);
				if(bool) {
					index = id.indexOf(inputId);
					if(pwd.get(index).equals(inputPwd)) {
						System.out.println("인증성공");
						a.start();
					}
					else { System.out.println("비밀번호틀림"); }
				} else {
					System.out.println("아이디틀림. 회원가입부터 진행해주세요");
				}
			}
			else if(num==2) {
				System.out.println("=== 가 입 ===");
				System.out.print("아이디 : ");
				inputId = sc.next();
				System.out.print("비밀번호 : ");
				inputPwd = sc.next();
				boolean bool = id.contains(inputId);
				if(bool) {
					System.out.println("중복되는 아이디입니다");
				} else {
					id.add(inputId);
					pwd.add(inputPwd);
					System.out.println("가입완료");
				}
			}
			else if(num==3) { System.out.println("로그아웃"); break; }
			else { System.out.println("다시선택"); }
		}
		
	}
}
