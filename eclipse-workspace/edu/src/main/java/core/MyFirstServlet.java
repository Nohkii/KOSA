package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myfirst")
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		LocalDate date = LocalDate.now();
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		String dayName = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
		if (name != null) {
			out.print("<h2>"+name+"님 반가워요. 오늘은 "+dayName+"요일 입니다!!</h2>");		
		} else {
			out.print("<h2>GUEST님 반가워요. 오늘은 "+dayName+"요일 입니다!!</h2>");		
		}
		out.close();
	}
}
