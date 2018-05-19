<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
    <link rel="stylesheet" href="<c:url value="/WEB-INF/resources/css/style.css" />" />
</head>
<body>
<h2>Create new product</h2>
<br />
<c:import url="nav.jsp" />
<form action="/create-product" method="POST" name="product">
    <lablel>Name product</lablel><input type="text" name="name" /><br />
    <lablel>Description</lablel><input type="text" name="description" /><br />
    <input type="submit" value="Submit" />
</form>
</body>
</html>
