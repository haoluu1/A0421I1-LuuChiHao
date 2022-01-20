<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/19/2022
  Time: 5:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Display Product</title>
</head>
<body>
<h1>Product</h1>
<p>
    <a href="/product">Back to list</a>
</p>
<table style="width: 700px;" border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Producer</th>
    </tr>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td><c:out value="${product.id}"></c:out></td>
            <td><c:out value="${product.name}"></c:out></td>
            <td><c:out value="${product.price}"></c:out></td>
            <td><c:out value="${product.description}"></c:out></td>
            <td><c:out value="${product.producer}"></c:out></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
