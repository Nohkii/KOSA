package day12;

import java.util.Iterator;
import java.util.LinkedList;

public class GenericTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("java");
		list.add(100);
		list.add("servlet");
		list.add("jdbc");

		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();

		for (Object value : list) {
			// 타입파라미터를 지정안해두면 강제형변환을 해줘야함 
			String s = (String) value; 
			System.out.println(s);
		}
		System.out.println();

		Iterator iter = list.iterator();
		while (iter.hasNext()) {
			Object value = iter.next();
			String s = (String) value;
			System.out.println(s);
		}
	}
}
