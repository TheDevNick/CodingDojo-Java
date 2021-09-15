<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>


</head>
<body>
<div>
<div>
		<div >
		<h1 >New Student</h1>
		
		<form:form action="/students/new/process" method="post"
			modelAttribute="student" class="pt-3">
			<p>
				<form:label path="first_name">First name</form:label>
				<form:errors path="first_name" />
				<form:input path="first_name" class="form-control" />
			</p>
			<p>
				<form:label path="last_name">Last name</form:label>
				<form:errors path="last_name" />
				<form:input path="last_name" class="form-control" />
			</p>
			<p>
				<form:label path="age">Age</form:label>
				<form:errors path="age" />
				<form:input path="age" class="form-control" />
	
			</p>

			<input type="submit" value="Add Student" />
		</form:form>
		</div>

	</div>
</div>
</body>
</html>