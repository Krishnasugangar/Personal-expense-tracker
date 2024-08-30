<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="register-container">
<h2>register</h2>
<form action="register" method="post">

<label for="username">username</label>
<input type="text" id="username" name="username"> 
<label for="email">email</label>
<input type="email" id="email" name="email"> 
<label for="password">password</label>
<input type="password" id="password" name="password"> 
<label for="confirmpassword">confirm password</label>
<input type="password" id="confirmpassword" name="confirmpassword"> 
<button type="submit">Register</button>
</form>
<p>Already have an account? <a href="login.jsp">Login here</a>.</p>
</div>
</body>
</html>