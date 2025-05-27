<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>
	<h2>Inventory Products</h2>
	<a href="?action=add">Add New Product</a>
	<br><br>
	<table border="1" cellpadding="8" cellspacing="0">
		<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Category</th>
		<th>Price</th>
		<th>Quantity</th>
		<th>Actions</th>
		</tr>
		<c:forEach var="p" items="${productList}">
			<tr>
				<td>${p.productId}</td>
				<td>${p.name}</td>
				<td>${p.category}</td>
				<td>${p.price}</td>
				<td>${p.quantity}</td>
				<td>
					<a href="?action=edit&id=${p.productId}">Edit</a>
					<a href="?action=delete&id=${p.productId}" onClick="return confirm('Are you sure?'); ">Delete</a>
				</td>
			</tr>
			</c:forEach>
	</table>
</body>
</html>