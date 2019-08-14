<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Simple JSP Application</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" type="text/css"/>
	</head>
	<body>
		<h3>Users</h3>
		<table>
            <tr>
                <th>User name</th>
                <th>User password</th>
                <th>User birthday</th>
                <th>Edit</th>
                <th>Remove</th>
            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.name}</td>
                    <td>${user.password}</td>
                    <td>${user.birthday}</td>
                    <td><a href="">Edit</a></td>
                    <td><a href="">Remove</a></td>
                </tr>
            </c:forEach>
        </table>
	</body>
</html>