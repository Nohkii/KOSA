package day6;

public class MethodLab3 {
	public static void main(String[] args) {
		System.out.printf(isEven(10) ? "%d은 짝수입니다." : "%d은 홀수입니다.", 10);
		System.out.println();
		System.out.printf(isEven(13) ? "%d은 짝수입니다." : "%d은 홀수입니다.", 13);
//		이렇게 할 수도 있다~
//		String result = isEven(10) ? "짝수" : "홀수";
//		System.out.println("10은 "+result+"입니다.");
//		System.out.println("13은 "+(isEven(13)?"짝수":"홀수")+"입니다.");
	}

	static boolean isEven(int num) {
		return num % 2 == 0 ? true : false;
	}
}
