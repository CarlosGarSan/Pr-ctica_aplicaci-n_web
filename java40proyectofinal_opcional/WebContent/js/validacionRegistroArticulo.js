function validarFormularioRegistroArticulo() {
	
	var enviarForm = true;
	// obtener lo escrito por el usuario
	var campoTalla = document.getElementsByName("campoTalla")[0];
	var talla = campoTalla.value;
	

	var campoGenero = document.getElementsByName("campoGenero")[0];
	var genero = campoGenero.value;
	

	var campoColor = document.getElementsByName("campoColor")[0];
	var color = campoColor.value;
	

	var campoCodigo = document.getElementsByName("campoCodigo")[0];
	var codigo = campoCodigo.value;


	var campoModa = document.getElementsByName("campoModa")[0];
	var moda = campoModa.value;
	

	var campoProvedor = document.getElementsByName("campoProvedor")[0];
	var provedor = campoProvedor.value;
	

	var campoProcedencia = document.getElementsByName("campoProcedencia")[0];
	var procedencia = campoProcedencia.value;
	

	// comprobar que sea correcto
	// las expresiones regulares son vitales para hacer validaciones
	// ^ desde el principio
	// $ hasta el fin
	// [a-z] letras de la a a la z
	// {3,10} de 3 a 10 elementos
	// i significa insensitive, que nos permite poner mayusculas y minusculas
	// αινσϊ para que acepte tildes
	var expresionCampoTalla = /^[xsml]{1,3}$/i;
	if (expresionCampoTalla.test(talla)) {
		alert("talla correcta");

	} else {
		alert("talla incorrecta");
		enviarForm = false;
	}

	var expresionCampoGenero = /^[a-zαινσϊρό\s]{1,20}$/i;

	if (expresionCampoGenero.test(genero)) {

		alert("genero correcto");

	} else {
		alert("genero incorrecto");
		enviarForm = false;

	}

	var expresionCampoColor = /^[a-zαινσϊρό\s]{1,20}$/i;
	if (expresionCampoColor.test(color)) {
		alert("color correcto");

	} else {
		alert("color incorrecto");
		enviarForm = false;

	}
	// devolver true si todo esta bien y false si algo esta mal


	var expresionCampoCodigo = /^[0-9]{1,5}$/;

	if (expresionCampoCodigo.test(codigo)) {

		alert("codigo correcto");

	} else {
		alert("codigo incorrecto");
		enviarForm = false;

	}

	var expresionCampoModa = /^[a-zαινσϊρό\s]{1,20}$/i;

	if (expresionCampoModa.test(moda)) {

		alert("moda correcto");

	} else {
		alert("moda incorrecto");
		enviarForm = false;

	}

	var expresionCampoProvedor = /^[a-zαινσϊρό\s]{1,20}$/i;

	if (expresionCampoProvedor.test(provedor)) {

		alert("provedor correcto");

	} else {
		alert("provedor incorrecto");
		enviarForm = false;

	}

	var expresionCampoProcedencia = /^[a-zαινσϊρ\s]{1,20}$/i;

	if (expresionCampoProcedencia.test(procedencia)) {

		alert("procedencia correcta");

	} else {
		alert("procedencia incorrecta");
		enviarForm = false;

	}

	return enviarForm;

}// end function
