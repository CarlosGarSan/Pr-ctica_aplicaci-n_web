<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href="index.jsp">volver a inicio</a><br/>
<h3>Introduzca los datos del usuario:</h3>
<form action="ServletRegistrarUsuarioAdmin" method="post">

nombre: <input type="text" name="campoNombre"/><br/>
calle: <input type="text" name="campoCalle"/><br/>
numeracion: <input type="text" name="campoNumeracion"/><br/>
codigo postal: <input type="text" name="campoCodigo_postal"/><br/>
poblacion: <input type="text" name="campoPoblacion"/><br/>
telefono: <input type="text" name="campoTelefono"/><br/>
email: <input type="text" name="campoEmail"/><br/>
particularoempresa: <input type="text" name="campoParticularoempresa"/><br/>

<input type="submit" value="Aceptar"/>

</form>

</body>
</html>