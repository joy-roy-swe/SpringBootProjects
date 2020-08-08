<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>User Profile</h2>
	${SPRING_SECURITY_LAST_EXCEPTION.message}
	<table>
		<tr>
			<td>User ID:</td>
			<td>${obj.id }</td>
		</tr>
		<tr>
			<td>Name:</td>
			<td>${obj.name }</td>
		</tr>
		<tr>
			<td>Language:</td>
			<td>${obj.lang }</td>
		</tr>

	</table>

</body>
</html>