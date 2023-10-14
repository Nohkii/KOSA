package day4;

public class ArrayLab1 {
	public static void main(String[] args) {
		int[] ary;
		ary = new int[10];
		int sum;
		for (int a : ary) {
			System.out.print(a + " ");
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = (i + 1) * 10;
		}
		System.out.println("\n첫 번째 : " + ary[0]+"\n마지막 : " + ary[ary.length - 1]+"\n합 : " + (int) (ary[0] + ary[ary.length - 1]));
		for (int a : ary) {
			System.out.print(a + " ");
		}
		System.out.println();
		for (int i = ary.length - 1; i > 0; i--) {
			System.out.print(+ary[i] + " ");
		}
		System.out.println();
		for(int i =1; i<ary.length; i+=2) {
			System.out.print(ary[i]+" ");
		}
	}
}