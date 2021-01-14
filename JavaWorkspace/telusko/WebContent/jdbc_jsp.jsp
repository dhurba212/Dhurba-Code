<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello
	<%
	Class.forName("org.postgresql.Driver");
	String url="jdbc:postgresql://localhost:5432/Example";
	String username="postgres";
	String password="password";
	String sql="select * from student";
	Connection conn= DriverManager.getConnection(url,username,password);
	PreparedStatement ps = conn.prepareStatement(sql);
	
	ResultSet rs = ps.executeQuery();
	while(rs.next())
	{
		
		out.println(rs.getInt(1));
		out.println(rs.getString(2));
		out.println(rs.getString(3));
		out.println(rs.getInt(4));
	}
	
	out.println("hello hello");

%>

	

	





</body>
</html>