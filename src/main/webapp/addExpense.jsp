<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="expense-container">
<h2>add new expense</h2>
<form action="addexpense" method="post">
<label for="category">category</label>
<input type="text" id="category" name="category">
<label for="amount">amount</label>
<input type="number" id="amount" name="amount" step="0.01">
<label for="description">description</label>
<input type="text" id="description" name="description">
<label for="date">date</label> 
<input type="date" id="date" name="date">
<button type="submit">add expenses</button>

</form>
</div>
</body>
</html>