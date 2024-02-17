package day12;

import java.util.LinkedList;

class Person1 {
	private String name;

	Person1(String name) {
		this.name = name;
	}

	public String getInfo() {
		return name;
	}
}

class Friend1 extends Person {
	private String phoneNum;
	private String email;

	Friend1(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}

	public String getInfo() {
		return super.getInfo() + " " + phoneNum + " " + email;
	}
}

public class FriendTest1 {

	public static void main(String args[]) {
		LinkedList<Friend1> arr = new LinkedList<>();
		System.out.println("이름  전화번호  메일주소");
		System.out.println("-------------------");
		arr.add(new Friend1("이름1", "11111111", "abc@gmail.com"));
		arr.add(new Friend1("이름2", "11111111", "abc@gmail.com"));
		arr.add(new Friend1("이름3", "11111111", "abc@gmail.com"));
		arr.add(new Friend1("이름4", "11111111", "abc@gmail.com"));
		arr.add(new Friend1("이름5", "11111111", "abc@gmail.com"));
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i).getInfo());
		}
	}
}
//for (int i = 0; i < arr.size(); i++) {
//	arr.add(new Friend("이름", "11111111", "abc@gmail.com"));
//	System.out.println(arr.get(i).getInfo());
//}
