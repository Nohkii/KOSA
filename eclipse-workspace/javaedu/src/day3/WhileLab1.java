package day3;

public class WhileLab1 {

	public static void main(String[] args) {
		int random = (int) (Math.random() * 6) + 5;
		int num = 1;
		System.out.println("[for 결과]");
		for (int i = 1; i <= random; i++) {
			System.out.println(i + "->" + i * i);
		}
		System.out.println("[while 결과]");
		while (num <= random) {
			System.out.println(num + "->" + num * num);
			num++;
		}
	}
}
