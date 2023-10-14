package day7;

class Student2Test {
	public static void main(String[] args) {
		Student2 st1 = new Student2("둘리",10,"영어");
		System.out.println(st1);
		Student2 st2 = new Student2("또치",11,"수학");
		System.out.println(st2);
		Student2 st3 = new Student2();
		System.out.println(st3);
		st1.study();
		System.out.println(st1.getStudentInfo());
		st2.study();
		System.out.println(st2.getStudentInfo());
		st3.study();
		System.out.println(st3.getStudentInfo());
	}
}
