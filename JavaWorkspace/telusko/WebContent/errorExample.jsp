<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	//here the error is handled here so it doesnt use error.jsp page
	try
	{
		int x=9/0;
	}
	catch(Exception e)
	{
		out.println("there was some error");
		e.getMessage();
	}
	// since this line will throw error, it will be handled by 
	//error.jsp page which is called from @page errorPage="error.jsp"
	int y=10/0;
	
	%>
	
</body>
</html>