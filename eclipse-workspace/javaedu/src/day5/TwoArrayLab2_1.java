package day5;

public class TwoArrayLab2_1 {
	public static void main(String[] args) {
		char[][] cAry = { { 'B', 'C', 'A', 'A' }, { 'C', 'C', 'B', 'B' }, { 'D', 'A', 'A', 'D' } };
		int[] iAry = new int[4];
		char[] shape = { 'A', 'B', 'C', 'D' };
		for (int i = 0; i < cAry.length; i++) {
			for (int j = 0; j < cAry[i].length; j++) {
				switch (cAry[i][j]) {
				case 'A':
					iAry[0]++;
					break;
				case 'B':
					iAry[1]++;
					break;
				case 'C':
					iAry[2]++;
					break;
				case 'D':
					iAry[3]++;
					break;
				}
			}
		}
		// 반복문으로 돌리기
		for(int k =0; k<iAry.length; k++) {
		System.out.printf("%c는 %d개입니다\n",shape[k],iAry[k]);	
		}
	}
}
