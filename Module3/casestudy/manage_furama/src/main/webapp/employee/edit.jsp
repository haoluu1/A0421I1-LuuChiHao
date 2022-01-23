<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/23/2022
  Time: 11:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Employee</h1>
<a href="/employee/control.jsp">Back To Employee</a>
<form method="post">
    <p>Name:</p>
    <input type="text" name="name" value="${employee.name}">
    <p>Birthday:</p>
    <input type="date" name="birthday" value="${employee.birthday}">
    <p>ID Card:</p>
    <input type="text" name="id_card" value="${employee.id_card}">
    <p>Salary:</p>
    <input type="text" name="salary" value="${employee.salary}">
    <p>Phone:</p>
    <input type="text" name="phone" value="${employee.phone}">
    <p>Email:</p>
    <input type="text" name="email" value="${employee.email}">
    <p>Address:</p>
    <input type="text" name="address" value="${employee.address}">
    <p>Position:</p>
    <select name="position_id">
        <option value="1">Receptionist</option>
        <option value="2">Serve</option>
        <option value="3">Specialist</option>
        <option value="4">Supervision</option>
        <option value="5">Manage</option>
        <option value="6">Director</option>
    </select>
    <p>Education Degree:</p>
    <select name="education_degree_id">
        <option value="1">Intermediate</option>
        <option value="2">College</option>
        <option value="3">University</option>
        <option value="4">Graduate</option>
    </select>
    <p>Division:</p>
    <select name="division_id">
        <option value="1">Sale – Marketing</option>
        <option value="2">Administrative</option>
        <option value="3">Service</option>
        <option value="4">Management</option>
    </select>
    <p>Username: </p>
    <input type="text" name="username">
    <button type="submit">Edit</button>
</form>
</body>
</html>
