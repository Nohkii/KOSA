package day14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;

public class FileOutLab2 {
	public static void main(String[] args) {
		LocalDate date;
		DayOfWeek day;
		String path = "c:/Temp";
		File isDir = new File(path);
		int yearNum; int MonthNum; int dateNum;
		String korday;
		if(!isDir.exists()) {
			isDir.mkdirs();
		}
		try  (FileWriter writer = new FileWriter("c:/Temp/event.txt", true);
				PrintWriter out = new PrintWriter(writer);){
			date = Year.of(2023).atMonth(10).atDay(3);
			yearNum=date.getYear();
			MonthNum = date.getMonthValue();
			dateNum = date.getDayOfMonth();
			day = date.getDayOfWeek();
			korday=day.getDisplayName(TextStyle.FULL, Locale.KOREAN);
			out.printf("%d년 %d월 %d일은 %s입니다.\n",yearNum,MonthNum,dateNum,korday);
			date = Year.of(2023).atMonth(12).atDay(25);
			yearNum=date.getYear();
			MonthNum = date.getMonthValue();
			dateNum = date.getDayOfMonth();
			day = date.getDayOfWeek();
			korday=day.getDisplayName(TextStyle.FULL, Locale.KOREAN);
			out.printf("%d년 %d월 %d일은 %s입니다.\n",yearNum,MonthNum,dateNum,korday);
			System.out.println("저장이 완료되었습니다.");
			if (writer != null)
				writer.close();
		}
		catch (IOException ioe){
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}
	public int re(LocalDate d) {
		return 0;
	}
}