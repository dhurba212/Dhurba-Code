<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");//http 1.1 or above support this
	response.setHeader("Pragma","no-cache");//http 1.0 or less	
	response.setHeader("Expires","0");// Proxies
	
		if(session.getAttribute("username")==null)
		{
			response.sendRedirect("loginLogin.jsp");
		}
	
	
	%>
	You are in a login video page
	<iframe width="560" height="315" src="https://www.youtube.com/embed/dtTA2ekzw7Q" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
</body>
</html>