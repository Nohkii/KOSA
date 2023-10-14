package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String args[]) {
		FileReader reader = null;
		try {
			reader = new FileReader("c:/iotest/output.txt");
			while (true) {
				int data = reader.read();
				if (data == -1)
					break;
				char ch = (char) data; // 변환을 안해주면 코드값이 출력됨
				System.out.print(ch);
			}
		} 
		// 두 개의 순서가 바뀌면 에러남,, IOException가 조상이기 때문에
		catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		}
		catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
		finally {
			try {
				if (reader != null)
					reader.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
