package filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/*" }) 
// 이 웹애플리케이션에 있는 모든 파일들을 다 거쳐갈 수 있도록(edu는 안되고 mvc안에서만)
public class HangulFilter implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	HttpServletRequest req = (HttpServletRequest)request; // 형변환해서 get메서드를 호출해줘야함
    	if (req.getMethod().equals("POST"))
    		request.setCharacterEncoding("utf-8"); // 요청 파라미터 인코딩해라~
    	// post방식일 때마다 인코딩을 하기보다 필터에 걸어두면 나중에
    	// 유지보수하기에 용이하다~
		chain.doFilter(request, response);
	}
}
