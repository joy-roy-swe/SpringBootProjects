<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Registration Page</h2>
${SPRING_SECURITY_LAST_EXCEPTION.message}
<form action="registration" method="post">

	<input type="text" name="id"><br>
	<input type="text" name="name"><br>
	<input type="text" name="lang"><br>
	<input type="password" name="password"><br>
	<input name="submit" type="submit" value="submit" />

</form>

</body>
</html>