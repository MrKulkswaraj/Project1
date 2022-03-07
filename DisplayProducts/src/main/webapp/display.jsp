<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Products</title>
<style>
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
  margin-left: auto;
margin-right: auto;
text-align:center;
}
</style>
</head>
<body>
<body>
<center>
<h2>Product details</h2>
</center>
<table>
  <tr>
    <th>Product Id</th>
    <th>product description</th>
    <th>product name</th>
    
  </tr>
  <tr>
    <td><%= request.getAttribute("pid")%></td>
    <td><%=request.getAttribute("pname")%></td>
    <td><%=request.getAttribute("pdesc")%></td>
  </tr>
  
</table>

</body>
</html>