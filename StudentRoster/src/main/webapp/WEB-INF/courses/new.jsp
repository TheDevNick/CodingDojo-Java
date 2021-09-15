<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Course</title>


</head>
<body>
<div>
		<div>
			<h1>Create a Class</h1>
			<form:form action="/courses/new/process" method="post"
				modelAttribute="course" class="pt-3">

				<p>
					<form:label path="name">Name</form:label>
					<form:errors path="name" />
					<form:input path="name" class="form-control" />
				</p>

				<input type="submit" value="Create" />
			</form:form>
		</div>






</div>
</body>
</html>