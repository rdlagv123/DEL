<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose Email</title>
</head>
<body>
<h2>Compose Email</h2>
 ${msg }
<form action="sendEmailNow" method="post">
<pre>

To<input type="text" name="to" value="${email }"  />
Subject<input type="text" name="subject"/>
<textarea  name="msg" rows="4" cols="50">
</textarea>
<input type="submit" value="send"/>

</pre>
</form>
</body>
</html>