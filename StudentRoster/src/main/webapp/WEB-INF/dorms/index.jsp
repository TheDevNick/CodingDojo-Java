<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dorms</title>

</head>
<body>
<div >
		<h1>All Dorms</h1>
		<a href="/dorms/new">Add Dorm</a> 
		<table >
			<thead>
				<tr>
					<th scope="col">Name</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${dorms}" var="dorm">
					<tr>
						<td>
							<a href="/dorms/${dorm.id}"><c:out value="${dorm.name}"/></a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

</div>
</body>
</html>