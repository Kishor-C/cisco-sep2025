<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>First Page</h1>
	<a href = "second.jsp">Second Page</a>
	
	<jsp:useBean id="obj" class = "com.cisco.Employee" scope = "session"></jsp:useBean>
	
	<jsp:setProperty property="id" name="obj" value="102"/>
	<jsp:setProperty property="name" name="obj" value="Alex"/>
	
</body>
</html>