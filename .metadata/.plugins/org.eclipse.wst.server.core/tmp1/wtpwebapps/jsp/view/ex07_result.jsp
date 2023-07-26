<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 파라미터값 받기
	// 한글 처리
	request.setCharacterEncoding("utf-8");
	// 파라미터는 request에 저장되어 있다.
	String name = request.getParameter("name");
	// 파라미터는 일반적으로 String, String[]이다.
	String age =request.getParameter("age");
	String gender = request.getParameter("gender");
	
	// 같은 이름이 여러 개 넘어오면 배열 처리(checkbox,select 속성이 multipe)
	String[] hobby = request.getParameterValues("hobby");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>결과 표시</h2>
	<h3>
		<ul>
			<li>이름 : <%=name %></li>
			<li>나이 : <%=age %></li>
			<li>성별 : <%=gender %></li>
			<li>취미 : </li>
				<%
					for(String k : hobby){
						out.println(k);
					}
				%>
		</ul>
	
	</h3>
</body>
</html>