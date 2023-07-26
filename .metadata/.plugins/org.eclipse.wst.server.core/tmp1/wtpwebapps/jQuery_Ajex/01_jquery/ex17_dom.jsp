<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.s1 *{
		display: block;
		border: 2px solid gray;
		color: gray;
		padding: 5px;
		margin: 10px;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
	//siblings([selector]) : 부모태그가 같은 형제 요소 -> 하나일 경우 자신을 제외, 두개일 경우는 제외가 안됨
	//prev() : 이전 형제 요소
	//next() : 다음 형제 요소
	$(document).ready(function(){
//	$("h2").siblings().css({"color":"red"});
	//h2 요소의 형제 요소중 p태그만 추출
	$("h2").siblings("p").css({"color":"red"});
	
	$("h2").prev().css({"color":"blue"});
	$("h2").next().css({"color":"orange"});
});
</script>
</head>
<body class="s1">
	<div>
		<p>p</p>
		<span>span</span>
		<h2>h2</h2>
		<h3>h3</h3>
		<p>p</p>
		<h2>h2</h2>
	</div>
</body>
</html>