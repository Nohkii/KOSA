package day14;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class CountLab {
	public static void main(String[] args) {
		File f = new File("c:/kosastudy/eclipse-workspace/javaedu/yesterday.txt");
		int count = 0;
		try (Scanner scan = new Scanner(f);) {
			while (scan.hasNext()) {
				if(scan.next().replace(".","").equals("yesterday")) {
					count++;
				}
			}
			System.out.println("yesterday 라는 단어는 "+count+"개 있습니다");
		}
		 catch (IOException ioe) {
				System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
			}
	}
}