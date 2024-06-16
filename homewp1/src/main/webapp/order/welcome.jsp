<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 버튼있는 화면</title>
<script type="text/javascript">
window.onload = () => {
	document.querySelector("#btnOk").onclick = function(){
		frm.submit();
	}
}
</script>
</head>
<body>
장바구니 버튼을 누르면 장바구니 페이지로 가게 함
<table>
<tr>
		<td colspan="2">
			<form action="CartServlet" name="frm" method="post">
				<input type="hidden" name="product_name" >
				<input type="hidden" name="product_price" value="15600">
				<input type="button" id="btnOk" value="장바구니에 상품 담기">
				<input type="button" value="홈으로 이동" onclick="history.back()">
			</form>
		</td>
	</tr>
	
<a class="orderpage" href="welcome.jsp">Home</a>
<a class="orderpage" href="orderpage.jsp">장바구니</a>
</table>
</body>
</html>