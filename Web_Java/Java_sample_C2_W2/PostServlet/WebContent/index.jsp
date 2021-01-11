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
		<form action="<%= request.getContextPath() %>/RunPost" method="post">
			Name with POST: <input name="fname" type="text">
			    <select name="stuff">
				<option value="1">1</option>
				<option value="bob">bob</option>
				<option value="something">nothing</option>
				<option value="monkeys">look a monkey</option>
				
				
				
				
					pass with POST: <input name="pass" type="password">
			</select> <input type="submit" value="Submit as post">
		</form>
	</div>












</body>
</html>