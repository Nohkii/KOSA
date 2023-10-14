package day6;
public class MethodLab7 {
	public static void main(String[] args) {
		printArray(powerArray(2));
		printArray(powerArray(3));
		printArray(powerArray(4));
	}
	static int[] powerArray(int num) {
		int[] ary = new int[10];
		for (int i = 0; i < 10; i++) {
			ary[i] = (i + 1) * num;
		}
		return ary;
	}
	public static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.print((i < numbers.length - 1) ? numbers[i] + "," : numbers[i]);
		}
		System.out.println();
	}
}