<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:if test="${ sessionScope.admin == null }">
<jsp:forward page="login.jsp"></jsp:forward>

</c:if>

<div style="color: red">${mensaje}</div>

<a href="index.jsp">volver a inicio</a><br/>
<h3>Introduzca los datos del articulo:</h3>
<form action="ServletRegistrarArticuloAdmin" method="post" onsubmit="return validarFormularioRegistroArticulo()"> 

<!-- 
onbubmit="return validarFormularioRegistroArticulo()"


 -->

talla: <input type="text" name="campoTalla"/><br/>
genero: <input type="text" name="campoGenero"/><br/>
color: <input type="text" name="campoColor"/><br/>
codigo: <input type="text" name="campoCodigo"/><br/>
moda: <input type="text" name="campoModa"/><br/>
provedor: <input type="text" name="campoProvedor"/><br/>
procedencia: <input type="text" name="campoProcedencia"/><br/>
imagen: <input type="file" name="campoImagen"/><br/>

<input type="submit" value="Aceptar"/>

</form>

<script type ="text/javascript" src="../js/validacionRegistroArticulo.js"></script>

</body>
</html>