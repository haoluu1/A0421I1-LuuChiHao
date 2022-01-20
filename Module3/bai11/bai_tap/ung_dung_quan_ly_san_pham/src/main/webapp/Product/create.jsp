<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/20/2022
  Time: 11:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create Product</h1>
<p>
    <a href="/product">Back to list</a>
</p>
<form method="post">
    <p>ID:</p>
    <input type="text" name="id">
    <p>Name: </p>
    <input type="text" name="name">
    <p>Price:</p>
    <input type="text" name="price">
    <p>Description: </p>
    <input type="text" name="description">
    <p>Producer:</p>
    <input type="text" name="producer">
    <button type="submit">Create</button>
</form>
</body>
</html>
