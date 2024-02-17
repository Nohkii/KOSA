package day9;
interface Printable {
	public static final int PRINT_TYPE1 = 1;
	// 위처럼 public static final을 붙여줘야하는데 없어도 컴파일될때 자동으로 붙는다~
	static final int PRINT_TYPE2 = 2; //
	final int PRINT_TYPE3 = 3;
	int PRINT_TYPE4 = 4;

	public abstract void print(int type);
	abstract void setPage(int su);
	boolean isAvailable();
}
abstract class Shape3 {
	String color;

	abstract void draw();
	void setColor(String color) {
		this.color = color;
	}
}
class Circle3 extends Shape3 implements Printable {
	// Shape3를 상속받고 Printable 인터페이스를 구현함
	int page;

	void draw() { // Shape3의 메서드 구현
		System.out.println(color + " 원을 그리는 기능");
	}
	// 오버라이딩할 때는 public 제어자를 붙여야지 안그러면 에러남(확장은 가능하지만 축소는 불가능하기때문)
	public void print(int type) { // Printable 인터페이스의 메서드 구현
		System.out.println(type + "번 방식으로 " + page + "페이지를 프린팅한다.");
	}
	public void setPage(int page) { // Printable 인터페이스의 메서드 구현					
		this.page = page;
	}
	public boolean isAvailable() { // Printable 인터페이스의 메서드 구현
		if (color.equals("흰색"))
			return false;
		else
			return true;
	}
}
class Rectangle3 extends Shape3 {
	void draw() {
		System.out.println(color + " 사각형을 그리는 기능");
	}
}
class Triangle3 extends Shape3 {
	void draw() {
		System.out.println(color + " 삼각형을 그리는 기능");
	}
}
public class InterfaceTest1 {
	public static void main(String args[]) {
		printOut(new Circle3());
		//printOut(new Rectangle3()); // 컴파일 오류가 발생하는 행
	}
	static void printOut(Printable prt) { 
		prt.setPage(100);
		((Shape3) prt).setColor("파란색");
//		((Circle3) prt).setColor("파란색");
// =========================================================		
//		 prt.setColor("파란색"); -> 이렇게는 오류남,,
	
		if (prt.isAvailable())
			prt.print(Printable.PRINT_TYPE2);
	}
}