package exception;

import java.util.Scanner;

class A02 {
	public void test() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("문제가 발생하지 않으면");
			return;
		} catch(Exception e) {
			System.out.println("문제가 발생하면");
		} finally {
			System.out.println("마지막에 해야하는 작업");
			sc.close();
		}
		System.out.println("다음 문장실행");
		return;
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		A02 a = new A02();
		a.test();
	}
}
