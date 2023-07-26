<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		width: 600px; margin-top:50px; border-collapse: collapse;
	}
	table, th, td{
		border:1px solid red; text-align: center;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("#btn1").on("click", function(){
		$("#out").empty();
		$.ajax({
			//url : "http://www.kma.go.kr/XML/weather/sfc_web_map.xml",
			url : "data06.xml",
			method : "get",
			dataType : "xml",
			xhrFields: {
				withCredentials: true
			}
			
			success : function(data){
				var table = "<table>";
				table += "<thead><tr><th>지역</th><th>온도</th><th>상태</th><th>아이콘</th></tr></thead>";
				table += "<tbody>";
				
				$(data).find("local").each(function(){
					var local = $(this).text();
					var stn_id =$(this).attr("stn_id");
					var icon =$(this).attr("icon");
					var desc =$(this).attr("desc");
					var ta =$(this).attr("ta");
					
					table +="<tr>";
					table +="<td>"+company+"</td><td>"+name+"</td><td>"+count+"</td>";
					table +="</tr>";
				
				
				var rows = data.split("/");
				for (var k in rows){
					//console.log(row[k]);
					table += "<tr>";
					var cols = rows[k].split(",");
					for (var k2 in cols){
						table += "<td>"+cols[k2]+"</td>";
					}
					table += "</tr>";
				
				}
				
				
				table += "</tbody></table>";
				$("#out").append(table);
			},
			error : function(){
				alert("가져오기 실패");
			}
		});
	});
});

</script>
</head>

<body>
	<div id="btn1">xml 파일 가져오기</div>
	<div id="btn2">json 파일 가져오기</div>
	<div id="out"></div>
</body>
</html>