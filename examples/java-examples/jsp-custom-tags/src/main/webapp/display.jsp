<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Display Users</h2>
	<%@taglib uri="jakarta.tags.core" prefix="c" %>
	<ol>
		<c:forEach var = "user" items = "${sessionScope.list}">
			<li>${user}</li>
		</c:forEach>
	</ol>
</body>
</html>