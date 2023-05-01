package exception;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			System.out.println("05년생 이상은 '가입불가'");
			System.out.println("04년생 이하는 '가입가능'");
			System.out.println("'A,ㅁ 문자는 잘못 입력'");
			try {
				System.out.print("주민번호 입력(앞 6자리) : ");
				num = sc.nextInt();
				String s = num+"";
				String[] s1 = s.split("");
				if(s1.length==6) {
					num = num / 10000;
					if(num>4 && num<24) {
						System.out.println("가입불가");
					} else { System.out.println("가입가능"); }
				} else { System.out.println("길이가 틀렸습니다"); }
			} catch(Exception e) {
				sc.nextLine();
				System.err.println("숫자를 입력하세요");
			}
		}
	}
}
