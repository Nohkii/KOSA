package day4;

import java.util.Arrays;

public class LottoMachine2 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		for (int i = 0; i < 6; i++) {
			if (i == 5) {
				break;
			}
			Arrays.sort(lotto);
			lotto[i] = (int) (Math.random() * 45) + 1;
			lotto[i + 1] = (int) (Math.random() * 45) + 1;
			
			if (lotto[i] == lotto[i + 1]) {
				lotto[i] = (int) (Math.random() * 45) + 1;
			}
		}
		for (int n : lotto) {
			System.out.println(n + " ");
		}
	}
}
//for (int i = 0; i < 6; i++) {
//	if (i == 5) {
//		break;
//	}
//	lotto[i] = (int) (Math.random() * 45) + 1;
//	lotto[i + 1] = (int) (Math.random() * 45) + 1;
//	
//	if (lotto[i] == lotto[i + 1]) {
//		lotto[i + 1] = (int) (Math.random() * 45) + 1;
//	}
//}
//for (int n : lotto) {
//	System.out.println(n + " ");
//}