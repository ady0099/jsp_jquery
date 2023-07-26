package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetCalcCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 일처리
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
			
			request.setAttribute("k1", k1);
			request.setAttribute("k2", k2);
			request.setAttribute("op", op);
			request.setAttribute("result", result);
			
		} catch (Exception e) {
			System.out.println("긴급 오류 발생 !!!!! "+e);
		}
		
		return "view/result03.jsp";
	}

}
