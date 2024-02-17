package day13;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

// Comparable 인터페이스를 상속하면 메소드도 구현해줘야함
class Person implements Comparable<Person> {//implements Comparable<Person> {
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// 자기자신 - 매개변수 비교하면 되니까 매개변수 1개
	@Override
	public int compareTo(Person o) {
		if(age<o.age) return -1;
		else if(age == o.age) return 0;
		else return 1;
	}
	@Override
	public String toString() {		
		return name+"("+age+")";
	}	
}
public class CollectionSort2 {
	public static void main(String[] args) {
		List<Person> list = new LinkedList<>();
		Random rand = new Random();
		for(int i=1; i <= 10; i++) {
			list.add(new Person("duke"+i, rand.nextInt(30)));
		}
//		반복문 안에서 객체생성 하지 마라~		
//		for(int i=1; i <= 10; i++) {
//			list.add(new Person("duke"+i, new Random().nextInt(30)));
//		}
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("\nlist의 데이터들을 오름차순으로 소팅한 결과 : " + list);	
		Collections.reverse(list);
		System.out.println("\nlist의 데이터들을 내림차순으로 소팅한 결과 : " + list);		
	}
}
