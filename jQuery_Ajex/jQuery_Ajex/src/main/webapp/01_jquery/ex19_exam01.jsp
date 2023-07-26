<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	h2{text-align: center;}
	div{
		margin: auto;
		width: 500px;
		height: 2000px;
		border: 1px solid #bcbcbc;
	}
	a.top{
		position: fixed;
		left: 50%;
		bottom: 50px;
		display: none;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
	//scrollTop() : 스크롤바의 수직 위치를 가져온다.
$(document).ready(function(){
	$(window).scroll(function() {
		if($(this).scrollTop()>200){
			$(".top").fadeIn();
		}else{
			$(".top").fadeOut();
		}
	});
	$(".top").on("click",function(){
		$("html,body").animate({scrollTop:0},800);
	});

});
</script>
</head>
<body>
	<div>
	<h1>맨위로 부드럽게 이동하는 링크 만들기</h1>
	<img style="width: 500px;" id="img" src="../images/happycat.gif">
	</div>
	<a href="#" class="top">TOP</a>
</body>
</html>