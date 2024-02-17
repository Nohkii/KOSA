package day6;

public class MethodLab2_1 {
	public static void main(String[] args) {
		art('*', 5);
	}

	static void art(char str, int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = num - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print(str);
			}
			System.out.println();
		}
	}
}
