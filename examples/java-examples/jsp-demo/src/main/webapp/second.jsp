<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Second Page</h1>
	
	<jsp:useBean id="obj" class = "com.cisco.Employee" scope = "session"></jsp:useBean>
	<h2>
		Hello <jsp:getProperty property="name" name="obj"/>, your id is
		<jsp:getProperty property="id" name="obj"/>
	</h2>
</body>
</html>