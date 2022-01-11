<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 1/7/2022
  Time: 8:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/convert" method="post">
  <label>Product Description: </label><br/>
  <input type="text" name="productDescription" placeholder="Product Description" value="0"><br/>
  <label>List Price: </label><br/>
  <input type="text" name="listPrice" placeholder="List Price" value="0"><br/>
  <label>Discount Percent: </label><br/>
  <input type="text" name="discountPercent" placeholder="Discount Percent" value="0"><br/>
  <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>
