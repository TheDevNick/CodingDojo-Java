<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">



<title>Lookify</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-8"></div>
			<div class="col-sm">
				<a href="/dashboard">Dashboard</a>
			</div>
		</div>
		
		<form:form action="/songs/new" method="post" modelAttribute="addsong">
		<div class="row">
			<div class="col-sm-2"><form:label path="title">Title</form:label></div>
			<div class="col-sm">
				<form:input path="title"/>
				<form:errors path="title"/>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-2"><form:label path="artist">Artist</form:label></div>
			<div class="col-sm">
				<form:input path="artist"/>
				<form:errors path="artist"/>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-2">Rating(1-10)</div>
			<div class="col-sm">
				<form:select path="rating">
					<form:option value="1">1</form:option>
					<form:option value="2">2</form:option>
					<form:option value="3">3</form:option>
					<form:option value="4">4</form:option>
					<form:option value="5">5</form:option>
					<form:option value="6">6</form:option>
					<form:option value="7">7</form:option>
					<form:option value="8">8</form:option>
					<form:option value="9">9</form:option>
					<form:option value="10">10</form:option>
				</form:select>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm"><input type="submit" value="Add Song"/></div>
		</div>
		</form:form>
		
		

</body>
</html>