package core;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sessiontest")
public class SessionTestServlet extends HttpServlet {	
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String command = request.getParameter("comm"); // comm이 없으면 nullPointException이 발생함
		HttpSession session = request.getSession();		
		String msg="";
		long time = session.getCreationTime();
		String id = session.getId();
	    if(command != null &&  command.equals("view")) {
	    	// command가 없으면 NullPointException이 발생하기 때문에 예외처리를 해줘야 한다~
			if(session.isNew()) {
				msg = "세션 객체 생성 : "; 
			} else {
				msg = "세션 객체 추출 : "; 
			}
			msg += "<br>id : " + id + " <br>time : " +
			                new Date(time);
		} else if (command != null && command.equals("delete")) {
			session.invalidate();
			msg = id + "을 id로 갖는 세션 객체 삭제!!";
		} else {
			msg = "요청시 Query 문자열로 comm=view 또는 comm=delete 를 "
					+ "전달해주세요!!";
		}
		out.print("<h2>"+ msg+"</h2>");
		out.close();
	}
}



