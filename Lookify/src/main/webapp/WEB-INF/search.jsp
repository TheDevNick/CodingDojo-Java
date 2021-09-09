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
			<div class="col-sm-4">
				Songs by artist: <c:out value="${artist}"/>
			</div>
			<div class="col-sm">
				<form action="/search" method="post">
					<input type="search" name="artist" placeholder="${artist}"/> 
					<input type="submit"  value="New Search" />
				</form>
			</div>
			<div class="col-sm"><a href="/dashboard">Dashboard</a>
			</div>
		</div>



		<table class="table table-bordered">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Name</th>
					<th scope="col">Rating</th>
					<th scope="col">Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${songs}" var="song">
					<tr>
						<td><a href="/songs/${song.id}"><c:out
									value="${song.title}" /></a></td>
						<td><c:out value="${song.rating}" /></td>
						<td><a href="/delete/${song.id}">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


	</div>

</body>
</html>