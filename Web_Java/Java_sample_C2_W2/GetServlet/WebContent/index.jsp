<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>






	<div>
		<form action="http://localhost:8080/GetServlet/RunGet" method="get">
			Name with GET: <input name="fname" type="text">
			    <select name="stuff">
				<option value="1">1</option>
				<option value="bob">bob</option>
				<option value="something">nothing</option>
				<option value="monkeys">look a monkey</option>
			</select> <input type="submit" value="Submit as get">
		</form>
	</div>












</body>
</html>