<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		width: 800px; margin-top:50px; border-collapse: collapse;
	}
	table, th, td{
		border:1px solid red; text-align: center;
	}
	#out{
		width:800px;
		margin:auto;
		text-align: center;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	// 연월일 시분초 넣어보기
	
	  function getCurrentDate()
   	 {
        var date = new Date();
        var year = date.getFullYear().toString();

        var month = date.getMonth() + 1;
        month = month < 10 ? '0' + month.toString() : month.toString();

        var day = date.getDate();
        day = day < 10 ? '0' + day.toString() : day.toString();

        var hour = date.getHours();
        hour = hour < 10 ? '0' + hour.toString() : hour.toString();

        var minites = date.getMinutes();
        minites = minites < 10 ? '0' + minites.toString() : minites.toString();

        var seconds = date.getSeconds();
        seconds = seconds < 10 ? '0' + seconds.toString() : seconds.toString();

     	var tt = year +"."+ month +"."+ day +"  "+ hour +":"+ minites +":"+ seconds;
        
        return tt;
   	}
	
	$("#btn1").on("click",function(){
		$("#out").empty();
		$.ajax({
			url:"/MyController6",
			dataType:"xml",
			method:"get",
			success:function(data){
				//console.log(data);
				var table = "<table>";
				table += "<thead><tr><th>지역</th><th>온도</th><th>상태</th><th>아이콘</th></tr></thead>";
				table += "<tbody>";
				
				
				var w_year = $(data).find("weather").attr("year");
				var w_month = $(data).find("weather").attr("month");
				var w_day = $(data).find("weather").attr("day");
				var w_hour = $(data).find("weather").attr("hour");
				$("#out").append(w_year+".");
				$("#out").append(w_month+".");
				$("#out").append(w_day+" ");
				$("#out").append(w_hour+"시<br>");
				
				$("#out").append(getCurrentDate());
					
				$(data).find("local").each(function(){
					table += "<tr>";
					table += "<td>" + $(this).text() +"</td>";
					table += "<td>" + $(this).attr("ta") +"</td>";
					table += "<td>" + $(this).attr("desc") +"</td>";
					table += "<td><img src='http://www.kma.go.kr/images/icon/NW/NB" + $(this).attr("icon") +".png'></td>";
					table += "</tr>";
				});					
				table += "</tbody></table>";
				$("#out").append(table);
			},
			error:function(){
				alert("읽기실패");
			},
			
		});
	});
	/* js를 활용한 천단위 콤마
	정규식  (예)
	const ori_val = 12345.6789;
	const changed_val = ori_val.toString().replace(/\B(?<!.\d*)(?=(\d{3})+(?!\d))/g, ",");
	
	내장 함수 사용(예)
	toLocaleString
	toLocaleString()
	toLocaleString(locales)
	toLocaleString(locales, options) 
	toLocaleString('ko-KR', {maximumFractionDigits: 2})
	 */
	$("#btn2").on("click",function(){
		$("#out").empty();
		$.ajax({
			url:"/MyController7",
			dataType:"json",
			method:"get",
			success:function(data){
				//console.log(data);
				
				var table = "<table>";
				table += "<thead><tr><th>시·도별</th><th>총인구</th><th>1차 접종 누계</th><th>1차 접종 퍼센트</th><th>2차 접종 누계</th><th>2차 접종 퍼센트</th></tr></thead>";
				table += "<tbody>";
				
				$.each(data, function(k,v){
					table += "<tr>";
					table += "<td>" +v["시·도별(1)"] + "</td>";
					table += "<td>" +v["총인구 (명)"].toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',')+"</td>";
					table += "<td>" +v["1차 접종 누계"].toLocaleString()+"</td>";
					table += "<td>" +v["1차 접종 퍼센트"].toLocaleString('ko-KR', {maximumFractionDigits: 2})+"%</td>";
					table += "<td>" +v["2차 접종 누계"].toLocaleString()+"</td>";
					table += "<td>" +v["2차 접종 퍼센트"].toLocaleString('ko-KR', {maximumFractionDigits: 2})+"%</td>";
					table += "</tr>"
				
				});	
				table += "</tbody></table>";
				$("#out").append(table);
				
			},
			error:function(){
				alert("읽기실패");
			}
			
		});
	});
});

</script>
</head>
<body>
	<div style="width:800px; margin:auto; text-align: center;">
		<button id="btn1">xml 정보 가져오기</button>
		<button id="btn2">json 정보 가져오기</button>
	</div>
	<br><br><br>
	<div id="out"></div>
</body>
</html>