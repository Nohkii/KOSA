package core;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/forward")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ForwardServlet 수행");
		RequestDispatcher rd = request.getRequestDispatcher("/clientexam/output.html"); 
		/*RequestDispatcher rd = request.getRequestDispatcher("/edu/clientexam/output.html"); 
		 *  -> forward의 경우 같은 웹 프로젝트만 되기 때문에 자동으로 컨텍스트가 앞에 붙음
		 * */
		/*RequestDispatcher rd = request.getRequestDispatcher("http://www.naver.com/");
		 * 이것도 자동으로 edu가 붙기 때문에 안됨
		 * */
		rd.forward(request, response);
	}
}
