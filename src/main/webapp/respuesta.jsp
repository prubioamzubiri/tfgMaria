<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hoja de respuesta</title>
</head>
<body>

    <p> Porcentaje de gente con dicho perfil: <c:out value="${requestScope.percent}"/>%</p>
    <br>
    <br>

    <c:if test="${not empty requestScope.conditional}">
        <p> Porcentaje condicionado al grupo prévio: <c:out value="${requestScope.percentc}"/> </p>
    </c:if>


    <a href="../tfg">volver</a>


</body>
</html>