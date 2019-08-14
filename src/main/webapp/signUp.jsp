<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Simple JSP Application</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" type="text/css"/>
	</head>
	<body>
		<h1>Hello world!</h1>
		<form action="/sign" method="post" class="form-style-9">
		<ul>
		    <li>
		        <input type = "text" name = "name" placeholder = "Input name..." class="field-style field-full align-none"/>
		    </li>
		    <li>
		        <input type = "password" name = "password" placeholder = "Input password..." class="field-style field-full align-none"/>
		    </li>
		    <li>
		        <input type = "birthday" name = "birthday" placeholder = "Input birthday..." class="field-style field-full align-none"/>
		    </li>
		    <li>
		        <input type = "submit"/>
		    </li>
		</ul>
		</form>
	</body>
</html>