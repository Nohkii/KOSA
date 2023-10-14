package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		// 자바는 utf-8을 지원하지않기때문에 설정해주는 것이 필요하다~
		PrintWriter out = response.getWriter();
		// 필요할 때 필요한 곳에서 생성하는 것이 좋다!~
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String roomType = request.getParameter("roomType");
		String[] AddReqs = request.getParameterValues("AddReq");
		String ReservationDate = request.getParameter("ReservationDate");
		// 변수 대문자..ㅋㅋ왜그랬지..? 정신,,차려,,,,
			 if (name == null||name.isEmpty()) { 
				RequestDispatcher rd = request.getRequestDispatcher("/first.html");
			rd.forward(request, response);
			return; // forward, redirect를 하고 나면 return해주는 것이 좋다
		} else if (password == null||password.isEmpty()) {
			response.sendRedirect("https://www.daum.net/");
			return;
		}
		out.print("<h1>" + name + "님의 예약내용</h1>");
		out.print("<hr/>");
		out.print("<ul/>");
		out.print("<li/>룸 : " + roomType + "</li>");
		out.print("<li/>추가 요청 사항 : ");
		if (AddReqs == null) {
			out.print("없음");
		} else {
			for (int i = 0; i < AddReqs.length; i++) {
				if (i == AddReqs.length - 1) {
					out.print(AddReqs[i]);
					break;
				}
				out.print(AddReqs[i] + ", ");
			}
			out.print("</li>");
		}
		if (ReservationDate == ""||ReservationDate ==null) {
			out.print("선택된 날짜 없음<br/>");
		} else {
			String[] date = ReservationDate.split("-");
			out.print("<li/>예약 날짜 : " + date[0] + "년 " + date[1] + "월 " + date[2] + "일</li>");
			out.print("</ul><br/>");
		}
		out.print("<a href='" + request.getHeader("referer") + "'>예약입력화면으로</a>");
		out.close();
	}
}