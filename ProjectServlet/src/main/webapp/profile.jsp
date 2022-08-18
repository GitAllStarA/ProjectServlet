<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
    <%@ page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
		
		String url = "jdbc:mysql://localhost:3306/employees?serverTimezone=UTC";
		String db_username = "root";
		String db_password = "mbp16.2$";
		String sql = "select * from employees.employees limit 10";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,db_username,db_password);
		Statement stmt = con.createStatement();
		
		
		ResultSet rs = stmt.executeQuery(sql);
		rs.next();
		
		
		
		%>
		
		
		id : <%= rs.getString(1) %> </br>
		bd :  <%= rs.getString(2) %> </br>
		fn :  <%= rs.getString(3) %> </br>
		ln :  <%= rs.getString(4) %> </br>
		g :  <%= rs.getString(5) %> </br>
</body>
</html>