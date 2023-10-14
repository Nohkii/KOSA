package day6;

public class MethodLab2 {
	public static void main(String[] args) {
		art('*', 5);
	}
	static void art(char str, int num) {
		for (int i = 1; i < num; i++) {
			for (int j = num; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print(str);
				}
			}
			System.out.println();
		}
	}
}
