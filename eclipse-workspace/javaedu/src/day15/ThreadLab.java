package day15;
public class ThreadLab {
	public static void main(String[] args) throws InterruptedException {
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		Thread3 thread3 = new Thread3();
		Thread4 thread4 = new Thread4();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.join();
		System.out.println("MAIN 수행 종료");
	}
}
class Thread1 extends Thread{
	public void run() { 
		for (int i = 65; i <77 ; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}		
	}
}
class Thread2 extends Thread{
	public void run() { 
		for (int i = 97; i < 105; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
class Thread3 extends Thread{
	public void run() { 
		for (int i = 1; i < 31; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
class Thread4 extends Thread{
	public void run() { 
		for (int i = 0; i < 10; i++) {
			System.out.println("JAVA");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
}
