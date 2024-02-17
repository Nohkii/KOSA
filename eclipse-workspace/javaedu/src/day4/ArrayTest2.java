package day4;

public class ArrayTest2 {

	public static void main(String[] args) {
		int score[] = new int[5];		
		System.out.println(score); // 번지값 출력
		
		for (int i=0; i < score.length; i++)
			System.out.println(score[i]); // 0 0 0 0 0 
	
		int[] score1 = new int[]{100, 200, 300, 400};		
		System.out.println(score1); // 번지값?.?
		
		for (int i=0; i < score1.length; i++)
			System.out.println(score1[i]); // 100 200 300 400
		
		int[] score2 = {1000, 2000};	// 배열변수 선언을 함께 하는 경우에만 가능	
		System.out.println(score2); // 번지값
		for (int i=0; i < score2.length; i++)
			System.out.println(score2[i]); // 1000 2000
		
		score2 = new int[]{11, 22, 33, 44, 55};
		System.out.println(score2);
		for (int i=0; i < score2.length; i++)
			System.out.println(score2[i]);		
	}
}
