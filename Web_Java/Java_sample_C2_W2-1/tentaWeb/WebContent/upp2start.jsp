<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>






<form action="<%= request.getContextPath() %>/Upp2" method="get">
 <p> What to send?  <input name="stuff" type="text" required ></p>
  
 <p> Min length? <input name="length" type="number" required></p>
  
  
  
  
  <p><input type="checkbox"  name="check1" value="A">
  <label > A</label></p>
  <p><input type="checkbox"  name="check2" value="B">
  <label> B</label></p>
  <p><input type="checkbox"  name="check3" value="C">
  <label > C</label>
  </p>
  
  
  
  
  
  <input type="submit" value="Submit">
</form>













</body>
</html>