<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/18/2022
  Time: 7:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>List Customer</h2>
  <table style="width: 700px;" border="1">
    <tr>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa Chỉ</th>
      <th>Ảnh</th>
    </tr>
    <c:forEach var="customer" items="${customerList}">
    <tr>
      <td><c:out value="${customer.name}"></c:out></td>
      <td><c:out value="${customer.dateOfBirth}"></c:out></td>
      <td><c:out value="${customer.address}"></c:out></td>
      <td><img src="<c:out value="${customer.photo}"></c:out>"></td>
    </tr>
    </c:forEach>
  </table>
  </body>
</html>
