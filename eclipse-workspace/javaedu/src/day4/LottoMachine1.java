package day4;

public class LottoMachine1 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int idx = 0, ran;
		boolean flag;
		while (idx < lotto.length) {
			ran = (int) (Math.random() * 45) + 1;
			flag = true;
			for (int i = 0; i < idx; i++) {
				if (lotto[i] == ran) {
					flag = false;
					break;
				}
			}
			if (flag) {
				lotto[idx] = ran;
				idx++;
			}
		}
//		for (int i = 0; i < 6; i++) {
//			lotto[i] = (int) (Math.random() * 45) + 1;
//			for (int j = 0; j < i; j++) {
//				if (lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		Arrays.sort(lotto);
		System.out.print("오늘의 로또 번호 - ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("%d%s", lotto[i], (i != lotto.length - 1) ? "," : "");
		}
//		for (int i = 0; i < lotto.length; i++) {
//			if (i == lotto.length - 1) {
//				System.out.print(lotto[lotto.length - 1]);
//				break;
//			}
//			System.out.print(lotto[i] + ", ");
//		}
	}
}