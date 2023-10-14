package day11;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateTimeTest {

	public static void main(String[] args) throws Exception {
		Date d = new Date();
		System.out.println(d.toString()); // 정해진 형식으로 출력
		System.out.println(d.getTime()); // 유닉스 시간(숫자로만 시간을 의미)

		GregorianCalendar gc = new GregorianCalendar(); // 연, 월, 일을 표현하고 싶을 때 사용
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		gc = new GregorianCalendar(2023, 9, 1);// 0이 1월 11은 12월
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));

		System.out.println(timeToStrDate(new Date().getTime()));
		System.out.println(parseStrDate("2024년 01월 01일"));
		// 전에는 이렇게 했다~
		System.out.println("================ NEW");
		LocalDate currentDate = LocalDate.now();
		System.out.println("currentDate.getYear():"+currentDate.getYear());
		LocalDate targetDate = LocalDate.of(2023, 9, 1);
		System.out.println(currentDate.getDayOfWeek());
		System.out.println(currentDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN));
		System.out.println(currentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));		
		System.out.println(targetDate.getDayOfWeek());
		System.out.println(targetDate.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.KOREAN));
		System.out.println(targetDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.KOREAN));
		
		LocalTime currentTime = LocalTime.now();
		LocalTime targetTime = LocalTime.of(9, 10, 20);
		
		System.out.println("currentTime:"+currentTime);
		System.out.println(targetTime);

		LocalDateTime currentDateTime = LocalDateTime.now();
		LocalDateTime targetDateTime = LocalDateTime.of(2023, 12, 25, 12, 30);
		System.out.println(currentDateTime);
		System.out.println(targetDateTime);
	}

	public static String timeToStrDate(long time) {
		DateFormat formatter = new SimpleDateFormat("MM-dd-yyyy");
		return formatter.format(time);
	}

	public static Date parseStrDate(String strDate) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일");
		return formatter.parse(strDate);
	}
}
