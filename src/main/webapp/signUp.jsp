<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Simple JSP Application</title>
	</head>
	<body>
		<h1>Hello world!</h1>
		<table>
            <tr>
                <th>User name</th>
                <th>User password</th>
                <th>User birthday</th>
            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>${user.name}</td>
                    <td>${user.password}</td>
                    <td>${user.birthday}</td>
                </tr>
            </c:forEach>
        </table>
	</body>
</html>