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

	<form action="ServletGuardarCambiosUsuario" method="post">
		nombre: <input type="text" name="campoNombre" value="${usuarioAeditar.nombre}"/><br /> 
		calle: <input type="text" name="campoCalle" value="${usuarioAeditar.calle}" /><br /> 
		numeracion: <input type="text" name="campoNumeracion" value="${usuarioAeditar.numeracion}" /><br />
		codigo postal: <input type="text" name="campoCodigo_postal" value="${usuarioAeditar.codigo_postal}" /><br />
		poblacion: <input type="text" name="campoPoblacion" value="${usuarioAeditar.poblacion}" /><br />
		telefono: <input type="text" name="campoTelefono" value="${usuarioAeditar.telefono}" /><br />
		email: <input type="text" name="campoEmail" value="${usuarioAeditar.email}" /><br />
		particular o empresa: <input type="text" name="campoParticularoempresa" value="${usuarioAeditar.particularoempresa}" /><br />
		 
		 <input type="hidden" name="campoId" value="${ usuarioAeditar.id }"/>
		 
		 <input type="submit" value="Guardar Cambios" />


	</form>


</body>
</html>