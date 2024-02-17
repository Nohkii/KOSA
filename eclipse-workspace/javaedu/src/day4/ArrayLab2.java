package day4;

public class ArrayLab2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 17) + 4;
			sum += arr[i];
		}
		System.out.print("모든 원소의 값 : ");
		for (int i = 0; i < arr.length; i++) {
			
//			이렇게 하면 굳이 break안쓰고 할 수 있음,,
//			System.out.println(arr[i]);
//			if(i<9)
//				System.out.println(",");
			
			if (i == arr.length - 1) {
				System.out.print(arr[arr.length - 1]);
				break;
			}
			System.out.print(arr[i] + ",");
		}
		System.out.println("\n모든 원소의 합 : " + sum);
	}
}