<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	img{
		position: absolute;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#btn").on("click", function() {
		$("img").animate({
			left: "+=800",
			bottom: "-=800"
		},5000);
	});
	$("img").on("click", function() {
		$("img").stop();
	});

});
</script>
</head>
<body>
	<p><button id="btn">이동</button></p>
	<div>
		<img alt="" style="width: 500px" src="../images/happycat.gif">
	</div>
</body>
</html>