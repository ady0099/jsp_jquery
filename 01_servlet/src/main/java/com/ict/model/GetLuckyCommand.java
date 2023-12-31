package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetLuckyCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// 일처리
		int lucky = (int)(Math.random()*100)+1;
		
		request.setAttribute("lucky", lucky);
		
		return "view/result02.jsp";
	}

}
