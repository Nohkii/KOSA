package day5;

public class TwoArrayLab5 {
	public static void main(String[] args) {
		// 열의 인덱스: 0, 1, 2(0~ 열의 개수-1)
		// 행의 인덱스:
			// 열의 인덱스가 0 -> 0,1,2,3,4
			// 열의 인덱스가 1 -> 1,2,3
			// 열의 인덱스가 2 -> 2
		// => 열의 인덱스: 행의개수 - 열의인덱스
		int[][] ary = new int[5][3];
		for(int i =0; i<ary.length; i++) {
			for(int j =0; j<ary[i].length; j++) {
				System.out.print(ary[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		int sum =1;
		for(int i =0; i<ary.length; i++) {
			for(int j =0; j<ary[i].length+2; j++) {
			ary[j][i]= sum;
			System.out.print(ary[i][j]+" ");
			sum++;
			}
			System.out.println();
		}
	}
}
// 1	0	0	 // 0 0	
// 2	6	0	//  1 0	 
// 3	7	9	// 2 0	
// 4	8	0	//	3 0
// 5	0	0      4 0
//					1 1
//					2 1
//					3 1
//					2 2
// 0에서 시작해서 처음에는 행만 +1증가 
// 한바퀴 돌면 둘 다 +1 하고 행 +1 증가 동일