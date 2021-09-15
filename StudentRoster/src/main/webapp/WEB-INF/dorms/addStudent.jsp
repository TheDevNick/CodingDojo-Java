<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add student to dorm</title>



</head>
<body>
	<div >
<h1>Add Student to <c:out value="${dorm.name} Dorm" /></h1>


        <form action="/dorms/${dorm.id}/process" method="post">
            <p>
                <label>Student</label>

                <select  name="students" >
                    <c:forEach items="${students}" var="student">
                        <option value="${student.id}">${student.first_name} ${student.last_name}</option>
                    </c:forEach>
                </select>
            </p>
            <input type="submit" value="Submit"  />
        </form>

        <table>
            <thead>
                <tr>
                    <th scope="col">Name</th>
                    <th scope="col">Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${dorm.students}" var="student">
                    <tr>
                        <td><c:out value="${student.first_name}" /> <c:out value="${student.last_name}" /></td>
                        <td><a href="/dorms/${student.id}/delete">Remove</a></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
	</div>

</body>
</html>