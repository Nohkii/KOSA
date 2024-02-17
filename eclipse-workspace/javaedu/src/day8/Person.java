package day8;
class Person {
	
	private String name;
	
	Person(String name) {
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}
class Friend extends Person{
	private String phoneNum;
	private String email;
	
	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email=email;
	}
	public String getInfo() {
		return super.getInfo()+"\t\t"+phoneNum+"\t"+email; 
//		return name+"\t"+phoneNum+"\t"+email; 
//		-> 이렇게는 사용할 수 없음 부모 클래스의 변수가 private이기 때문에!
	}
}
class FriendTest {
	public static void main(String[] args) {
		Friend[] friend = new Friend[5];
		friend[0]=new Friend("이름1", "010-1111-1111", "1@gmail.com");
		friend[1]=new Friend("이름2", "010-2222-2222", "2@gmail.com");
		friend[2]=new Friend("이름3", "010-3333-3333", "3@gmail.com");
		friend[3]=new Friend("이름4", "010-4444-4444", "4@gmail.com");
		friend[4]=new Friend("이름5", "010-5555-5555", "5@gmail.com");
			System.out.println("이름\t\t전화번호\t\t        메일주소");
			System.out.println("---------------------------------------------------");
			for(Friend f : friend) {
				System.out.println(f.getInfo());
		}
	}
}