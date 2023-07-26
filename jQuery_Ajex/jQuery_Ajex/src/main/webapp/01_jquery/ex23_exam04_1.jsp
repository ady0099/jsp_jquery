<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>한줄 뉴스(JS)</title>
<style type="text/css"></style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){	
	var news=["4대 그룹, 수해 피해 복구 성금으로 총 100억원 기부한다",
		"아파트 싹쓸이 '왕서방' 사라지나…외국인 투기, 법으로 막는다",
		"삼성·SK·현대차·LG…韓기업 이름딴 도로, 美 가로지른다",
		"해피캣, 춤만 췄는데…'인기만점' 스타"
		];
	var index = 0;
	setInterval(() => {
		$("#mydiv").text(news[index++]);
		if(index==news.length) index = 0;
	}, 2000);
});
</script>
</head>
<body>
	<div id="mydiv"></div>
	<button onclick="start_news">뉴스보기</button>
</body>
</html>