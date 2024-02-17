package day15;

abstract class Test {
	Test() {
		System.out.println("No Argument sample");
	}
	abstract void output(String s);
}
public class InnerTest3 {
	void pr(Test o) {
		o.output("Test");
	}
	public static void main(String args[]) {
		System.out.println("Main start !!");
		// 1. 먼저 InnerTest3 객체 생성
		// 2. InnerTest3의 pr메소드를 정의할 수 있는 상태로 만듦
		InnerTest3 n = new InnerTest3();
		// 3. 익명 클래스를 추상 클래스의 자식으로 만들어서 사용
		n.pr(new Test() {
			int su = 100;
			// 추상 클래스의 메소드 반드시 오버라이딩
			public void output(String s) { // 부모가 아니라 자식의 output 메소드가 사용됨!!
				System.out.println("Anonymous Class : " + s);
				System.out.println("Anonymous Class : " + su);
			}
		});
	}
}
