<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Campos a estudiar</title>
</head>
<body>


    <form action = "/tfg/respuesta" method = "POST">
   
        <input type="number" name="numcampos" value="<c:out value="${param.numcampos}"/>" readonly>

        <br>

        <c:forEach var="i" begin="1" end="${param.numcampos}" step="1" varStatus ="status">
        
            

            <select name="campo<c:out value="${i}"/>">
                <c:forEach items="${campos}" var="campo" varStatus="loop">
                <option value="${loop.index}">
                <c:out value="${campo}"/>
                </option>
                </c:forEach>
            </select>

            <input type="text" name="respuesta<c:out value="${i}"/>"/>

            <br>
        
        </c:forEach>
            <input type = "submit" value = "Ir" />
         </form>



</body>
</html>