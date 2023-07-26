<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>숨기기/표시하기</title>
<style type="text/css"></style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
// $(선택자).hide(), $(선택자).hide(speed)
// $(선택자).show(), $(선택자).show(speed)
// $(선택자).toggle() $(선택자).toggle(speed)
// ** speed : 숫자(200-600, 기본 400), 문자("fast","slow")
$(document).ready(function(){
	$("#hide").on("click", function() {
		$("#img").hide(1600);
		//$("#p1").hide();
	});
	$("#show").on("click", function() {
		$("#img").show(2200);
		//$("#p1").show();
	});
	$("#toggle").on("click", function() {
		$("#img").toggle("slow");
		//$("#p1").toggle();
	});

});
</script>
</head>
<body>
<p>아래 버튼을 누르면 숨겨지거나 나타나게 된다.</p>
	<button id="hide">숨기기</button>
	<button id="show">표시하기</button>
	<button id="toggle">숨기기/표시하기</button>
	<hr>
	<p><img id="img" src="../images/catdown.ico"></p>
	<p id="p1">Hello, world</p>
</body>
</html>