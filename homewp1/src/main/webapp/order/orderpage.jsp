<%@page import="pack.order.ProductDto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="productMgr" class="pack.order.ProductMgr" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니 추가</title>
</head>
<body>
장바구니목록
체크박스, 이미지, 옷이름, 수량, 가격
<table border="1">
<tr style="background-color: pink">
	<th>제품번호</th>
	<th>이미지</th>
	<th>제품이름</th>
	<th>수량</th>
	<th>가격</th>
</tr>
<%
HttpSession session2 = request.getSession();
ArrayList<ProductDto> plist = productMgr.getProductAll();
for(ProductDto p:plist){
	System.out.println(p.getProduct_name());
%>
<tr>
      <td><input type="checkbox" name="product_no" value="<%=p.getProduct_num()%>"></td>
      <td><img src="<%=p.getProduct_name()%>"  width="100"></td>
      <td><%=p.getProduct_name()%></td>
      <td><input type="number" name="quantity_<%=p.getProduct_num()%>" value="<%=p.getProduct_price()%>"></td>
      <td><%=p.getProduct_price()%></td>
</tr>
<!--  
<tr>
	<td>
	<input type="checkbox" id="product_no" name="product_no" checked="checked">
	<!-- 이미지 있어야 할듯 
	<img src="../upload/>
	-->
	<%=p.getProduct_name()%>
	</td>
	<td><%=p.getProduct_count() %></td><!-- 옷의 수량을 어떻게 표현? -->
	<td><%=p.getProduct_price() %></td>
</tr>
-->
<%
}

%>

</table>

</body>
</html>