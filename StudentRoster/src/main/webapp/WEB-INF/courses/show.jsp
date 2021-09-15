<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Class Details</title>

</head>
<body>
	<div>
		<h1>${course.name}</h1>
		<div>
			<table>
				<thead>
					<tr>
						<th scope="col">Name</th>
					
					</tr>
				</thead>
				<tbody>
				<h3>Students taking this course</h3>
					<c:forEach items="${course.students}" var="student">
						<tr>
							<td><a href="/courses/${student.id}">${student.first_name}
									${student.last_name}</a></td>
							
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>