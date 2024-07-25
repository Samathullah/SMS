<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Staff Management</title>

</head>

<style>
body {
	background-image: url("loginbackground.jpg");
	background-size: 1400px 700px;
	color: white;
	font-style: italic;
	width: 300px;
	height: 100px;
	margin: auto;
}
</style>

<body>

	<h1>Staff Management System Login</h1>

	<form action="smsLoginServlet" method="post">
		Username: <input type="text" name="username" size="20">
		Password: <input type="password" name="password" size="20">
		<!-- Implement submit button with type = submit to perform the request when clicked -->
		<input type="submit" value="Submit" />
	</form>

	

</body>
</html>