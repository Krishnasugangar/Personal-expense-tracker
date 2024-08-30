<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.expenseTracker.model.User" %>   
<% 
	User user = (User) session.getAttribute("user");
	if(user == null){
	response.sendRedirect("login.jsp");
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="dashboard-container">
<h1>welcome, <%=user.getUsername() %></h1>
<div class="action">
<a href="addExpenses.jsp" class="btn">ADD Expense</a>
<a href="viewexpense.jsp" class="btn">view expense</a>
<a href="logout" class=" btn">Logout</a>
</div>
<div class="summary">
<h2>expense summary</h2>
<!-- summary data can be dynamicaly loaded here -->
</div></div>
</body>
</html>