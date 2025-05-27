<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Product</title>
</head>

	<body>
<h2>Add New Product</h2>
<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>
<form method="post" action="?action=add">
    ID: <input type="number" name="productId" required><br><br>
    Name: <input type="text" name="name" required><br><br>
    Category: <input type="text" name="category" required><br><br>
    Price: <input type="number" step="0.01" name="price" required><br><br>
    Quantity: <input type="number" name="quantity" required><br><br>
    <input type="submit" value="Add">
</form>
<a href="?">Back to List</a>
</body>
</html>