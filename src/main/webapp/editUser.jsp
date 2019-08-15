<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Add new user</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" type="text/css"/>
	</head>
	<body>
		<h3>Add new user...</h3>
		<form action="/edit" method="post" class="form-style-9">
		<ul>
		    <li>
		        <input type = "text" name = "name" value = "${user.name}" class="field-style field-full align-none"/>
		    </li>
		    <li>
		        <input type = "password" name = "password" value = "${user.password}" class="field-style field-full align-none"/>
		    </li>
		    <li>
		        <input type = "birthday" name = "birthday" value = "${user.birthday}" class="field-style field-full align-none"/>
		    </li>
		    <li>
		        <input type = "submit"/>
		    </li>
		</ul>
		</form>
	</body>
</html>