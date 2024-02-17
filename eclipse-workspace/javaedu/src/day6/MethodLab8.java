package day6;
public class MethodLab8 {
	public static void main(String[] args) {
	System.out.println("호출 1: "+addEven(10, 2, 5, 13, 7));
	System.out.println("호출 2: "+addEven(11, 22, 33, 44, 55, 66));
	System.out.println("호출 3: "+addEven());
	System.out.println("호출 4: "+addEven(100,101,103));
	}
	static int addEven(int... num) {
		if (num == null || num.length == 0) {
			return -1;
		}
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sum += num[i];
			}
		}
		return sum;
	}
}
