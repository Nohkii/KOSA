package day10;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) throws Exception {
		Runtime r = Runtime.getRuntime();
		System.out.println(r);
//		r.exec("c:/windows/notepad.exe");
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		System.out.println(r1);
		System.out.println(r2);
		/**
		 * Runtime은 새로운 객체를 생성하지 않고 생성한 객체를 계속 
		 * 재활용함
		 * 
		 * 왜? JVM이 하나이기 때문에 ~
		 * -> Runtime이 곧 JVM이라고 볼 수 있다~
		 */
		r.gc();// GarbageCollection 호출 (바로 실행하지는 않지만 체크는 함)
	}

}
