<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>
		Add new Product
	</h1>
	
	<form action="./addProduct" method="get">
		<table>
			<tr>
				<td>Pid</td>
				<td><input type="text" name="pid"></td>
			</tr>
			<tr>
				<td>Pname</td>
				<td><input type="text" name="pname"></td>
			</tr>
			<tr>
				<td>Pcost</td>
				<td><input type="text" name="pcost"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Save"></td>
			</tr>

		</table>
	</form>

</body>
</html>