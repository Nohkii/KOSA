package day15;

public class ThreadEx08 { // 총 스레드 개수는 4개 (main+A+B+C)
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); // 메인 스레드 리턴시키기
		System.out.println("[ 프로그램 시작 스레드 이름 ] : " + mainThread.getName());
		System.out.println("-------------------------------");
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());

		ThreadB threadB = new ThreadB("쓰레드B");
		System.out.println("작업 스레드 이름: " + threadB.getName());

		ThreadC threadC = new ThreadC();
		System.out.println("작업 스레드 이름: " + threadC.getName());
		threadA.start();
		threadB.start();
		threadC.start();

		for (int i = 0; i < 3; i++)
			System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
	}
}

class ThreadA extends Thread {
	public ThreadA() {
		setName("쓰레드A");  // -> 스레드 이름 정하는 법
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}		
	}
}

class ThreadB extends Thread {
	public ThreadB(String name) {
		super(name); // -> 스레드 이름 정하는 법
	}

	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}		
	}
}

class ThreadC extends Thread {
	public void run() { // 이름안정하면 JVM이 알아서 이름을 정함
		for (int i = 0; i < 2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}		
	}
}