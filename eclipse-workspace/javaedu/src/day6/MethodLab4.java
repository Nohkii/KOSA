package day6;

public class MethodLab4 {
	public static void main(String[] args) {
		int num1, num2 = 0;
		for (int i = 0; i < 5; i++) {
			num1 = (int) (Math.random() * 30) + 1;
			num2 = (int) (Math.random() * 30) + 1;
			System.out.printf("%d와 %d의 차는 %d입니다.\n", num1, num2, math(num1, num2));
		}
	}

	static int math(int rand1, int rand2) {
//		return  Math.abs(rand1 - rand2);
//		if(rand1 > rand2) {
//			return rand1-rand2;
//		}else if(rand2 > rand1) {
//			return rand2-rand1;
//		}else {
//			return 0;
//		}
// 		=>
		if (rand1 > rand2) {
			return rand1 - rand2;
		}
		return rand2 - rand1;
	}
}
