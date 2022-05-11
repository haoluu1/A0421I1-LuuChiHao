<%--
  Created by IntelliJ IDEA.
  User: Bin
  Date: 5/11/2022
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:form="http://www.w3.org/1999/xhtml">
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="/save" modelAttribute="update">
    <form:label path="id">Id</form:label>
    <form:hidden path="id" itemValue="id"></form:hidden>
    <form:label path="language">Language</form:label>
    <form:select path="language" itemValue="language">
        <form:option value="English" label="English"/>
        <form:option value="Vietnamese" label="Vietnamese"/>
        <form:option value="Japanese" label="Japanese"/>
        <form:option value="Chinese" label="Chinese"/>
    </form:select>
    <br>
    <form:label path="size">Size</form:label>
    <form:select path="size" itemValue="size">
        <form:option value="5" label="5"/>
        <form:option value="10" label="10"/>
        <form:option value="25" label="25"/>
        <form:option value="50" label="50"/>
    </form:select>
    <br>
    <form:label path="filter">Spams Filter</form:label>
    <form:checkbox path="filter" itemValue="filter"></form:checkbox>
    <br>
    <form:label path="signature">Signature</form:label>
    <form:textarea path="signature" itemValue="signature"></form:textarea>
    <br>
    <input type="submit" value="Update">
    <a href="/">Cancle</a>
</form:form>
</body>
</html>
