<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List Of Products Table</h1>
			
<table>

<tr>

<th>Pid</th>
<th>Pname</th>
<th>Pcost</th>

</tr>
<h1>Find All Products</h1>
    <span style="color:red;"><c:out value="${deleteMsg}"></c:out></span>
    <span style="color:green;"><c:out value="${successMsg}"></c:out></span>

<c:forEach items="${products}" var="product">

<tr>

<td><c:out value="${product.pId}"></c:out> </td>
<td><c:out value="${product.pName}"></c:out> </td>
<td><c:out value="${product.pPrice}"></c:out> </td>
<td><a href='./deleteById?pid=${product.pId}'>Delete</a> </td>

<td><a href='./updateById?pid=${product.pId}'> Update</a></td>

</tr>

</c:forEach>

</table>
<a href="./addProduct.jsp">Add New Product</a>

</body>
</html>