package day12;
import java.util.Date;
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 v1 = new Value1();
		v1.put("가나다");
		String s1 = v1.get();
		System.out.println(s1);
		
		Value2 v2 = new Value2();
		v2.put("가나다");
		String s2 = (String)v2.get();
		System.out.println(s2);		
		v2.put("ABC");
		Date d1 = (Date)v2.get();
		System.out.println(d1);		
		
		Value3<String> v3 = new Value3<>();
		v3.put("가나다");
		String s3 = v3.get();
		System.out.println(s3);	
		
		Value3<Date> v4 = new Value3<>();
		v4.put(new Date());
		Date d2 = v4.get();
		System.out.println(d2);		
	}
}

class Value1 { // string형에 특화
	String obj;
	void put(String obj) {
		this.obj = obj;		
	}
	String get() {
		return obj;
	}
}
class Value2 { // 배열이던 객체던~ Object객체는 다 전달할 수 있다
	Object obj;
	void put(Object obj) {
		this.obj = obj;		
	}
	Object get() {
		return obj; // 만약 Date형으로 리턴하려면 Date형으로 형변환해야한다,, (자손 -> 부모는 자동 형변환이 안되기 때문에)
	}
}
class Value3<T> { // 제네릭스 활용
	T obj;
	void put(T obj) {
		this.obj = obj;		
	}
	T get() {
		return obj;
	}
}
// Value3<Date> v = new Value3<Date>(); 
// 이렇게 객체를 생성하면 T가 알아서 Date형으로 바뀐다 -> 형변환할 필요 없음
