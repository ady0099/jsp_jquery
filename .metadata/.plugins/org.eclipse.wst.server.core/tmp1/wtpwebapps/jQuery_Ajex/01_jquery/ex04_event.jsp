<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>event</title>
<style type="text/css"></style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
	//마우스 이벤트 : click(.on(), .bind()), dblclick(), .hover(),
	//			  mouseover(), mouseout(), .toggle()
	//키보드 이벤트 : keypress, keyup, keydown
	//form 이벤트 : submit, change, focus
$(document).ready(function(){
	//클릭 이벤트
	$("#p1").on("click", function() {
		alert("on 클릭 성공");
	});
	$("#p2").bind("click", function() {
		alert("bind 클릭 성공");
	});
	//마우스 이벤트
	/* .hover는 이벤트로 한번 변경되면 돌아오지 않는다 
	  $("#img").hover(function() {
		//속성변경 -> arrt
	  $(this).attr("src","../images/catup.ico")
	}); 
	 */
	//   그래서 mouseover,out을 통해 바꿈
	$("#img").mouseover(function() {
		$(this).attr("src","../images/catup.ico")
	});
	$("#img").mouseout(function() {
		$(this).attr("src","../images/catdown.ico")
	});
	
	/* 토글은 안됨
	$("#p3").toggle(function() {
		$("#img").attr("src","../images/catdown.ico")
	}, function() {
		$("#img").attr("src","../images/catup.ico")
	}); */
	
	//keyup : 글자를 입력하면
	//val() = value
	$("#name").keyup(function() {
		var name = $(this).val();
		if(name.length >= 4)
		alert(name);
	});
	
	//체크박스 : change(), select(), radio
	$("#chk").change(function() {
		//var str = $("#addr").val();
		//$("#addr2").val(str);
		var str = $("#addr").val();
		if($(this).is(":checked")){ // -> if(체크가 됐을때)
			$("#addr2").val(str);
		}else{
			$("#addr2").val("");		
		}
	});
	//라디오
		$("input[name=gender]").change(function() {
			var res = $(this).val();
		$("#res").text(res);
		});
		
	$("#pwd2").keyup(function() {
		if($("#pwd").val() == $("#pwd2").val()){
			$("#s1").html("<b>암호가 맞음</b>");
		}else{
			$("#s1").html("<b>암호가 틀림</b>");
		}
	});
	
});
</script>
</head>
<body>
	<p><span id="p1">이벤트 처리</span></p>
	<p><span id="p2">이벤트 처리</span></p>
	<p><span id="p3">이벤트 처리</span></p>
	<p><img id="img" src="../images/catdown.ico"></p>
	<p><input type="text" name="name" id="name"></p>
	<hr>
	
	<p>주소 : <input type="text" name="addr" id="addr"></p>
	<p><input type="checkbox" id="chk">상동</p>
	<p>주소 : <input type="text" name="addr2" id="addr2"></p>
	<hr>
	<p>성별 : <input type="radio" name="gender" value="남자">남자
			<input type="radio" name="gender" value="여자">여자
	</p>
	<div id="res"></div>
	<p>비밀번호 : <input type="password" name="pwd" id="pwd"></p>
	<p>비밀번호 확인 : <input type="password" name="pwd2" id="pwd2"></p>
	<p><span id="s1"></span></p>
	
</body>
</html>