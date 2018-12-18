<?php
include('conexion.php');
$duser = $_POST['vuser'];
$demail = $_POST['vemail'];
$dcomen = $_POST['vcomen'];
$sentencia = "INSERT INTO `comentarios` (`Usuario`, `Correo`, `Comentario`) VALUES ('$duser', '$demail', '$dcomen')";
$resultado = $mysql ->query($sentencia);
if ($resultado = true) {
	echo "registrado correctamente";
}
		else {
		echo "ups algo salío mal";
	}
?>