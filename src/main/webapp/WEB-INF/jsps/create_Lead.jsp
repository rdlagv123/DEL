<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h2>Create Lead</h2>
<form action="saveLeadNow" method="post">
<pre>

FirstName <input type="text" name="firstName"/>
lastName <input type="text" name="lastName"/>
email <input type="email" name="email"/>
Mobile <input type="number" name="mobile"/>
Source:
<select name="source" >
  <option value="newspaper">Newspaper</option>
  <option value="webinar">Webinar</option>
  <option value="online">Online</option>
  <option value="radio">Radio</option>
</select> 
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>