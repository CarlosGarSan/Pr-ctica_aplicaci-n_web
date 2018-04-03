<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>

	<form action="ServletGuardarCambiosArticulo" method="post">
		talla: <input type="text" name="campoTalla" value="${articuloAeditar.talla}"/><br /> 
		genero: <input type="text" name="campoGenero" value="${articuloAeditar.genero}" /><br /> 
		color: <input type="text" name="campoColor" value="${articuloAeditar.color}" /><br />
		codigo: <input type="text" name="campoCodigo" value="${articuloAeditar.codigo}" /><br />
		moda: <input type="text" name="campoModa" value="${articuloAeditar.moda}" /><br />
		provedor: <input type="text" name="campoProvedor" value="${articuloAeditar.provedor}" /><br />
		procedencia: <input type="text" name="campoProcedencia" value="${articuloAeditar.procedencia}" /><br />
		
		 
		 <input type="hidden" name="campoId" value="${ articuloAeditar.id }"/>
		 
		 <input type="submit" value="Guardar Cambios" />


	</form>


</body>
</html>