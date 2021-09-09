<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<h1>Edit Book</h1>
<form:form action="/languages/update/${language.id}" method="post" modelAttribute="language">
   <p>
        <form:label path="name">Name</form:label>
        <form:errors path="name"/>
        <form:input type="text" path="name"/>
    </p>
    <p>
        <form:label path="creator">Creator</form:label>
        <form:errors path="creator"/>
        <form:input type="text" path="creator"/>
    </p>
    <p>
        <form:label path="version">Version</form:label>
        <form:errors path="version"/>
        <form:input type="text"  path="version"/>
    </p>
  
    <input type="submit" value="Submit"/>
</form:form> 
<a href="/languages">Dashboard</a> 