<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
	<div class = "container-fluid">
		<h1>List of profiles</h1>
		<hr />
		
		<%@taglib uri = "jakarta.tags.core" prefix = "c" %>
		
		<table class = "table">
			<thead>
				<tr><th>Id</th><th>Name</th><th>Gender</th><th>Phone</th></tr>
			</thead>
			<tbody>
				<c:forEach items = "${requestScope.profiles}" var = "p">
					<tr>
						<td>${p.id}</td><td>${p.name}</td><td>${p.gender}</td><td>${p.phone}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>