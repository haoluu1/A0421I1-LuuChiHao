<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/23/2022
  Time: 11:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>List Customer</h1>
<a href="/employee/control.jsp">Back To Customer</a>
<table style="width: 700px;" border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>ID Card</th>
        <th>Salary</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>Position</th>
        <th>Education Degree</th>
        <th>Division</th>
        <th>Username</th>
    </tr>
    <c:forEach var="employee" items="${employeeList}">
        <tr>
            <td><c:out value="${employee.id}"></c:out></td>
            <td><c:out value="${employee.name}"></c:out></td>
            <td><c:out value="${employee.birthday}"></c:out></td>
            <td><c:out value="${employee.id_card}"></c:out></td>
            <td><c:out value="${employee.salary}"></c:out></td>
            <td><c:out value="${employee.phone}"></c:out></td>
            <td><c:out value="${employee.email}"></c:out></td>
            <td><c:out value="${employee.address}"></c:out></td>
            <td>
                <c:if test="${employee.position_id == 1}">Receptionist</c:if>
                <c:if test="${employee.position_id == 2}">Serve</c:if>
                <c:if test="${employee.position_id == 3}">Specialist</c:if>
                <c:if test="${employee.position_id == 4}">Supervision</c:if>
                <c:if test="${employee.position_id == 5}">Manage</c:if>
                <c:if test="${employee.position_id == 6}">Director</c:if>
            </td>
            <td>
                <c:if test="${employee.education_degree_id == 1}">Intermediate</c:if>
                <c:if test="${employee.education_degree_id == 2}">College</c:if>
                <c:if test="${employee.education_degree_id == 3}">University</c:if>
                <c:if test="${employee.education_degree_id == 4}">Graduate</c:if>
            </td>
            <td>
                <c:if test="${employee.division_id == 1}">Sale – Marketing</c:if>
                <c:if test="${employee.division_id == 2}">Administrative</c:if>
                <c:if test="${employee.division_id == 3}">Service</c:if>
                <c:if test="${employee.division_id == 4}">Management</c:if>
            </td>
            <td><c:out value="${employee.username}"></c:out></td>
            <td><a href="/employee_control?action=edit&id=${employee.getId()}">edit</a></td>
            <td><a href="/employee_control?action=delete&id=${employee.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
<p style="color: red">${msg}</p>
</body>
</html>
