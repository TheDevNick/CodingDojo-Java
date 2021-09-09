<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">


<title>Top Ten Songs</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm">Top Ten Songs:</div>
			<div class="col-sm">
				<a href="/dashboard">Dashboard</a>
			</div>
		</div>
		<table class="table table-bordered">
			<tbody>
				<c:forEach items="${songs}" var="song">
					<tr>
						<td><c:out value="${song.rating}" /></td>
						<td><a href="/songs/${song.id}"><c:out
									value="${song.title}" /></a></td>
						<td><c:out value="${song.artist}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

</body>

</body>
</html>