package day15;
import java.util.ArrayList;
import java.util.List;
public class ThreadEx17 {
	// 2개의 스레드가 1개의 ArrayList를 공유하는 상황
	// 1개의 스레드의 수행이 끝나지 않았는데 다른 스레드가 수행해서 문제가 생기는 상황
	// ArrayList를 동기화시켜야한다
	// 누군가 add하고 있으면 기다렸다가 add할 수 있게끔,,만들어야한다,,
	
	public static void main(String[] args) throws Exception {
		List<Character> buffer = new ArrayList<>();
		Thread t1 = new ShareThread1(buffer);
		Thread t2 = new ShareThread2(buffer);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("버퍼의 크기 : " + buffer.size());
		for (char e : buffer)
			System.out.print(e);
	}
}
class ShareThread1 extends Thread {
	List<Character> buffer = null; 

	ShareThread1(List<Character> buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 65; i < 91; i++)
			buffer.add((char) (i));
	}
}
class ShareThread2 extends Thread {
	List<Character> buffer = null;

	ShareThread2(List<Character> buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 97; i < 123; i++)
			buffer.add((char) (i));
	}
}
