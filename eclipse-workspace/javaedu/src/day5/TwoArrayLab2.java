package day5;

public class TwoArrayLab2 {
	public static void main(String[] args) {
		char[][] cAry = {
				{'B', 'C', 'A', 'A'},
				{'C', 'C', 'B', 'B'},
				{'D', 'A', 'A', 'D'}
		};
		int[] iAry = new int[4];
		for(int i =0; i<cAry.length; i++) {
			for(int j =0; j<cAry[i].length; j++) {
				if(cAry[i][j] == 'A') {
					iAry[0]++;
				}else if(cAry[i][j] == 'B') {
					iAry[1]++;
				}else if(cAry[i][j] == 'C') {
					iAry[2]++;
				}else {
					iAry[3]++;
				}
			}
		}
		System.out.println("A는 "+iAry[0]+"개 입니다. \nB는 "+iAry[1]+"개 입니다. \nC는 "+iAry[2]+"개 입니다. \nD는 "+iAry[3]+"개 입니다.");
	}
}
