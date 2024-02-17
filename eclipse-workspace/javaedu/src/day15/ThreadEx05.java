package day15;

class ThreadEx05 {
	static long startTime = 0;
// - 출력하고 자고 들어가면 th1이 출력하고~ |출력하고 자러가면 - 출력하고~
	public static void main(String args[]) throws InterruptedException {
		startTime = System.currentTimeMillis();
		ThreadEx5_1 th1 = new ThreadEx5_1();
		th1.start();
		for (int i = 0; i < 20; i++) {
			System.out.print("-");
			Thread.sleep(1000); 
		}

		System.out.print("소요시간:" + (System.currentTimeMillis() - ThreadEx05.startTime));
	}
}

class ThreadEx5_1 extends Thread {
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				System.out.print("|");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
