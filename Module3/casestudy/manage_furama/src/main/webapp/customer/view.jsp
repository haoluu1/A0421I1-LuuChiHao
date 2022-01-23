<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/23/2022
  Time: 2:08 PM
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
<a href="/customer/control.jsp">Back To Customer</a>
<table style="width: 700px;" border="1">
    <tr>
        <th>ID</th>
        <th>Type</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>Gender</th>
        <th>ID Card</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
        <tr>
            <td><c:out value="${customer.id}"></c:out></td>
            <td>
                <c:if test="${customer.type_id == 1}">Diamond</c:if>
                <c:if test="${customer.type_id == 2}">Platinium</c:if>
                <c:if test="${customer.type_id == 3}">Gold</c:if>
                <c:if test="${customer.type_id == 4}">Silver</c:if>
                <c:if test="${customer.type_id == 5}">Member</c:if>
            </td>
            <td><c:out value="${customer.name}"></c:out></td>
            <td><c:out value="${customer.birthday}"></c:out></td>
            <td><c:out value="${customer.gender}"></c:out></td>
            <td><c:out value="${customer.id_card}"></c:out></td>
            <td><c:out value="${customer.phone}"></c:out></td>
            <td><c:out value="${customer.email}"></c:out></td>
            <td><c:out value="${customer.address}"></c:out></td>
            <td><a href="/customer_control?action=edit&id=${customer.getId()}">edit</a></td>
            <td><a href="/customer_control?action=delete&id=${customer.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
<p style="color: red">${msg}</p>
</body>
</html>
