package day5;

public class TwoArrayLab1 {
	public static void main(String[] args) {
		int[][] ary = new int[4][4];
		int num = 5;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = 2 * num;
				if (j == ary[i].length - 1) {
					break;
				}
				num++;
			}
			num++;
		}
		System.out.println("1행 1열의 데이터: " + ary[0][0]);
		System.out.println("3행 4열의 데이터: " + ary[2][3]);
		System.out.println("행의 갯수: " + ary.length);
		System.out.println("열의 갯수: " + ary.length);
		System.out.print("3행의 데이터들:");
		for (int i = 0; i < ary[3].length; i++) {
			System.out.print(ary[2][i] + " ");
		}
		System.out.print("\n2행의 데이터들:");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i][1] + " ");
		}
		System.out.print("\n왼쪽 대각선 데이터들:");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i][i] + " ");
		}
		System.out.print("\n오른쪽 대각선 데이터들:");
		int n = 3;
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i][n] + " ");
			n--;
			if (n == -1)
				break;
		}
	}
}