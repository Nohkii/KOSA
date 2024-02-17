package day2;
public class AlphaTest {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 26) + 1;
		for(int i =1; i<=num; i++) {
			if(num == i) {
				System.out.printf("추출된 문자 : %d\n%c", num, num+64);
			}
		}
	}
}