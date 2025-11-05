<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		if(user.equals(pass)) {
			out.println("<h3>Successfully logged in </h3>");
			out.println("<h3>Session id: "+session.getId()+"</h3>");
		} else {
			out.println("<h3>login failed </h3>");
		}
	%>
</body>
</html>