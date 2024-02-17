package day14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class CopyLab3 {
	public static void main(String[] args) {
		String date = String.format("%tY_%1$tm_%1$td", new Date());
		System.out.println(String.format("%tY_%1$tm_%1$td", new Date()));
		System.out.println(String.format("%tY_%1$tm_%1$td", new GregorianCalendar()));
		System.out.println(String.format("%tY_%1$tm_%1$td", LocalDate.now()));
		String fileName = "C:/iotest/sample_"+date+".txt";	
		
		try(FileReader reader = new FileReader("sample.txt");
				BufferedReader br = new BufferedReader(reader);
				FileWriter writer = new FileWriter(fileName, true);
				PrintWriter out = new PrintWriter(writer);){
			String data;

			while(true) {
				data = br.readLine();
				if(data == null) {
					System.out.println("저장 완료되었습니다.");
					break;
				}
				out.println(data);
			}
		} catch(FileNotFoundException fnfe) {
			System.out.println("sample.txt 파일을 찾을 수 없습니다.");
		} catch(IOException e) {
			System.out.println("입출력을 처리하는 동안 오류가 발생했습니다.");
		}
	}

}
