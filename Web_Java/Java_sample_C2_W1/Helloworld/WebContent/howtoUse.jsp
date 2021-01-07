<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<% // this is java here

//this is a Scriptlet tag
//cant do classes and metods here and stuff




String time = java.util.Calendar.getInstance().getTime().toString();
out.print(time);




for (int i = 0; i <= 10; i = i + 2) {
	  System.out.println(i);
	  out.println(i);
	}










// intill it stops

%>
<!-- not java here, just html -->




















</body>
</html>