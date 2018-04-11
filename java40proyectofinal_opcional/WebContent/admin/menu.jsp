<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${sessionScope.admin == null}">
	<jsp:forward page="login.jsp"></jsp:forward>

</c:if>


<a href="ServletListadoUsuariosAdmin">gestionar usuarios</a>
&nbsp;
<a href="ServletListadoArticulosAdmin">gestionar articulos</a>
&nbsp;
<a href="registrarUsuario.jsp">registrar usuarios</a>
&nbsp;
<a href="registrarArticulo.jsp">registrar articulos</a>
&nbsp;

<a href="ServletLogOutAdmin">salir</a>
&nbsp;