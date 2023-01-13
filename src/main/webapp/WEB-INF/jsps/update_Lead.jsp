<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lead</title>
</head>
<body>
<h2>Update Lead</h2>
<form action="last" method="post">
<pre>
<input type="hidden" name="id" value="${lead.id }"/>
FirstName <input type="text" name="firstName" value="${lead.firstName }"/>
lastName <input type="text" name="lastName" value="${lead.lastName }"/>
email <input type="email" name="email" value="${lead.email }"/>
Mobile <input type="number" name="mobile" value="${lead.mobile }"/>
Source:
<select name="source" >
  <option value="newspaper">Newspaper</option>
  <option value="webinar">Webinar</option>
  <option value="online">Online</option>
  <option value="radio">Radio</option>
</select> 
<input type="submit" value="update_Lead_Details"/>
</pre>
</form>
</body>
</html>