<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>상품 등록</title>
    <style>
    	h1{
    		text-align: center;
    	}
        table {
            border-collapse: collapse;
            width: 50%;
            margin: 0 auto;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
        }
        tfoot {
			text-align: center;
		}
		#input_file_S, #input_file_L{
			visibility: hidden;
		}
		.label_S, .label_L{
			  color: black;
			  cursor: pointer;
		}
		.file_text{
			width:50%;
		}
		span{
			display:inline-block;
			background-color:lightgray;
			margin-left:5px;
			padding:8px;
			color:white;
			border:1px solid black;
		}
		span:hover{
			background-color: white;
			color:black;
			font-weight: bold;
		}
    </style>
</head>
<body>
    <form action="상품_등록_처리.jsp" method="post" enctype="multipart/form-data">
        <table>
        <thead>
        	<h1>상품 등록</h1>
        </thead>
        <tbody>
            <tr>
                <th>분류</th>
                <td>
                    <input type="radio" name="category" value="컴퓨터"> 컴퓨터
                    <input type="radio" name="category" value="가전제품"> 가전제품
                    <input type="radio" name="category" value="스포츠"> 스포츠
                </td>
            </tr>
            <tr>
                <th>제품번호</th>
                <td><input type="text" name="p_num"></td>
            </tr>
            <tr>
                <th>제품명</th>
                <td><input type="text" name="p_name"></td>
            </tr>
            <tr>
                <th>판매사</th>
                <td><input type="text" name="p_company"></td>
            </tr>
            <tr>
                <th>상품가격</th>
                <td><input type="text" name="p_price"></td>
            </tr>
            <tr>
                <th>할인가</th>
                <td><input type="text" name="p_saleprice"></td>
            </tr>
            <tr>
                <th>상품이미지 S</th>
                <td><input type="text" class="file_text" id="file_text_S">
                <label class="label_S" for="input_file_S"><span>찾아볼까?</span></label>
                <input id="input_file_S" type="file" name="imageS" onchange="fifS()"></td>
            </tr>
            <tr>
                <th>상품이미지 L</th>
                <td><input type="text" class="file_text" id="file_text_L">
                <label class="label_L" for="input_file_L"><span>찾아볼까?</span></label>
                <input id="input_file_L" type="file" name="imageL" onchange="fifL()"></td>
            </tr>
            <tr>
                <th>상품내용</th>
                <td><textarea name="p_content" rows="10" style="width: 100%;"></textarea></td>
            </tr>
            </tbody>
	        <tfoot>
	        	<tr>
					<td colspan="2">
			        	<input type="submit" value="상품 등록" />
			        </td>
	        	</tr>
	        </tfoot>
        </table>
        
        <br>
        
       
    </form>
    	<script type="text/javascript">
		let ifS = document.getElementById("input_file_S");
		let ifL = document.getElementById("input_file_L");
		
		function fifS(){
				document.getElementById("file_text_S").value = ifS.value;
		}
		function fifL(){
				document.getElementById("file_text_L").value = ifL.value;
		}
		function product_add(f){
			// 유효성 검사
			f.action="/MyController?cmd=productAdd";
			f.submit;
		}
	</script> 
</body>
</html>