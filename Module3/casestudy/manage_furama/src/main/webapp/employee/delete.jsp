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
    <p>ID:</p>
    <input type="text" name="id" value="${employee.id}" disabled>
    <p>Name:</p>
    <input type="text" name="name" value="${employee.name}" disabled>
    <p>Birthday:</p>
    <input type="date" name="birthday" value="${employee.birthday}" disabled>
    <p>ID Card:</p>
    <input type="text" name="id_card" value="${employee.id_card}" disabled>
    <p>Salary:</p>
    <input type="text" name="salary" value="${employee.salary}" disabled>
    <p>Phone:</p>
    <input type="text" name="phone" value="${employee.phone}" disabled>
    <p>Email:</p>
    <input type="text" name="email" value="${employee.email}" disabled>
    <p>Address:</p>
    <input type="text" name="address" value="${employee.address}" disabled>
    <p>Position:</p>
    <input type="text" name="position_id" value="${employee.position_id}" disabled>
    <p>Education Degree:</p>
    <input type="text" name="education_degree_id" value="${employee.education_degree_id}" disabled>
    <p>Division:</p>
    <input type="text" name="division_id" value="${employee.division_id}" disabled>
    <p>Username:</p>
    <input type="text" name="username" value="${employee.username}" disabled>
    <button type="submit">Delete</button>
</form>
</body>
</html>