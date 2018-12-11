function forminsertar (){
	var parametros = {};

	$.ajax({
		data: parametros,
		url: "forminsertar.php",
		type: "POST",
		beforeSend: function(){
			$("#ventana").html("procesando...");
		},
		success: function(vista){
			$("#ventana").html(vista);
		}

	});
}
function datoslistar (){
	var parametros = {};

	$.ajax({
		data: parametros,
		url: "datoslistar.php",
		type: "POST",
		beforeSend: function(){
			$("#ventana").html("procesando...");
		},
		success: function(vista){
			$("#ventana").html(vista);
		}

	});
}
function insertarcomentario (){
	var parametros = {
		"vuser": $("#Usuario").val(),
		"vemail": $("#Correo").val(),
		"vcomen": $("#Comentario").val(),
	};

	$.ajax({
		data: parametros,
		url: "datosinsert.php",
		type: "POST",
		beforeSend: function(){
			$("#ventana").html("procesando...");
		},
		success: function(vista){
			$("#ventana").html(vista);
		}

	});
}
function Eliminar(user){
	var parametros = {
		"vuser": user,
	};

	$.ajax({
		data: parametros,
		url: "datoseliminar.php",
		type: "POST",
		beforeSend: function(){
			$("#ventana").html("Procesando...");
		},
		success: function(vista){
			$("#ventana").html(vista);
		}


	});

}