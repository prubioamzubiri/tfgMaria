<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Campos a estudiar</title>
</head>
<body>

    <form action = "/tfg/campos" method = "POST">
        Cuantos Campos Quieres estudiar?: <input type="number" name="numcampos"/>
        <input type = "submit" value = "Ir" />
     </form>

</body>
</html>