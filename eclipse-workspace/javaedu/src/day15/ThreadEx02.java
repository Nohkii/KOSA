package day15;

class ThreadEx02 {
	public static void main(String args[]) throws Exception {
		ThreadEx2_1 t1 = new ThreadEx2_1();
		t1.start(); // 워커스레드 실행
	  //t1.run();  -> 스레드를 실행시키는 것이 아니라 run()를 호출하는것
	}
}
class ThreadEx2_1 extends Thread {
	public void run() {
		throwException();
	}
	public void throwException() {
		try {
			throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
