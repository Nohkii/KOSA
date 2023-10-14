package day14;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest2 {
	public static void main(String[] args) {
		String path = "C:/iotest";
		File isDir = new File(path);
		if (!isDir.exists()) {
			isDir.mkdirs();
		}
		try {
			URL req = new URL("http://img.etnews.com/news_ebuzz/afieldfile/2012/01/04/c_bk010101_87984_3.jpg");
			InputStream is = req.openStream(); // 이미지라서 InputStreamReader같은거 쓰지 않아도 괜찮다~
			String fileName = "c:/iotest/duke.jpg";
			FileOutputStream fos = new FileOutputStream(fileName); // 읽어온 이미지 파일로 내보내겠다~
			int input = 0;
			while (true) {
				input = is.read();
				if (input == -1)
					break;
				fos.write(input); // 읽은 내용 저장
			}
			fos.close();
			System.out.println("duke.jpg가 성공적으로 저장되었습니다.");
//			Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application"
//					+ "\\chrome.exe "+fileName); // 크롬 실행하는 경로 + 파일 이름으로 실행시키기
		} catch (MalformedURLException e) {
			System.out.println("URL문자열 오류 : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO 오류 : " + e.getMessage());
		}
	}
}
