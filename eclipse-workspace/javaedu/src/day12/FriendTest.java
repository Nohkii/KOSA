package day12;
import java.util.LinkedList;
class Person {
	private String name;
	Person(String name) {
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}
class Friend extends Person {
	private String phoneNum;
	private String email;
	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	public String getInfo() {
		return super.getInfo() + " " + phoneNum + " " + email;
	}
}
public class FriendTest {
	public static void main(String args[]) {
		LinkedList<Friend> arr = new LinkedList<>();
		System.out.println("이름  전화번호  메일주소");
		System.out.println("-------------------");
		for (int i = 0; i < 5; i++) {
			arr.add(new Friend("이름" + (i + 1), "11111111", "abc@gmail.com"));
			System.out.println(arr.get(i).getInfo());
		}
	}
}