package day9;

// 추상 메서드를 가지고 있기 때문에 추상 클래스
abstract class Shape {
	String color;

	abstract void draw(); // 추상 클래스는 {}구현부가 없이 ;로 마무리됨 

	void setColor(String color) {
		this.color = color;
	}
}

class Circle2 extends Shape {
	void draw() {
		System.out.println(color + " 원을 그리는 기능");
	}
}

class Rectangle2 extends Shape {
	void draw() {
		System.out.println(color + " 사각형을 그리는 기능");
	}
}

class Triangle2 extends Shape {
	void draw() {
		System.out.println(color + " 삼각형을 그리는 기능");
	}
}

public class AbstractTest2 {
	public static void main(String args[]) {
		Shape s = new Circle2();
		s.setColor("파란색");
		printInfo(s);
		s = new Rectangle2();
		s.setColor("분홍색");
		printInfo(s);
		s = new Triangle2();
		s.setColor("연두색");
		printInfo(s);
	}

	static void printInfo(Shape obj) { // 매개변수를 부모 Shape type으로
		obj.draw();
	}
}
