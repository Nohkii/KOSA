package day3;

public class WhileLab2 {

	public static void main(String[] args) {
		int pairNum1;
		int pairNum2;
		out: while (true) {
			pairNum1 = (int) (Math.random() * 6) + 1;
			pairNum2 = (int) (Math.random() * 6) + 1;
			if (pairNum1 > pairNum2) {
				System.out.println("pairNum1이 pairNum2보다 크다.");
			} else if (pairNum1 < pairNum2) {
				System.out.println("pairNum2이 pairNum1보다 크다.");
			} else {
				System.out.println("게임 끝");
				break out; // 라벨붙일필요 없다 어차피 반복문은 한개니까~~
			}

//			if (pairNum1 != pairNum2) {
//				if (pairNum1 > pairNum2) {
//					System.out.println("pairNum1이 pairNum2보다 크다.");
//				} else {
//					System.out.println("pairNum2이 pairNum1보다 크다.");
//				}
//			} else {
//				System.out.println("게임 끝");
//				break out;
//			}
		}
	}
}
