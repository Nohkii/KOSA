package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/basket1")
public class BasketServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// HttpServlet를 상속할 때 자동으로 serialVersionUID를 상속해서 설정하게 됨
	// -> 설정안해도 기본으로 되어있어서 없애도 괜찮음
	// 조상이 추가상속하고 있는 자식 서블릿도 직렬화의 성격을 갖는다~
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get방식을 지원하는 서블릿이다~
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String src = request.getParameter("src");
		out.print("<h2>선택한 상품 : " + id + "</h2>");
		out.print("<img src='/edu/images/"+src+".jpg' width='300px'>");
		out.print("<hr/>");	
		out.print("<a href='"+request.getHeader("referer")+"'>상품 선택 화면</a>");		
		// 서블릿을 요청한 html의 헤더를 통해 알 수 있음
	}
}
