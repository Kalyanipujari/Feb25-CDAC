<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Edit Product</title></head>
<body>
<h2>Edit Product</h2>
<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>
<form method="post" action="?action=edit">
    <input type="hidden" name="productId" value="${product.id}">
    Name: <input type="text" name="name" value="${product.name}" required><br><br>
    Category: <input type="text" name="category" value="${product.category}" required><br><br>
    Price: <input type="number" step="0.01" name="price" value="${product.price}" required><br><br>
    Quantity: <input type="number" name="quantity" value="${product.quantity}" required><br><br>
    <input type="submit" value="Update">
</form>
<a href="?">Back to List</a>
</body>
</html>