package day12;

import java.util.HashSet;

class Member2 {
	private int id;
	private String name;
	private String password;
	Member2(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o instanceof Member2) {
			Member2 m = (Member2) o; // 멤버를 여러개 접근할거다~하면 형변환해서 변수에 담아서 써라~
			if (id == m.id && name.equals(m.name) && password.equals(m.password))
				return true;
		}
		return false;
	}
}
public class ObjectTest2 {
	public static void main(String args[]) {
		Member2 obj1 = new Member2(10, "자바", "duke");
		Member2 obj2 = new Member2(10, "자바", "duke");
		Member2 obj3 = new Member2(20, "자바", "duke");
		System.out.println(obj1.equals(obj2)); // true
		System.out.println(obj1 == obj2); // false
		System.out.println(obj1.equals(null)); //false
		System.out.println(obj1.equals(new java.util.Date())); //false
		System.out.println(obj1.equals(obj3)); //false
		HashSet<Member2> set = new HashSet<>();
		System.out.println(set.add(obj1));
		System.out.println(set.add(obj2));
		System.out.println(set.add(obj3));
	}
}