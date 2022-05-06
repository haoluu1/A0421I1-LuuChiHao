<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 06/05/2022
  Time: 5:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
</head>
<body>
<form action="/action" method="post">
  <input type="number" name="num1">
  <input type="number" name="num2">
  <input type="submit" value="+" name="condition">
  <input type="submit" value="-" name="condition">
  <input type="submit" value="x" name="condition">
  <input type="submit" value="/" name="condition">
</form>
<p>${resutls}</p>
</body>
</html>
