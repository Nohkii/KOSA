package day15;

public class ThreadEx10 {
	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}
}
// 상태를 체크하는 애다~
class StatePrintThread extends Thread {
	private Thread targetThread;
// 매개변수로 쓰레드를 받음(타겟 쓰레드를 감시하는 역할)
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	public void run() {
		while (true) {
			// Thread.State -> 이너클래스
			Thread.State state = targetThread.getState(); // 이렇게 호출하면 NEW, RUNNABLE…중에서 하나가 리턴된다,,
			System.out.println("타겟 스레드 상태: " + state);
			if (state == Thread.State.NEW) {
				System.out.println("START");
				targetThread.start();
			}
			if (state == Thread.State.TERMINATED) {
				break;
			}
			try {
				// 0.5초간 일시 정지
				Thread.sleep(50);
			} catch (Exception e) {
			}
		}
	}
}

class TargetThread extends Thread {
	public void run() {
		for (long i = 0; i < 1000000000; i++) {
		}
		try {
			Thread.sleep(1500); // 이때 TIMED_WAITING 상태가 추출됨
		} catch (Exception e) {
		}

		for (long i = 0; i < 1000000000; i++) {
		}
	}
}