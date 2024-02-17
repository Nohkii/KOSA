package day4;

public class ArrayTest1_1 {

	public static void main(String[] args) {

		int[] score =  { 100, 200, 300 };

		for (int elem : score)
			System.out.println(elem);

		for (int i = 0; i < score.length; i++) {
			score[i] = score[i] * 3;
			System.out.println("score[" + i + "] :" + score[i]);
		}
	}
}
