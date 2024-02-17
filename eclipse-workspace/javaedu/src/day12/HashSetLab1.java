package day12;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetLab1 {
	public static void main(String[] args) {
		int num;
		HashSet<Integer> lotto = new HashSet<>();
//		while (true) {
//			lotto.add((int) (Math.random() * 21) + 1);
//			if (lotto.size() == 10) {
//				break;
//			}
//		}
		/**
		 * 이렇게 break안하고 할 수도 있다~ 
		 */
		while (lotto.size() != 10) {
			lotto.add((int) (Math.random() * 21) + 1);
		}
		System.out.print("오늘의 로또 번호 : ");
		Iterator<Integer> iterator = lotto.iterator();
		while (iterator.hasNext()) {
		/**
		 * 	이렇게 한 줄로 작성해도 된다~
		 */
//			Integer str = iterator.next();
//			System.out.print(str);
			
			System.out.print(iterator.next());
			if (iterator.hasNext()) {
				System.out.print(", ");
			}
				System.out.print(""); // 얘는 굳이 안적어도 된다~
		}
	}
}