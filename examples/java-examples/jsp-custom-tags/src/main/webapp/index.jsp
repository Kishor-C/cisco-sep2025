<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>JSTL Demo</h1>
	<h2>Users List</h2>
	
	<a href = "ListUserServlet">List Users</a>
	
	<%@taglib uri="jakarta.tags.core" prefix="c" %>
	<h2>Out tag</h2>
	<c:out value="Hello JSTL"></c:out>
	<h2>Set a value to a variable</h2>
	<c:set var="username" value="Kishor"></c:set> <br />
	<c:out value="${username}" />
	<h2>Iteration tag</h2>
	<c:forEach items="Apples, Grapes, Orange" var = "item">
		<p>${item}</p>
	</c:forEach>
	
	<h1>Custom Tags</h1>
	<%@taglib uri = "WEB-INF/demo.tld" prefix = "custom" %>
	
	<custom:demo></custom:demo>
	<h2>Today is <custom:currentDate pattern="dd-MM-yyyy" /> </h2>
	<h2>Today is <custom:currentDate pattern="MMM dd, yyyy" /> </h2>
	<h2>Today is <custom:currentDate pattern="dd-MMMM-yyyy" /> </h2>
</body>
</html>