<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
    <link rel="stylesheet" href="<c:url value="/WEB-INF/resources/css/style.css" />" />
</head>
<body>
<h2>Edit product</h2>
<br />
<c:import url="nav.jsp" />
<br />
<form action="/edit" method="POST" name="product">
    <label><b>ID #${product.id}</b></label>
    <label>Id </label><input readonly name="id" value="${product.id}" /><br />
    <lablel>Name product</lablel><input type="text" name="name" value="${product.name}" /><br />
    <lablel>Description</lablel><input type="text" name="description" value="${product.description}" /><br />
    <input type="submit" value="Submit" />
</form>
</body>
</html>
