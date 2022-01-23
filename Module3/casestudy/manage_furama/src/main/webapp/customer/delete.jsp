<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/23/2022
  Time: 9:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Customer</h1>
<a href="/customer/control.jsp">Back To Customer</a>
<form method="post">
    <p>ID:</p>
    <input type="text" name="id" value="${customer.id}" disabled>
    <p>Type:</p>
    <input type="text" name="type_id" value="${customer.type_id}" disabled>
    <p>Name:</p>
    <input type="text" name="name" value="${customer.name}" disabled>
    <p>Birthday:</p>
    <input type="date" name="birthday" value="${customer.birthday}" disabled>
    <p>Gender:</p>
    <input type="text" name="gender" value="${customer.gender}" disabled>
    <p>ID Card:</p>
    <input type="text" name="id_card" value="${customer.id_card}" disabled>
    <p>Phone:</p>
    <input type="text" name="phone" value="${customer.phone}" disabled>
    <p>Email:</p>
    <input type="text" name="email" value="${customer.email}" disabled>
    <p>Address:</p>
    <input type="text" name="address" value="${customer.address}" disabled>
    <button type="submit">Delete</button>
</form>
</body>
</html>
