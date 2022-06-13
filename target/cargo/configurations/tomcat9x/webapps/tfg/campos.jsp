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



    <form action = "/tfg" method = "POST" target = "_blank">


    <fmt:parseNumber var="numerodecampos" type="number" value="${param.numcampos}" />   

    <c:forEach var="i" begin="1" end="${numerodecampos}" step="1" varStatus ="status">
    <c:out value="${i}" /> 
    </c:forEach>



    
        <select name="country">
                    <c:forEach items="${campos}" var="campo" varStatus="loop">
                    <option value="${loop.index}">
                    ${campo}
                    </option>
                    </c:forEach>
        </select>

        <input type = "submit" value = "Ir" />
     </form>


</body>
</html>