package day4;

public class ArrayLab4 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 5;
		int[] ary = new int[num];
		char[] charAry = new char[num];
		
		// final int CODE = 'a' - 1; 이렇게 상수로 만들어놓고 써도 괜찮다~
		// 96을 더하면 굳이 Character.toLowerCase를 쓰지않아도 된다~
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int) (Math.random() * 26) + 1;
			charAry[i] = (char) Character.toLowerCase(ary[i] + 64);
			if (i == ary.length - 1) {
				System.out.print(ary[ary.length - 1]);
				break;
			}
			System.out.print(ary[i] + ",");
		}
		System.out.println();
		for (int i = 0; i < charAry.length; i++) {
			if (i == charAry.length - 1) {
				System.out.print(charAry[charAry.length - 1]);
				break;
			}
			System.out.print(charAry[i] + ",");
		}
	}
}