<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Campos a estudiar</title>
</head>
<body>

    <div id="form">

        <form action = "/tfg/campos" method = "POST">
            ¿Cuántos campos que se quiere estudiar estudiar?: <input type="number" name="numcampos" value="1"/>
    
            <br>
            <br>
    
            Estadistica condicional: <input type="checkbox" name="conditional"/>
    
            <br>
            <br>
            ¿Cuantos campos adicionales se quieren estudiar? : <input type="number" name="condnumcampos" value="0"/>
    
            <br>
            <br>
    
            <input type = "submit" value = "Ir" />
         </form>
    
        </div>
    

</body>
</html>