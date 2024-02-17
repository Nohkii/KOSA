package day3;

public class ControlLab1 {
	public static void main(String[] args) {
		int random = 0;
		int sum = 0;
		int count = 0;
		while (true) {
			random = (int) (Math.random() * 11) + 10;
			if (random % 3 == 0 || random % 5 == 0) {
				for (int i = 1; i <= random; i++) {
					sum += i;
				}
				System.out.println("1부터 " + random + "까지의 총 합:" + sum);
				sum = 0;
				count++;
				continue; // ㅋㅋ 왜해놨지..? 없어도 된다~
			} else if (random == 11 || random == 17 || random == 19) {
				System.out.println(count + "회 반복함");
				break;
			} else {
				System.out.println("재수행");
				continue; // ㅋㅋ 왜해놨지..?
			}
		}
		
//		int random = 0;
//		int sum = 0;
//		int count = 0;
//		while (true) {
//			random = (int) (Math.random() * 11) + 10;
//			System.out.println("숫자:"+random);
//			if (random % 3 == 0 || random % 5 == 0) {
//				for (int i = 1; i < random; i++) {
//					random += i;
//				}
//				System.out.println("총 합:" + random);
//				count++;
//				continue;
//			} else if (random == 11 || random == 17 || random == 19) {
//				System.out.println(count + "회 반복함");
//				break;
//			} else {
//				System.out.println("재수행");
//				continue;
//			}
//		}
		
	}
}
