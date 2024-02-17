package day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ImageIOLab {
	public static void main(String[] args) {
		String fileName = "";
		String[] dataAry = new String[2];
		URL url;
		FileOutputStream fos;
		InputStream is;
		int input = 0;
		File f = new File("c:/kosastudy/eclipse-workspace/javaedu/list.txt");
		File isDir = new File("c:/iotest/myimage");
		if (!isDir.exists()) {
			isDir.mkdirs();
		}
		try (Scanner scan = new Scanner(f);) {
			while (scan.hasNext()) {
				dataAry = scan.nextLine().split(",", 2);
				url = new URL(dataAry[1]);
				is = url.openStream();
				fileName = "c:/iotest/myimage/" + dataAry[0] + ".jpg";
				fos = new FileOutputStream(fileName);
				while (true) {
					input = is.read();
					if (input == -1)
						break;
					fos.write(input); 
				}
				fos.close();
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일을 찾을 수 없습니다");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO 오류 : " + e.getMessage());
		}
	}
}