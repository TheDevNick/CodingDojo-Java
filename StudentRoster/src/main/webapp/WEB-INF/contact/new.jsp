<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Info</title>




</head>
<body>
	<div>

		<div>
			<h1>Contact Info</h1>
			<form:form action="/contacts/new/process" method="post"
				modelAttribute="contact" class="pt-3">
				<p>
					<form:label path="student">Student</form:label>
					<form:errors path="student" />
					<form:select path="student" class="form-control">

						<c:forEach items="${students}" var="student">
							<option value="${student.id}">${student.first_name}
								${student.last_name}</option>
						</c:forEach>
					</form:select>
				</p>

				<p>
					<form:label path="address">Address</form:label>
					<form:errors path="address" />
					<form:input path="address" class="form-control" />
				</p>
				<p>
					<form:label path="city">City</form:label>
					<form:errors path="city" />
					<form:input path="city" class="form-control" />
				</p>
				<p>
					<form:label path="state">State</form:label>
					<form:errors path="state" />
					<form:input path="state" class="form-control" />
				</p>

				<input type="submit" value="Create" class="btn btn-secondary" />
			</form:form>
		</div>
	</div>
</body>
</html>
