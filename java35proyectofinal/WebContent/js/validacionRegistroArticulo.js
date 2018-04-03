function validarFormularioRegistroArticulo() {
	alert("se ejecuta la funcion");
	var enviarForm = true;
	// obtener lo escrito por el usuario
	var campoTalla = document.getElementsByName("campoTalla")[0];
	var talla = campoTalla.value;
	alert("voy a validar: " + talla);

	var campoGenero = document.getElementsByName("campoGenero")[0];
	var genero = campoGenero.value;
	alert("voy a validar: " + genero);

	var campoColor = document.getElementsByName("campoColor")[0];
	var color = campoColor.value;
	alert("voy a validar: " + color);

	var campoCodigo = document.getElementsByName("campoCodigo")[0];
	var codigo = campoCodigo.value;
	alert("voy a validar: " + codigo);

	var campoModa = document.getElementsByName("campoModa")[0];
	var moda = campoModa.value;
	alert("voy a validar: " + moda);

	var campoProvedor = document.getElementsByName("campoProvedor")[0];
	var provedor = campoProvedor.value;
	alert("voy a validar: " + provedor);

	var campoProcedencia = document.getElementsByName("campoProcedencia")[0];
	var procedencia = campoProcedencia.value;
	alert("voy a validar: " + procedencia);

	// comprobar que sea correcto
	// las expresiones regulares son vitales para hacer validaciones
	// ^ desde el principio
	// $ hasta el fin
	// [a-z] letras de la a a la z
	// {3,10} de 3 a 10 elementos
	// i significa insensitive, que nos permite poner mayusculas y minusculas
	// αινσϊ para que acepte tildes
	var expresionCampoTalla = /^[a-zαινσϊρ\s]{1,3}$/i;
	if (expresionCampoTalla.test(talla)) {
		alert("talla correcta");

	} else {
		alert("talla incorrecta");
		enviarForm = false;
	}

	var expresionCampoGenero = /^[0-9]{1,8}[.,]{1}[0-9]{0,2}$/;

	if (expresionCampoGenero.test(genero)) {

		alert("genero correcto");

	} else {
		alert("genero incorrecto");
		enviarForm = false;

	}

	var expresionCampocolor = /^[a-zαινσϊρ\s]{10,150}$/i;
	if (expresionCampoColor.test(color)) {
		alert("color correcto");

	} else {
		alert("color incorrecto");
		enviarForm = false;

	}
	// devolver true si todo esta bien y false si algo esta mal

	var expresionCampogenero = /^[0-9]{1,8}[.,]{1}[0-9]{0,2}$/;

	if (expresiongenero.test(genero)) {

		alert("genero ok");

	} else {
		alert("genero incorrecto");
		enviarForm = false;

	}

	var expresionCampoCodigo = /^[0-9]{1,8}[.,]{1}[0-9]{0,2}$/;

	if (expresionCampoCodigo.test(codigo)) {

		alert("codigo correcto");

	} else {
		alert("codigo incorrecto");
		enviarForm = false;

	}

	var expresionCampoModa = /^[0-9]{1,8}[.,]{1}[0-9]{0,2}$/;

	if (expresionCampoModa.test(moda)) {

		alert("moda correcto");

	} else {
		alert("moda incorrecto");
		enviarForm = false;

	}

	var expresionCampoprovedor = /^[0-9]{1,8}[.,]{1}[0-9]{0,2}$/;

	if (expresionCampoProvedor.test(provedor)) {

		alert("provedor correcto");

	} else {
		alert("provedor incorrecto");
		enviarForm = false;

	}

	var expresionCampoProcedencia = /^[0-9]{1,8}[.,]{1}[0-9]{0,2}$/;

	if (expresionCampoProcedencia.test(procedencia)) {

		alert("procedencia correcta");

	} else {
		alert("procedencia incorrecta");
		enviarForm = false;

	}

	return enviarForm;

}// end function
