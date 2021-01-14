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
	//put this three line is secure page, so once you log-out, the back button won't take u back to previous secure page.
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");//http 1.1 or above
	response.setHeader("Pragma","no-cache"); //http 1.0 or below
	response.setHeader("Expires","0"); //Proxies
	
		if(session.getAttribute("username")==null)
		{
			response.sendRedirect("loginLogin.jsp");
		}

	%>
	I am a loginWelcome page<br>
	Welcome:: ${username}<br>
	<a href="loginAboutUs.jsp">About Us</a><br>
	<a href="loginVideos.jsp"> lets go to video page</a>


	<form action="logout">
		<input type="submit"value="Logout">
	</form>

</body>
</html>