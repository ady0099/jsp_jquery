<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jQuey 콜백함수</title>
<style type="text/css"></style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
// 콜백함수는 현재 효과가 100% 완료된 후에 실행
$(document).ready(function(){
	//콜백함수
	$("#btn").on("click", function() {
		//콜백함수인 경우 : 사라진 후 알림창
	 	$("#img").hide("slow", function() {
			alert("실행완료")
		});
 		
 		//콜백함수가 아닌 경우: 바로 알람창
 		/* $("#img").hide("slow");
 		alert("hi");
		}); */
	
});
</script>
</head>
<body>
	<button id="btn">눌러주세요</button>
	<p><img id="img" src="../images/happycat.gif"></p>
	<p>누르면 해당 내용이 사라집니다</p>
</body>
</html>