<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Enter your product details here</h2>
<form action="Product_Controller"  method="get">
<label>Product Id</label>
<br><input type="text" name=pid><br>
<label>Product Name</label>
<br><input type="text" name=pname><br>
<label>Product Description</label>
<br><input type="text" name=pdesc><br>
<input type="submit" value="Submit">
</form>
</body>
</html>