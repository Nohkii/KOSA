package day4;

public class ReArrayLab5 {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 6) + 5;
		int[] ary = new int[num];
		char[] charAry = new char[num];
		
		for (int i = 0; i < ary.length; i++) {
			ary[i] = (int) (Math.random() * 26) + 1;
		}
		for (int i = 0; i < ary.length; i++) {
			charAry[i] = (char) Character.toLowerCase(ary[i] + 64);
		}
		
		for (int i = 0; i < ary.length; i++) {
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
// 2차
//int num = (int) (Math.random() * 6) + 5;
//int[] ary = new int[num];
//char[] charAry = new char[num];
//
//for (int i = 0; i < ary.length; i++) {
//	ary[i] = (int) (Math.random() * 26) + 1;
//	charAry[i] = (char) Character.toLowerCase(ary[i] + 64);
//	if (i == ary.length - 1) {
//		System.out.print(ary[ary.length - 1]);
//		break;
//	}
//	System.out.print(ary[i] + ",");
//}
//System.out.println();
//for (int i = 0; i < charAry.length; i++) {
//	if (i == charAry.length - 1) {
//		System.out.print(charAry[charAry.length - 1]);
//		break;
//	}
//	System.out.print(charAry[i] + ",");
//}


// 1차
//int num = (int) (Math.random() * 6) + 5;
//int[] ary = new int[num];
//char[] charAry = new char[num];
//
//for (int i = 0; i < ary.length; i++) {
//	ary[i] = (int) (Math.random() * 26) + 1;
//}
//for (int i = 0; i < ary.length; i++) {
//	charAry[i] = (char) Character.toLowerCase(ary[i] + 64);
//}
//
//for (int i = 0; i < ary.length; i++) {
//	if (i == ary.length - 1) {
//		System.out.print(ary[ary.length - 1]);
//		break;
//	}
//	System.out.print(ary[i] + ",");
//}
//System.out.println();
//for (int i = 0; i < charAry.length; i++) {
//	if (i == charAry.length - 1) {
//		System.out.print(charAry[charAry.length - 1]);
//		break;
//	}
//	System.out.print(charAry[i] + ",");
//}