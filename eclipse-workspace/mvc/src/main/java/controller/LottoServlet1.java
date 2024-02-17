package controller;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.domain.TimeVO;
@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  int num = Integer.parseInt(request.getParameter("num")); 
		  int ranNum = (int)Math.floor((Math.random()*6)+1);
		System.out.println("전달된 값: "+num+", 추출된 값 : "+ranNum);
		TimeVO vo = new TimeVO(LocalTime.now().getHour(), LocalTime.now().getMinute());
		request.setAttribute("time", vo);
		if(num == ranNum) {
			request.getRequestDispatcher("/jspexam/success.jsp").forward(request, response);		
		}else {
			request.getRequestDispatcher("/jspexam/fail.jsp").forward(request, response);	
		}
	}
}
