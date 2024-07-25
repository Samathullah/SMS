<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Staff Editor</title>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title> Staff Management Editor</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>


<body>

	<nav class="navbar navbar-expand-md navbar-light">
		<div>
			<a class="navbar-brand"> Staff Management Editor </a>
		</div>
		<ul class="navbar-nav">
			<li><a
				href="<%=request.getContextPath()%>/smsUserServlet/dashboard"
				class="nav-link">Back to Dashboard</a></li>
		</ul>
	</nav>
	<div class="container col-md-6">
		<div class="card">
			<div class="card-body">
				<c:if test="${!empty user.name}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${empty user.name}">
					<form action="insert" method="post">
				</c:if>
				<caption>
					<h2>
						<c:if test="${!empty user.name}">
Edit User
</c:if>
						<c:if test="${empty user.name}">
Add New User
</c:if>
					</h2>
				</caption>
				<c:if test="${user != null}">
					<input type="hidden" name="oriName"
						value="<c:out
value='${user.name}' />" />
				</c:if>
				<fieldset class="form-group">
					<label>Name</label> <input type="text"
						value="<c:out
value='${user.name}' />" class="form-control"
						name="userName" required="required">
				</fieldset>
				<fieldset class="form-group">
					<label>Password</label> <input type="text"
						value="<c:out
value='${user.password}' />" class="form-control"
						name="password">
				</fieldset>
				<fieldset class="form-group">
					<label>Email</label> <input type="text"
						value="<c:out
value='${user.email}' />" class="form-control"
						name="email">
				</fieldset>
				<fieldset class="form-group">
					<label> Department</label> <input type="text"
						value="<c:out
value='${user.department}' />" class="form-control"
						name="department">
				</fieldset>
				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>