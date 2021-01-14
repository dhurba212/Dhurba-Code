<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="red">

<!-- Make sure you add isErrorPage="true" so u can use this as an eroor page -->
	Error
	<%=exception.getMessage() %>

</body>
</html>