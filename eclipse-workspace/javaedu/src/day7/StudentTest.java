package day7;

class Student {
	String name;
	int age;
	String subject;

	void study() {
		System.out.println(name + "학생은 " + subject + "과목을 학습합니다.");
	}

	String getStudentInfo() {
		return name + "-" + age;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student();
		System.out.println(st2);
		st1.name = "둘리";
		st1.age = 10;
		st1.subject = "영어";
		st2.name = "또치";
		st2.age = 11;
		st2.subject = "수학";
		st1.study();
		System.out.println(st1.getStudentInfo());
		st2.study();
		System.out.println(st2.getStudentInfo());
		System.out.println("===========================");
		st2 = st1;
		System.out.println(st1);
		System.out.println(st2);
	}
}
