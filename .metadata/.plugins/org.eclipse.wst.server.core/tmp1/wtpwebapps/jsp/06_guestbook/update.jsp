<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	a { text-decoration: none;}
	table{width: 600px; border-collapse:collapse; text-align: center;}
	table,th,td{border: 1px solid black; padding: 3px}
	div{width: 600px; margin:auto; text-align: center;}
</style>
<script type="text/javascript">
	function save_go(f){
		// 자바스크립트에서도 EL을 사용할 수 있다.
		var k = "${vo.pwd}";
		if(f.pwd.value == k){
			f.action="GuestController";
			f.submit();
			
		}else{
			alert('비밀번호가 틀립니다.');
			f.pwd.value="";
			f.pwd.focus();
			return;
		}
	}
</script>
</head>
<body>
	<div>
		<h2>방명록 : 수정화면</h2>
		<hr />
		<p>[<a href="/jsp/GuestController?cmd=list">목록으로 이동</a>]</p>
		<form method="post">
			<table>
				<tr align="center">
					<td bgcolor="#99ccff">작성자</td>
					<td><input type="text" name="name" size ="20" value="${vo.name } "/></td>
				</tr>
				<tr align="center">
					<td bgcolor="#99ccff">제  목</td>
					<td><input type="text" name="subject" size ="20" value="${vo.subject }"/></td>
				</tr>
				<tr align="center">
					<td bgcolor="#99ccff">email</td>
					<td><input type="text" name="email" size ="20" value="${vo.email }"/></td>
				</tr>
				<tr align="center">
					<td bgcolor="#99ccff">비밀번호</td>
					<td><input type="password" name="pwd" size ="20" value="${vo.pwd }"/></td>
				</tr>
				
				
				
				<tr align="center">
				
					<td colspan="2" style="text-align: center; padding-left: 10px;"><pre><input type="text" name="content" size ="20" value="${vo.content}"></pre></td>
				</tr>
				<tfoot>
					<tr align="center">
						<td colspan="2">
							<!-- 수정/삭제를 위해서 idx를 넘기자 -->							
							<input type="hidden" name="cmd" value="update_ok">
							<input type="hidden" name="idx" value="${vo.idx }">
							<input type="button" value="저장" onclick="save_go(this.form)" />
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type="reset" value="취소" />
						</td>
					</tr>
				</tfoot>
			</table>
		</form>
	</div>
</body>
</html>