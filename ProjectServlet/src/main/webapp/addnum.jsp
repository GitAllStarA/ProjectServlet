<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" errorPage="error.jsp"%>
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
	int k = Integer.parseInt(i) + Integer.parseInt(j);

	out.println(k+"\n");

	// its only availble in this page
	pageContext.setAttribute("name", "vikranth");

	// its can increase scope to session
	pageContext.setAttribute("name", "vikranth", PageContext.SESSION_SCOPE);

	int x = 0;

		x = 9 / 0;
	
	%>
</body>
</html>