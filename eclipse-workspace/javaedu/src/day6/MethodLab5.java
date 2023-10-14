package day6;
public class MethodLab5 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.print((i < 4) ? getRandom(10) + "," : getRandom(10));
		}
		System.out.println();
		for (int i = 0; i < 5; i++) {
			if (i < 4)
				System.out.print(getRandom(10, 20) + ",");
			else
				System.out.print(getRandom(10, 20));
//			if(i != 4) System.out.print(","); // 이렇게 한 줄로 할 수 있다,,
		}
	}
	public static int getRandom(int n) {
		return (int) ((Math.random() * n) + 1);
	}
	public static int getRandom(int n1, int n2) {
		return (int) ((Math.random() * (n2 - n1 + 1)) + n1);
	}
}
