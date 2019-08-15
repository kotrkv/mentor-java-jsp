<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
	<head>
		<title>All users</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css" type="text/css"/>
	</head>
	<body>
		<h3>Users...</h3>
		<table>
                <tr>
                    <td><%= request.getAttribute("user") %></td>
                </tr>
        </table>
	</body>
</html>