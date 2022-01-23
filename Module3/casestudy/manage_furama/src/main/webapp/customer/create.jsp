<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/23/2022
  Time: 2:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Create Customer</h1>
<a href="/customer/control.jsp">Back To Customer</a>
<form method="post">
    <p>ID:</p>
    <input type="text" name="id">
    <p>Type:</p>
    <select name="type_id">
        <option value="1">Diamond</option>
        <option value="2">Platinium</option>
        <option value="3">Gold</option>
        <option value="4">Silver</option>
        <option value="5">Member</option>
    </select>
    <p>Name:</p>
    <input type="text" name="name">
    <p>Birthday: </p>
    <input type="date" name="birthday">
    <p>Gender:</p>
    <select name="gender">
        <option value="Male">Male</option>
        <option value="Female">Female</option>
    </select>
    <p>ID Card: </p>
    <input type="text" name="id_card">
    <p>Phone:</p>
    <input type="text" name="phone">
    <p>Email:</p>
    <input type="text" name="email">
    <p>Address: </p>
    <input type="text" name="address">
    <button type="submit">Create</button>
</form>
<p style="color: red">${msg}</p>
</body>
</html>
