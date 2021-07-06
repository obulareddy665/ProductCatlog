<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>
		Update Product : Product Id :
		<c:out value="${product.pId}"></c:out>
	</h1>
	<span style="color: red;"><c:out value="${deleteMsg}"></c:out></span>
	<form action="./adding" method="get">
		<table>
			<tr>
				<td>Pid</td>
				<td><input type="text" name="pid" value="${product.pId}" readonly="readonly"></td>
			</tr>
			<tr>
				<td>Pname</td>
				<td><input type="text" name="pname" value="${product.pName}"></td>
			</tr>
			<tr>
				<td>Pcost</td>
				<td><input type="text" name="pprice" value="${product.pPrice}"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Update"></td>
			</tr>

		</table>
	</form>
</body>
</html>