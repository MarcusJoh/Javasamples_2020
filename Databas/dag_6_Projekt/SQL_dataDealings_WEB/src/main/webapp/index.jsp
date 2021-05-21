<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<%@page import="beans.merchantBean"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show me the mercs</title>
</head>
<body>



	<form action="<%=request.getContextPath()%>/SearchServlet"
		method="post">
		Get from the database:<input type="text" name="searchString"><br>

		<input type="submit" value="Get me some wine">
	</form>

	<%
	// get the results
	ArrayList<merchantBean> merchants = (ArrayList<merchantBean>) request.getAttribute("searchResult");

	// Remove this for a fun error
	if (!(merchants == null)) {
		out.print("You wanted , PUT THE SEARCH WORD HERE ALL ");

		out.print("<p> this is what you got</p>");

		out.print("<ul>");

		for (int i = 0; i < merchants.size(); i++) {
			out.print("<li>");
			out.print(merchants.get(i).getMerchantName());

			out.println(merchants.get(i).getMerchantPhone());
			out.print("</li>");
		}
		if (merchants.size() == 0) {
			out.print("well better handle what happend when we have no results");
		}

		out.print("</ul>");
		out.print("MAN its messy here, So clean it up ");
		out.print("Bonus if we can get some colours here ");
	}
	%>











</body>
</html>