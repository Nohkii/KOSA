package day7;

import java.io.Serializable;

public class Student2 implements Serializable{
		String name;
		int age;
		String subject;

		public Student2() { // argument를 전달하지 않는 경우
//			name = "도우너";
//			age = 10;
//			subject="과학";
			this("도우너",10,"과학"); // 이렇게도 사용할 수 있다~
			System.out.println("디폴트생성자로 객체생성 완료!");
		};

		public Student2(String name, int age, String subject) {
			this.name = name;
			this.age = age;
			this.subject = subject;
		}

		void study() {
			System.out.println(name + "학생은 " + subject + "과목을 학습합니다.");
		}

		public String getStudentInfo() {
			return name + "-" + age;
		}
}
