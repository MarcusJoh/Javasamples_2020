<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!--declaration tags are kinda like global declarations   -->



<%! String Name="Marcus"; %> 

<%= Name %>  

<%



out.print("manual print "+Name);  %>





<!-- these can be methods  -->




<%!   
public static int stuff(String aString) {


	return aString.length();
}
%>  


<%



out.print(stuff("How long?"));  %>






</body>
</html>