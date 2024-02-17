package day9;
interface Inter1 {
	void expr1();
}
interface Inter2 {
	void expr2();
}
interface Inter3 extends Inter1, Inter2 {
	void expr3();
}
// Inter1 인터페이스, Inter2 인터페이스의 메소드 모두 구현해야 함
class InterClass implements Inter3 { 
	public void expr1() {
		System.out.println("expr1() 메서드 오버라이딩");
	}
	public void expr2() {
		System.out.println("expr2() 메서드 오버라이딩");
	}
	public void expr3() {
		System.out.println("expr3() 메서드 오버라이딩");
	}
}
public class InterfaceTest2 {
	public static void main(String args[]) {
		System.out.println("InterClass 객체를 Inter1 타입 변수에 대입");
		Inter1 obj1 = new InterClass();
		obj1.expr1(); // Inter1에 있는 메소드만 호출 가능
		System.out.println("InterClass 객체를 Inter2 타입 변수에 대입");
		Inter2 obj2 = new InterClass();
		obj2.expr2(); // Inter2에 있는 메소드만 호출 가능
		System.out.println("InterClass 객체를 Inter3 타입 변수에 대입");
		Inter3 obj3 = new InterClass();
		obj3.expr1(); // 모든 메소드 다 호출 가능
		obj3.expr2();
		obj3.expr3();
	}
}