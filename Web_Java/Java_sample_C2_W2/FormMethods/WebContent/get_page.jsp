<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>







	<%
		String name = request.getParameter("fname");
	out.print("<p>welcome " + name + "</p>");

	String stuff = request.getParameter("stuff");
	out.print("<p>you picked " + stuff + "</p>");
	%>




</body>
</html>