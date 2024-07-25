<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff Registration</title>
</head>

<style>
body {
	background-image: url("register.jpg");
	background-size: 1400px 700px;
	width: 300px;
	height: 100px;
	padding: 25px;
	margin: auto;
}
</style>
</head>

<body>
	<form action="smsRegisterServlet" method="Post">
		Name : <input type="text" name="name"><br> Password :<input
			type="password" name="password"><br> Email : <input
			type="text" name="email"><br> Department : <input
			type="text" name="department"><br> <input type="submit"
			value="Register" />
	</form>

</body>
</html>