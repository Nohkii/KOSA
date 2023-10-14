package day12;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class HashMapLab1 {
	public static void main(String[] args) {
		String country = "";
		int num;
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> list = new HashMap<>();
		while (true) {
			System.out.println("나라 이름을 입력하세요 : ");
			country = scan.next();
			while (list.get(country) != null) {
				System.out.println("나라명 " + country + "는 이미 저장되었습니다. 나라 이름을 입력하세요 :");
				country = scan.next();
				if (list.get(country) == null)
					break;
			}
			System.out.println("인구 수를 입력하세요 : ");
			num = scan.nextInt();
			list.put(country, num);
			if (list.size() == 3) {
				System.out.println("5개가 모두 입력되었습니다.");
				break;
			}
		}
		System.out.print("입력된 데이터 : ");
		// 복붙해도 반복문안에 변수 선언한다던가 하는 거는 수정하자,,,,,
		Iterator<Map.Entry<String, Integer>> iterator = list.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.print(key + " (" + value + ")");
			if (iterator.hasNext()) {
				System.out.print(",");
			}
			System.out.print(" ");
		}
	}
}