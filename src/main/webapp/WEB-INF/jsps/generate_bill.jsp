<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Bill</title>
</head>
<body>
<h2>Create Bill</h2>
<form action="saveBill" method="post">
<pre>

FirstName<input type="text" name="firstName" value="${contactById.firstName }"/>
LastName<input type="text" name="lastName" value="${contactById.lastName }"/>
Email<input type="email" name="email" value="${contactById.email }"/>
Mobile<input type="number" name="mobile" value="${contactById.mobile }">
Product<input type="text" name="product"/>
Price<input type="number" name="amount"/>
Quantity<input type="number" name="quantity"/>
<input type="submit" value="generate"/>

</pre> 
</form>
</body>
</html>