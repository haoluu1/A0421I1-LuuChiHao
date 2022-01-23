<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/23/2022
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Search Customer</h1>
<a href="/customer/control.jsp">Back To Customer</a>
<p style="color: red">${msg}</p>
<form method="post">
    <p>ID:</p>
    <input type="text" name="id">
    <button type="submit">Search</button>
</form>
</body>
</html>
