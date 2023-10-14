package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visitor")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String content = request.getParameter("content");
		LocalDate date = LocalDate.now();
		out.print("<h1>" + name + " 님이 "+date.getYear()+"년 " +date.getMonthValue()+"월 "+date.getDayOfMonth()+"일에 남긴 글입니다.</h1>");
		out.print("<hr/>");
		out.print("<h2>" + content + "</h2>");
		out.print("<a href='"+request.getHeader("referer")+"'>입력화면으로</a>");
		out.close();
	}
}