<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page import="java.util.ArrayList,java.util.List, model.Student" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	List<Student> allstudent=(List<Student>)request.getAttribute("allstudent");
		
	%>
	${name}<br>
	
	<table>
		<thead>
			<tr>
				<th>StudentId</th>
				<th> FirstName</th>
				<th>LastName</th>
				<th>SchoolId</th>
			</tr>
		</thead>
		
		<tbody>
			<c:forEach var="student" items="${allstudent}">
			<tr>
				<td><c:out value="${student.studentid}"></c:out></td>
				<td><c:out value="${student.firstName}"></c:out></td>
				<td><c:out value="${student.lastName}"></c:out></td>
				<td><c:out value="${student.schoolId}"></c:out></td>
			</tr>
			</c:forEach>
		</tbody>
		
	</table>
	<c:out value="hello"/><br>
	<c:forEach var="student" items="${allstudent}">
	
		<c:out value="${student.firstName}"/><br>
	
	
	</c:forEach>
	
	<c:out value="${name}"></c:out>
	<!--<c:import url="http://www.google.com"></c:import>  -->
	
	
</body>
</html>