<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students</title>


</head>
<body>
	<div>
		<h1>All Students</h1>
		<a href="/students/new">Add Student</a>
		<a href="/contacts/new">Add Contact</a>
		<a href="/dorms/new">Add Dorm</a>
		<a href="/courses/new">Add Course</a>
		
		<table>
			<thead>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Age</th>
					<th scope="col">Address</th>
					<th scope="col">City</th>
					<th scope="col">State</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${students}" var="student">
					<tr>
						<td><a href="/students/${student.id}"><c:out value="${student.first_name} ${student.last_name}" /></a></td>
						<td><c:out value="${student.age}" /></td>
						<td><c:out value="${student.contact.address}" /></td>
						<td><c:out value="${student.contact.city}" /></td>
						<td><c:out value="${student.contact.state}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>
</body>
</html>