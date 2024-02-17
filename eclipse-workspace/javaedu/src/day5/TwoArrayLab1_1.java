package day5;

// 발표코드
public class TwoArrayLab1_1 {
	public static void main(String[] args) {
		int[][] ary = new int[4][4];
		int ten = 10;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[0].length; j++) {
				ary[i][j] = ten;
				ten += 2;
			}
			System.out.println();
		}
		System.out.print("\n오른쪽 대각선 데이터들:");
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i][ary.length-1-i] + " ");
		} 
	}
}