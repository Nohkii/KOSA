package day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CopyLab {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		String fileName = "sample_" + today.format(DateTimeFormatter.ofPattern("YYYY_MM_dd"));
		String data = "";
		File f = new File("c:/kosastudy/eclipse-workspace/javaedu/sample.txt");
		try (Scanner scan = new Scanner(f);
				FileWriter writer = new FileWriter("c:/iotest/" + fileName + ".txt", true);
				PrintWriter out = new PrintWriter(writer);) {
			while (scan.hasNext())
				data += scan.nextLine();
			out.write(data);
			out.write("\n");
			System.out.println("저장 완료되었습니다.");
		} catch (FileNotFoundException fnfe) {
			System.out.println("sample.txt 파일을 찾을 수 없습니다");
		} catch (IOException ioe) {
			System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
		}
	}
}
