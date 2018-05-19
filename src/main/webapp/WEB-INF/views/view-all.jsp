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
        <th>Description</th>
        <th>*</th>
        <th>/</th>
        <th>X</th>
    </tr>
    <c:forEach items="${products}" var="product">
    <tr>
        <td><c:out value="${product.name}" /></td>
        <td><c:out value="${product.description}" /></td>
        <td><a href="<c:url value="/details?id=${product.id}" />">Details</a></td>
        <td><a href="<c:url value="/edit?id=${product.id}" />">Edit</a></td>
        <td><a href="<c:url value="/delete?id=${product.id}" />">Delete</a></td>
    </tr>
    </c:forEach>
    <tr>
        <td colspan="4" align="center">
            <a href="<c:url value="/create-product" />">Create</a>
        </td>
    </tr>
</table>
</body>
</html>