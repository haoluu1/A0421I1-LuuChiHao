<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 05/05/2022
  Time: 8:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title></title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="post">
  <input type="checkbox" id="lettuce" name="condition" value="lettuce">
  <label for="lettuce">Lettuce</label><br>
  <input type="checkbox" id="tomoto" name="condition" value="tomoto">
  <label for="tomoto">Tomoto</label><br>
  <input type="checkbox" id="mustard" name="condition" value="mustard">
  <label for="mustard">Mustard</label><br>
  <input type="checkbox" id="sprouts" name="condition" value="sprouts">
  <label for="sprouts">Sprouts</label><br>
  <input type="submit" value="Submit"/>
</form>
<c:forEach items="${conditions}" var="condiment">
  <span>${condiment} </span>
</c:forEach>
</body>
</html>
