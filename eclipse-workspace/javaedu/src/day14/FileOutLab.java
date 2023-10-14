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
public class FileOutLab {
	public static void main(String[] args) {
		String path = "c:/Temp";
		File isDir = new File(path);
		if(!isDir.exists()) {
			isDir.mkdirs();
		}
		try  (FileWriter writer = new FileWriter("c:/Temp/event.txt", true);
				PrintWriter out = new PrintWriter(writer);){
			out.format(FileOutLab.dayCal(Year.of(2023).atMonth(10).atDay(3)));
			out.format(FileOutLab.dayCal(Year.of(2023).atMonth(12).atDay(25)));
			System.out.println("저장이 완료되었습니다.");
		}
		catch (IOException ioe){
			System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
		}
	}
	public static String dayCal(LocalDate d) {
		int yearNum;
		int MonthNum;
		int dateNum;
		DayOfWeek day;
		String korday;
		yearNum=d.getYear();
		MonthNum = d.getMonthValue();
		dateNum = d.getDayOfMonth();
		day = d.getDayOfWeek();
		korday=day.getDisplayName(TextStyle.FULL, Locale.KOREAN);
		return String.format("%d년 %d월 %d일은 %s입니다.\n",yearNum,MonthNum,dateNum,korday);
	}
}