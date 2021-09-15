<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Dorm</title>



</head>
<body>
<div >
		<div >
		<h1 >New Dorm</h1>
		
		<form:form action="/dorms/new/process" method="post"
			modelAttribute="dorm">
			<p>
				<form:label path="name">Name</form:label>
				<form:errors path="name" />
				<form:input path="name" class="form-control" />
			</p>

			<input type="submit" value="Add Dorm" />
		</form:form>
		</div>

	</div>
</div>
</body>
</html>