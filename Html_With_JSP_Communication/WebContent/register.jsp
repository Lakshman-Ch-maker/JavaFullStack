<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name = request.getParameter("uName");
String mail = request.getParameter("eMail");
String addr = request.getParameter("address");
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/madhudb","root","");
PreparedStatement stmt = con.prepareStatement("insert into register values(?,?,?)");
stmt.setString(1, name);
stmt.setString(2, mail);
stmt.setString(3, addr);
int i = stmt.executeUpdate();
if(i > 0)
{
	out.println("succesfully registered");   
}

%>
</body>
</html>