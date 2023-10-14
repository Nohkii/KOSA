package prac;

import java.util.ArrayList;

public class Solution {
	/*
	 * public static int solution(int[] arr) { return 0; }
	 */

	public static void main(String[] args) {
		String str1 = "42";
		String str2 = "abc";

		// parseInt() 사용
		int number1 = 0;
		try {
		    number1 = Integer.parseInt(str1); // 정상적인 변환
		    int number2 = Integer.parseInt(str2); // 변환 실패 - NumberFormatException 발생
		} catch (NumberFormatException e) {
		    // 오류 처리
		}

		// valueOf() 사용
		Integer number3 = Integer.valueOf(str1); // 정상적인 변환
		Integer number4 = Integer.valueOf(str2); // 변환 실패 - null 반환

		System.out.println("number1: " + number1); // 출력: 42
//		System.out.println("number2: " + number2); // 예외 발생
		System.out.println("number3: " + number3); // 출력: 42
		System.out.println("number4: " + number4); // 출력: null

	}
}