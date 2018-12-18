<?php
include('conexion.php');
$duser = $_POST['NomUser'];
$pass = $_POST['Contraseña'];
$demail = $_POST['Correo'];
$genm = $_POST['Genero'];
$sentencia = "INSERT INTO `Usuario` (`NomUser`, `Contrasena`, `Correo`, `Genero`) VALUES ('$duser', '$pass', '$demail', '$genm')";
$resultado = $mysql ->query($sentencia);
if ($resultado = true) {
	echo "registrado correctamente";
	header("refresh: 1; url = index.html");
}
		else {
		echo "ups algo salío mal";
		header("Location: registro.html");
	}
?>