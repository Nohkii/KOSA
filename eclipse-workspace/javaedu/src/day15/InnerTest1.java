package day15;

class Outer {
	void pr() {
		System.out.println("Outer's pr() Method !!");
	}
	class Inner {
		void pr() {
			System.out.println("Inner's pr() Method !!");
		}
	}
	static class Static_Inner {
		static void pr() {
			System.out.println("Static_Inner's pr() Method !!");
		}
	}
}
public class InnerTest1 {
	public static void main(String args[]) {
		Outer.Static_Inner.pr(); //  static이라 바로 접근 가능
		Outer o = new Outer(); // 먼저 주인집 객체 생성
		o.pr();
		Outer.Inner i = o.new Inner(); // 이너 멤버 클래스 객체 생성
		i.pr();
	}
}
