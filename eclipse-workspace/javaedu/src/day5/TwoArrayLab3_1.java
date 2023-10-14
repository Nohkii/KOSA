package day5;

public class TwoArrayLab3_1 {
	public static void main(String[] args) {
		// 선생님이 올려주시는 코드 참고하기~~
		
		int[][] playtime = { { 5, 2, 1, 0, 2, 3, 6 }, // 0 0 / 0 1 / 0 3
				{ 4, 3, 2, 1, 1, 0, 5 }, // 1 0 / 1 1 / 1 3
				{ 3, 1, 2, 1, 3, 1, 3 }, // 2 0 / 2 1 /
				{ 4, 3, 1, 0, 4, 2, 7 }, // 3 0 / 3 1
		};
		int[] daytime = new int[7];
		int[] weektime = new int[4];
		for (int i = 0; i < playtime.length; i++) {
			for (int j = 0; j < playtime[i].length; j++) {
				int time = playtime[i][j];
				daytime[j] += time;
				weektime[i] += time;
			}
			System.out.println();
		}
		char[] day = {'일', '월','화','수','목','금','토'};
		for (int i = 0; i < day.length; i++) {
			System.out.printf("%c요일:%d시간");
		
		}
	}
}
