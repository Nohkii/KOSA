package day3;

public class ForLab6 {
	public static void main(String[] args) {
		final char STR = '&';
		int random = (int) (Math.random() * 5) + 5;

		if ((random == 5) || (random == 7)) {
			for (int i = 0; i < random; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print(STR);
				}
				System.out.println();
			}
		}
	}
}
