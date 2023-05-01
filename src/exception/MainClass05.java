package exception;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age;
		System.out.println("나이입력");
		try {
			age = sc.nextInt();
			if(age<1) {
				// 강제예외
				throw new Exception("잘 못 입 력");
			}
			System.out.println(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("다음 문장 실행");
	}
}
