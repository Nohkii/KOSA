package day12;
import java.util.Date;
class Value {
	int value;
	Value(int value) {
		this.value = value;
	}
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj != null && obj instanceof Value) 
//		if(value == obj.value) { // 자손에서 추가된 애는 접근할 수가 없음 -> 형변환해서 접근
			if (value == ((Value) obj).value)  // 자손에서 추가된 애는 접근할 수가 없음 -> 형변환해서 접근
				result = true;
		return result;
	}
}
public class EqualsTest3 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		System.out.println(v1.equals(null));
		System.out.println(v1.equals(v3));
		System.out.println(v1.equals(v2)); // equals메소드를 상속하고있지않기때문에 false가 나온다,,,??
		System.out.println(v1.equals(new Date()));

		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
		v2 = v1; // v1이 가지고 있는 참조값을 v2에게도 넣어준다~(하나의 객체를 공유하게 됨)
		// Object에 있는 '.equals()'는 '='과 같은 역할을 함. 그래서 참조값이 같아야 true가 나온다~
		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}