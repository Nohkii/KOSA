package day14;

import java.io.FileInputStream;

import java.io.ObjectInputStream;
import java.util.Date;
import day7.Student2;

// SerialTest3 읽어들이는 파일
public class SerialTest4 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("c:/iotest/test2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// write - read 순서를 지켜서 해야함
		Date value1 = (Date) ois.readObject();
		Date value2 = (Date) ois.readObject();
		Student2 st = (Student2) ois.readObject();
		System.out.println("Date객체 데이터 : " + value1);
		System.out.println("Date객체 데이터 : " + value2);
		System.out.println("Student객체 데이터 : ");
		System.out.println(st.getStudentInfo());
		ois.close();
		fis.close();
	}
}