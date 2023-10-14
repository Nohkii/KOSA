package day5;

public class MethodLab4 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < 5; i++) {
			num1 = (int) (Math.random() * 30) + 1;
			num2 = (int) (Math.random() * 30) + 1;
			System.out.printf("%d와 %d의 차는 %d입니다.\n", num1, num2, math(num1, num2));
		}
	}
	static int math(int rand1, int rand2) {		
//		return  Math.abs(rand1 - rand2);

//	if - else문
//		if(rand1 - rand2>0) {
//			return rand1-rand2; 	
//		}else {
//			return rand2 - rand1;
//		}
		
// if문
		if(rand1 < rand2) {
			return rand2-rand1;
		}
		return rand1 - rand2;
	}
}