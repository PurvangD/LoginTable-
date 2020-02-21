<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.sql.DriverManager"%>
	<%@page import="java.sql.ResultSet"%>
	<%@page import="java.sql.Statement"%>
	<%@page import="java.sql.Connection"%>
	<%@page import="java.io.*"%>
	<%@page import="java.util.*"%>
	<%@page import="servletExample.Employee"%>
<html>
<head>
<meta charset="UTF-8">
<title>JSP List USer Record</title>
</head>
<body>
	


	<h2 align="center">
		<font><strong>Retrieve data from database in JSP</strong></font>
	</h2>
	<%
try {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "ThisIsMe23@");
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery("select * from EmployeeJspTable");
	%>
	
	<TABLE  border="1" style="background-color: #707070;">

<%
	while(rs.next()){
%>
<tr>
	<TD><%=rs.getInt(1)%></TD>
	<TD><%=rs.getString(2)%></TD>
	<TD><%=rs.getString(3)%></TD>
	</tr>
	<%} %>
	
	<%
	rs.close();
	st.close();
	con.close();
}
	catch (ClassNotFoundException e) {
	}
		
	%>
	
</TABLE>
</body>
</html>