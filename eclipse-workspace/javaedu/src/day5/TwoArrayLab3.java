package day5;
public class TwoArrayLab3 {
	public static void main(String[] args) {
		int[][] ary = { // 0 1
				{ 5, 2, 1, 0, 2, 3, 6 }, // 0 0 / 0 1 / 0 2 / 0 3
				{ 4, 3, 2, 1, 1, 0, 5 }, // 1 0 / 1 1 / 1 2 / 1 3
				{ 3, 1, 2, 1, 3, 1, 3 }, // 2 0 / 2 1 /
				{ 4, 3, 1, 0, 4, 2, 7 }, // 3 0 / 3 1
		};
		int c = 0;
		int d = 0;
		// 열마다 0번째, 1번째,, 다 더해서 일별의 0번째 1번째에 넣어야 함
		int[] dayAry = new int[7];
		int[] WeekAry = new int[7];
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
//				System.out.print(ary[c][j]+" ");
				dayAry[i] += ary[j][c];
				if (j == 3) {
					break;
				}
			}
			if (c == 6) {
				break;
			}
			c++;
		}
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				WeekAry[i] += ary[i][j];
			}
		}
		for (int a : dayAry) {
			System.out.println(a + " ");
		}
		for (int i = 0; i < 4; i++) {
			System.out.println(i + "주차 : " + WeekAry[i] + "시간");
		}
	}
}