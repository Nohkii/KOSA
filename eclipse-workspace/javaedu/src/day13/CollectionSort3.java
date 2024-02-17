package day13;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// Person2의 소스를 변경하기 어려운 경우-> 이를 대신할 수 있는 클래스를 생성해서 활용
class Person2 {
	public String name;
	public int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {		
		return name+"("+age+")";
	}	
}
// 매개변수를 2개 받아서 첫번째-두번째 비교,, 
// 비교자 역할을 하는 애다,,
class PersonComparator implements Comparator<Person2> {
	@Override
	public int compare(Person2 o1, Person2 o2) {
		if (o1.age < o2.age)
			return -1;
		else if (o1.age > o2.age)
			return 1;
		else 
			return 0;
	}	
}
public class CollectionSort3 {
	public static void main(String[] args) {
		List<Person2> list = new LinkedList<>();
		
		for(int i=1; i <= 10; i++) {
			list.add(new Person2("duke"+i, new Random().nextInt(30)));
		}
		System.out.println(list);
		list.sort(new PersonComparator());
		System.out.println("\nlist의 데이터들을 오름차순으로 소팅한 결과 : " + list);		
	}
}