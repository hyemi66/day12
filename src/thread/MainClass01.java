package thread;
class A01 extends Thread {
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i+".A01");
		}
	}
}
class B01 extends Thread {
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println(i+".BB01");
		}
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		A01 a = new A01();
		B01 b = new B01();
		//a.run();
		//b.run();
		
		// 멀티thread
		a.setDaemon(true); // main종료시 a,b도 중도종료
		b.setDaemon(true);
		a.start();
		b.start();
		System.out.println("main종료");
	}
}
