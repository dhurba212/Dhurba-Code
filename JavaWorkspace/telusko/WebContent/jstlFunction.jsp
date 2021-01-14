<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="str" value="my name is dhurba"></c:set>
	Length: ${str}<br>
1)Length<br>
	Length: ${fn:length(str)}<br>
	
2)split string into array	<br>
	<c:forEach var="each" items="${fn:split(str,' ')}">
		<c:out value="${each}"/><br>
	</c:forEach>
	
3)indexOf in a string <br>
	index: ${fn:indexOf(str,"is")}<br>
	
4)contains: see if string contains a particular substring <br>
	is there: ${fn:contains(str,"is") }	<br>
	is there: ${fn:contains(str,'z') } <br>

5) This is not a function but how we can use if with the function <br>
	<c:if test="${fn:contains(str,'dhurba') }">
		<c:out value="${str}"/>
	</c:if>
	<br>
6)There are a lot more function, to explore, type control shift after $f n:  <br>
	${fn:toUpperCase(str)} 
	
	
	
	
</body>
</html>