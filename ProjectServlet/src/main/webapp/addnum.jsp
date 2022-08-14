<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">
		<%
		
		String i = request.getParameter("t1");		
    	String j = request.getParameter("t2");
		int k = Integer.parseInt(i) + Integer.parseInt(j) ;
		out.println(k);
		
		%>
</body>
</html>