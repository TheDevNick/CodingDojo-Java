<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Book</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
	<h1><c:out value="${language.name}"/></h1>
	<p>Creator: <c:out value="${language.creator}"/></p>
	<p>Version: <c:out value="${language.version}"/></p>
	<a href="/languages/edit/${language.id}">Edit</a>
	<a href="/languages/delete/${language.id}">Delete</a>
	<a href="/languages">Dashboard</a>

</body>
</html>