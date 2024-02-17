package day4;

public class Thisisjava1 {

	public static void main(String[] args) {
//		5. 주어진 배열 항목의 전체 합과 평균을 구해 
//		출력하는 코드를 작성해보세요(중첩 for 문 이용)

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
		int sum = 0;
		int len = 0;
		double avg = 0.0;
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			len += array[i].length;
			for (int j = 0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
				sum += array[i][j];
				count++;
			}
		}
		avg = (double)sum/count;
		System.out.println("합:" + sum);
		System.out.println("길이:" + len);
		System.out.println("평균"+avg);
	}
}
