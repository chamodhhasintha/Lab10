<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<script type="text/javascript" src=Controllers/jQuery.js></script>
<script type="text/javascript" src=Controllers/Contoller.js></script>
</head>
<body>
	<form id="formLogin" action="user.jsp" method="post">
	UserName<input id="txtUserName" name="txtUserName" type="text"><br>
	Password<input id="txtPassword" name="txtPassword" type="password"><br>
	<input id="btnLogin" name="btnLoagin" type="button" value="Login"><br>
	</form>

</body>
</html>
