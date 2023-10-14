package day3;

public class ForLab8 {
	public static void main(String[] args) {
		String str = "*";
		for (int i = 0; i <5; i++) {
			for(int k=0; k<=i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 10; j++) {
				System.out.print(str);
			}
			System.out.print("\n");
		}
	}
}
