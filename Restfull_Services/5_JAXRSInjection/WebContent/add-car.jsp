<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Car</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/rest/" method="post">
		Model No : <input name="modelNo"/><br>
		Type : <input name="type"><br>
		Manuf :<input name="manuf"/><br>
		Year :<input name="year"/><br>
		<button type="submit">Add</button>
	</form>
</body>
</html>