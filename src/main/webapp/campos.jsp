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

        <br>
        <br>

            <c:if test="${not empty requestScope.conditional}" >
                <p> Campos condicionales: <input type="checkbox" name="conditional" value="on" readonly> <input type="number" name="condnumcampos" value="<c:out value="${param.condnumcampos}"/>" readonly> </p>


                <c:forEach var="i" begin="1" end="${param.condnumcampos}" step="1" varStatus ="status">


        
            

                    <select name="campoc<c:out value="${i}"/>">
                        <c:forEach items="${campos}" var="campo" varStatus="loop">
                        <option value="${loop.index}">
                        <c:out value="${campo}"/>
                        </option>
                        </c:forEach>
                    </select>
        
                    <input type="text" name="respuestac<c:out value="${i}"/>"/>
        
                    <br>
        
                </c:forEach>


            </c:if>

            <br>
            <br>
            <input type = "submit" value = "Ir a los resultados" />
         </form>



</body>
</html>