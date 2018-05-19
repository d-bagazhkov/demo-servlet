<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
    <link rel="stylesheet" href="<c:url value="/WEB-INF/resources/css/style.css" />" />
</head>
<body>
<h2>Details</h2>
<br />
<c:import url="nav.jsp" /><br />
<b><h3>${product.id}</h3></b><br />
<b><h3>${product.name}</h3></b><br />
<b><h3>${product.description}</h3></b>
</body>
</html>
