package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.db.DAO;

public class MyModel09 {

	public String exec(HttpServletRequest request, HttpServletResponse response) {
		// ajax에서 넘어온 파라미터값을 받자
		String m_idx = request.getParameter("m_idx");
		System.out.println("m_idx : "+m_idx);
		
		int result = DAO.membersDel(m_idx);
		
		//return null;
		return String.valueOf(result);
	}

}
