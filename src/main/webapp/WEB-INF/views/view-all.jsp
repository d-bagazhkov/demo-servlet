<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
    <link rel="stylesheet" href="<c:url value="/WEB-INF/resources/css/style.css" />" />
</head>
<body>
<h2>Talble products</h2>
<br />
<c:import url="nav.jsp" />
<br />
<table>
    <tr>
        <th>Name</th>
        <th>Desctiption</th>
    </tr>
    <c:forEach items="product" var="products">
    <tr>
        <td>${product.name}</td>
        <td>${product.description}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>