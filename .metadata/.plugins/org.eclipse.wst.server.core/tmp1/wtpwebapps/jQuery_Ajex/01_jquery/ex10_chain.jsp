<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체인</title>
<style type="text/css"></style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
// 동일한 요소에 여러 jQuery 명령을 차례대로 실행할 수 있는 연결기술
// chain을 종료하는 명령어 .end()
$(document).ready(function(){
	$("#btn").on('click', function() {
		$("#img")
		.hide(600)
		.show(600)
		.css("background", "red")
		.end() // 밑에 배경색이 안먹힌다.
		.css("background","skyblue")
	});

});
</script>
</head>
<body>
	<button id="btn">눌러주세요</button>
	<p><img id="img" src="../images/apple.gif"></p>
	<p>누르면 해당 내용이 사라집니다</p>
</body>
</html>