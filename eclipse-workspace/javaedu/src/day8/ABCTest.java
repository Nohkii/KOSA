package day8;
// 상속 예제
class A {
	A(){
		System.out.println("A 클래스의 객체 생성 ~~");
	}
}
class B extends A{
	B(int num){
		super(); // 조상들의 멤버 호출;
		System.out.println("B 클래스의 객체 생성 ~~");
	}
}
class C extends B{
	C(){
		super(0); // 조상들의 멤버 호출(조상 생성자와 매개변수 타입도 맞춰야 함)
		System.out.println("C 클래스의 객체 생성 ~~");
	}
}
public class ABCTest {
	public static void main(String[] args) {
		new C();
	}
}