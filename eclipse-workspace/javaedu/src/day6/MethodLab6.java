package day6;
public class MethodLab6 {
	public static void main(String[] args) {
		System.out.println("가장 큰 값은 " + maxNumArray(new int[] { 10, 20, 30 }) + "입니다.");
		System.out.println("가장 큰 값은 " + maxNumArray(new int[] { 100, 500, 300, 200, 400 }) + "입니다.");
		System.out.println("가장 큰 값은 " + maxNumArray(new int[] { 1, 10, 3, 4, 5, 8, 7, 6, 9, 2 }) + "입니다.");
	}
	static int maxNumArray(int[] num) {
		int max = num[0];
		for (int i = 0; i < num.length; i++) {
			if (max < num[i]) {
				max = num[i];
			}
		}
		return max;
	}
}
