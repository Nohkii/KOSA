package day4;

public class ArrayLab3 {
	public static void main(String[] args) {
		char[] java = { 'J', 'a', 'v', 'a' };
// 아예 변수로 만들어서 해도 된다~ 이러면 굳이 메소드 안써도 할 수 있음
//		int m = 'a'-'Z';
//		for (int i = 0; i < java.length; i++) {
//			if  (java[i]>'Z') {
//				java[i] -=m;
//			} else {
//				java[i] +=m;
//			}
//		}
		for (int i = 0; i < java.length; i++) {
			if (97 <= (int) java[i]) {
				java[i] = Character.toUpperCase(java[i]);
			} else {
				java[i] = Character.toLowerCase(java[i]);
			}
		}
		for (char e : java) {
			System.out.println(e);
		}
	}
}