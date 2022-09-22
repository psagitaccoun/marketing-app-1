<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Create new lead </h2>
<form action="saveLead" method="post">
<pre>
<tr>
First Name<input type="text" name="firstName"/>
</tr>

<tr>
Last Name<input type="text" name="lastName"/>
</tr>

<tr>
Email<input type="text" name="email"/>
</tr>

<tr>
Mobile<input type="text" name="mobile"/>
</tr>

<tr>
<input type="submit" value="save"/>
</tr>

</pre>
</form>
${msg }
</body>
</html>