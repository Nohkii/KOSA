package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/basket3")
public class RevBasketServlet2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String pnum =request.getParameter("pid");			
		int productnum = 1;	
		HttpSession session = request.getSession();				
		
		if (pnum == null) {
			session.invalidate();	
			out.println("<h1>선택한 상품이 없습니다.</h1>");						
			out.println("-----------------------------------");		
			//out.print("<ul>");			
			//out.print("</ul>");
			out.print("<a href='"+"/edu/clientexam/productlog2.html"+"'>상품선택화면&nbsp</a>");
			out.close();
			return;
		}
		
		if(session.getAttribute("cnt") == null) {
			session.setAttribute("cnt", new int[10]);				
		}
				 
		productnum = Integer.parseInt(pnum.substring(2));				
		int[] count = (int[])session.getAttribute("cnt");	
		System.out.println(productnum);
		count[productnum-1]++;		
		
		out.println("<h1>선택한 상품 리스트</h1>");				
		out.println("-----------------------------------");
		out.print("<ul>");
		for(int i=0; i<count.length; i++) {
			if(count[i] != 0) {
				out.println("<li> p"+(i+1)+" 상품 "+count[i]+" 개</li>");			
			}			
		}		
		out.print("</ul>");		
		out.print("<a style='text-decoration-line:none;' href='"+"/edu/clientexam/productlog2.html"+"'>상품선택화면&nbsp</a>");
		out.print("<a style='text-decoration-line:none;' href="+"/edu/basket2"+">상품비우기</a>");
		out.close();
	}
}
