package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex12_3")
public class Ex12_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		// 계산 결과 보기
		// 파라미터값이 존재함
		
		try {
			String s1 = request.getParameter("s1");
			String s2 = request.getParameter("s2");
			String op = request.getParameter("op");
			
			int k1 = Integer.parseInt(s1);
			int k2 = Integer.parseInt(s2);
			 
			int y1 = Integer.parseInt(request.getParameter("s1"));
			int y2 = Integer.parseInt(request.getParameter("s2"));
			
			int result = 0;
			switch (op) {
			case "+": result = k1 + k2; break;
			case "-": result = k1 - k2; break;
			case "*": result = k1 * k2; break;
			case "/": result = k1 / k2; break;
			
			}
			
			out.println("<h2>결과 : " + k1 + op + k2 + "=" + result + "</h2>");
			
		} catch (Exception e) {
			out.println("<h2>결과 : 0 으로는 나눌 수가 없습니다.</h2>");
		}
		
		
	}
}
