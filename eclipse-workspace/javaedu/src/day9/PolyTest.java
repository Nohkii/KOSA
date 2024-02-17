package day9;

public class PolyTest {
	public static void main(String[] args) {
		printObjInfo(new Object());
		printObjInfo("가나다");
		printObjInfo(new String("abc"));
		printObjInfo(new java.util.Date());
		printObjInfo(new java.io.File("c:\\"));
		printObjInfo(new int[10]);
		printObjInfo(new double[5]);
		printObjInfo(Integer.valueOf(100));
		printObjInfo(10); // Integer가 아니라 int형이지만 autoBoxing으로 인해 자동으로 객체로 형변환됨
		
	}
	static void printObjInfo(Object o) {
		if(o instanceof String) {
//		왼쪽: 참조하고싶은 변수 + instanceof + 오른쪽: 확인할 클래스 
			System.out.println("문자열 객체가 전달됨 : "+ o.toString()+"-"+((String)o).length());
//		'.' 연산자가 우선순위가 가장 높기 때문에 String형으로 먼저 형변환을 시킨 뒤 문자열의 길이를 구해야함 
			String s = (String) o;
		}else {
			System.out.println("전달된 객체의 타입 : " + o.getClass().getName());
		}
	}
// * static을 없애려면 객체를 생성해야 함,,
//	public static void main(String[] args) {
//		new PolyTest().printObjInfo(new Object());
//	}
//	void printObjInfo(Object o) {
//		System.out.println("전달된 객체의 타입 : " + o.getClass().getName());
//	}
}
