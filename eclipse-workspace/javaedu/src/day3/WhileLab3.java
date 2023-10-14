package day3;

public class WhileLab3 {

	public static void main(String[] args) {
		int num;
		int count = 0;
		while (true) {
			num = (int) (Math.random() * 30) + 1;
			if (num == 0 || (num >= 27 && num <= 30)) {
				System.out.println("출력횟수는 "+count+"번 입니다.");
				break;
			} else {
				System.out.print(num);
				num+=64;
				System.out.printf("-%c, %1$d, 0x%1$x\n", num);
				count++;
			}
		}
	}
}
