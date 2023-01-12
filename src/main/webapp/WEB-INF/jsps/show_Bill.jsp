<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL</title>
</head>
<body>
<h2>BILL</h2>
<form action="showBill" method="post">
<input type="hidden" name="id" value="${billing.id }"/>
CustomerName<input type="text" name="firstName" value="${billing.firstName }"/>
Product<input type="text" name="product" value="${billing.product }"/>
Quantity<input type="number" name="quantity" value="${billing.quantity }"/>
Price<input type="number" name="amount" value="${billing.amount }"/>
</form>
</body>
</html>