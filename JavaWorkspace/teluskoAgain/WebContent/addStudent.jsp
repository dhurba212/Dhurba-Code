<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="AddStudent" method="post">
		Student FirstName:<input name="fname" type="text">
		Student LastName:<input name="lname" type="text">
		SchoolId:<input name="schoolid" type="text">
		<input type="submit" value="Submit">
	</form><br>
	
	${addmessage}


</body>
</html>