package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CopyLab2 {
//	제공된 sample.txt 파일을 읽고 c:/iotest/sample_yyyy_mm_dd.txt  폴더에 저장
//	하는 프로그램을 구현한다.  파일을 append 모드로 오픈하여
//	여러번 테스트하면 sample.txt 파일의 내용이 sample_yyyy_mm_dd.txt 파일에  계속 추가되게 한다.
//
//	오류없이 정상적으로 수행되면 화면에 “저장 완료되었습니다.”
//	오픈된 파일의 close() 처리는 try-catch with resource 구문을 이용한다.

// 에러나서 두 개로 나눠서 했었는데,, 하나로 합쳐도 됐음 왜 오류났던걸까,,?
	
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		String fileName = "sample" + today.format(DateTimeFormatter.ofPattern("YYYY_MM_dd"));
		String data = null;

		try (BufferedReader br = new BufferedReader(
				new FileReader("c:/kosastudy/eclipse-workspace/javaedu/sample.txt"));) {
			while (true) {
				data += br.readLine();
				if (data == null)
					break;
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("sample.txt 파일을 찾을 수 없습니다");
		} catch (IOException ioe) {
			System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
		}
		try (FileWriter writer = new FileWriter("c:/iotest/" + fileName + ".txt", true);
				PrintWriter out = new PrintWriter(writer);) {
			writer.write(data);
		} catch (IOException ioe) {
			System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
		}
	}

}
