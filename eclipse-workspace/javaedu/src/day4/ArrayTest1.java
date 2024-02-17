package day4;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] score = new int[5]; // 더이상 참조되지않으면 알아서 정리됨
		System.out.println(score); // 메모리상에 할당된 참조값
		System.out.println(score.length); // 길이(크기)
		// System.out.println(score[0]); // 초기값 0
		// System.out.println(score[4]); // 초기값 0

		for (int i = 0; i < score.length; i++)
			System.out.println("score[" + i + "] :" + score[i]);

		score = new int[] { 100, 200, 300 };
		System.out.println(score); // 메모리상에 할당된 참조값
		System.out.println(score.length); // 길이(크기)
		System.out.println(score[0]); // 초기값 0
		System.out.println(score[2]); // 초

		for (int i = 0; i < score.length; i++)
			System.out.println("score[" + i + "] :" + score[i]);

		for (int i = 0; i < score.length; i++) {
			score[i] = score[i] * 3;
			System.out.println("score[" + i + "] :" + score[i]);
		}
	}
}
