<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student to Course</title>

</head>
<body>
	<div >

		<h1 >${student.first_name}${student.last_name}</h1>

		<!--- Add student to course form --->

		<div>
			<form action="/students/${student.id}/process" method="post"">
				<label>Course</label> 
				<select  name="course_id">
					<c:forEach items="${courses}" var="course">
						<option value="${course.id}">${course.name}</option>
					</c:forEach>
				</select> 
				<input type="submit" value="Submit" />
			</form>
		</div>

		<!-- Show all courses that student is taking -->
		<h1>Your Schedule</h1>
		<table >
			<thead>
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${student.courses}" var="course">
					<tr>
						<td><a href="/courses/${course.id}">${course.name}</a></td>
						<td>
							<form action="/students/${course.id}/delete" method="get">
								<input type="hidden" name="student_id" value="${student.id}" />
								<input type="hidden" name="course_id" value="${course.id}" />
								<input type="submit" class="btn btn-link" value="Delete" />
							</form>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>