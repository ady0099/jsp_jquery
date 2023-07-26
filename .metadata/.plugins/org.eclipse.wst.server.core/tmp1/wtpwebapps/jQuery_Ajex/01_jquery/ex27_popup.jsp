<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{background-color: lightyellow}
	#move{position: absolute}
	#move2{position: absolute}
	#close{
		padding: 30px;
		text-align: right;
	}
	#close2{
		padding: 30px;
		text-align: right;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#close").on("click", function() {
		$("#move").css("display","none");
	});
	$("#close2").on("click", function() {
		$("#move2").css("display","none");
	});
});
</script>
</head>
<body>
	<div id="move">
		<img src="../images/happycat.gif">
		<div id="close" style="background-color: skyblue">닫기</div>
	</div>
	<div id="move2">
		<img src="../images/happycat.gif">
		<div>
		<span id="close2" style="background-color: red">닫기</span>
		<span id="close3" style="background-color: red">오늘은 그만보기</span>>
		</div>
		</div>
	<div>
	<h2>Happi Cat Picture</h2>
		<div>
			<img src="../images/bananacry.gif">
			<p>오시는 길</p>
			<p>신촌역 7번출구 도보 7분거리</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
			<p>happi happi happi~</p>
		</div>
	</div>
</body>
</html>