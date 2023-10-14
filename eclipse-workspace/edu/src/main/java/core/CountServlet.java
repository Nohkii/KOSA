package core;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/CountServlet")
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		if(session.getAttribute("cnt") == null) { // 꺼내려고 했는데 없음
			session.setAttribute("cnt", new int[1]);
			// 세션 속성은 객체로 저장이 되어야 하기 때문에 배열로 저장(크기가 1인 배열을 생성)
		}
		int[] count = (int[])session.getAttribute("cnt"); // 세션에서 "cnt" 속성을 얻어와서 count 배열에 할당
		count[0]++;
		out.print("<h3>당신은 "+ count[0] + 
				                       "번째 방문입니다.</h3>");		
		System.out.println(session.getAttribute("cnt"));
		out.close();
	}
}