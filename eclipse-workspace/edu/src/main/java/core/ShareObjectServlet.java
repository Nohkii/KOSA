package core;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/share")
public class ShareObjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("myRequest", "요청동안 공유하는 객체"); // 요청이 끝날때까지 유지
		request.getSession().setAttribute("mySession", "세션객체가 유지되는 동안 공유하는 객체"); // 브라우저가 살아있는 동안 유지
		getServletContext().setAttribute("myApp", "서버가 기동되는 동안 공유하는 객체"); // 컨텍스트 객체에 보관
		request.getRequestDispatcher("/jspexam/shareexam.jsp").forward(request, response);
		
	}
}