<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>
<c:forEach items="${articulos}" var="articulo">
<div style="margin: 8px">
	talla: ${articulo.talla}<br/>
	genero: ${articulo.genero}<br/>
	color: ${articulo.color}<br/>
	codigo: ${articulo.codigo}<br/>
	moda: ${articulo.moda}<br/>
	provedor: ${articulo.provedor}<br/>
	procedencia: ${articulo.procedencia}<br/>
	<img src="${producto.rutaImagen}" height="200" />
	<a href="ServletBorrarArticulo?id=${articulo.id}">Borrar</a>
	<a href="ServletEditarArticulo?id=${articulo.id}">Editar</a>
</div>


</c:forEach>


</body>
</html>