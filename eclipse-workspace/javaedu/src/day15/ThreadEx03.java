package day15;

class ThreadEx03 {
	public static void main(String args[]) throws Exception {
		ThreadEx3_1 t1 = new ThreadEx3_1();
		t1.run(); // 스레드를 실행시키는 것이 아니라 run()를 호출하는것
		// 스레드를 실행시키려면 start()를 호출해야함
	}
}

class ThreadEx3_1 extends Thread {
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
