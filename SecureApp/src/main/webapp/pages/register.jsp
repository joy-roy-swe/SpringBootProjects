<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Registration</h1>
  	${SPRING_SECURITY_LAST_EXCEPTION.message}
   <form action="registration" method='POST'>
   
      <table>
         <tr>
            <td>User ID:</td>
            <td><input type='text' name='id'></td>
         </tr>
         <tr>
            <td>User Name:</td>
            <td><input type='text' name='name'></td>
         </tr>
         <tr>
            <td>Password:</td>
            <td><input type='password' name='password' /></td>
         </tr>
         <tr>
            <td>Language:</td>
            <td><input type='text' name='lang'></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
         </tr>
      </table>
  </form>


</body>
</html>