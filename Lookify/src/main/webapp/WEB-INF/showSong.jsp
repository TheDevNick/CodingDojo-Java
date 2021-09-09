<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
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
		
		<div class="row">
			<div class="col-sm-2">Title</div>
			<div class="col-sm"><c:out value="${song.title}"/>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-2">Artist</div>
			<div class="col-sm"><c:out value="${song.artist}"/>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-2">Rating(1-10)</div>
			<div class="col-sm"><c:out value="${song.rating}"/>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-2"><a href="/delete/${song.id}">Delete</a></div>
			<div class="col-sm"></div>
		</div>
	</div>
	
</body>
</html>