package core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/FirstServlet", "/first" }) // 매핑명이 2개이상일 경우 { }안에 정의 (1개면 ()) 
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("FirstServlet 실행...");
		/* MIME 타입 설정*/
		response.setContentType("text/plain; charset=utf-8"); // setContentType를 하고 프린트를 해야한다..
		PrintWriter out = response.getWriter();
		out.print("<h1>안녕 서블릿아~~~</h1>");
		System.out.println("FirstServlet 마침");
		out.close();
	}
}