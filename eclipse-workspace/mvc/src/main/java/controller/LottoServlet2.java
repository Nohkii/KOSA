//package controller;
//
//import java.io.IOException;
//import java.time.LocalTime;
//import java.util.ArrayList;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//import model.domain.TimeVO;
//
//@WebServlet("/lotto2")
//public class LottoServlet2 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		int num =34;
//		int ranNum =1;
//		/*
//		 * int num = Integer.parseInt(request.getParameter("num")); int ranNum = (int)
//		 * Math.floor((Math.random() * 6) + 1);
//		 */
//		HttpSession session = request.getSession();
//		int count = 0;
//		if(session.getAttribute("cnt") == null) {
//		}else {
//			(int)session.getAttribute("cnt")++;			
//		}
//		session.setAttribute("cnt", count);
//		System.out.println("total:"+session.getAttribute("cnt"));
//		if ( > 3 || num == ranNum) {
//			request.getRequestDispatcher("/jspexam/impossible.jsp").forward(request, response);
//		}
//		
//	}
//}
