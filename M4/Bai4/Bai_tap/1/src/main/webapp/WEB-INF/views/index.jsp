<%--
  Created by IntelliJ IDEA.
  User: Bin
  Date: 5/11/2022
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<h2>List Customer</h2>
<table border="1">
    <tr>
        <td>language</td>
        <td>size</td>
        <td>filter</td>
        <td>signature</td>
        <td></td>
    </tr>
    <c:forEach items="${lists}" var="list">
        <tr>
            <td>${list.language}</td>
            <td>${list.size}</td>
            <td>${list.filter}</td>
            <td>${list.signature}</td>
            <td>
                <a href="/update/${list.id}">Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
