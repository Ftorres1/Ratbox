<?php
include('conexion.php');
	$duser = $_POST['vuser'];
	$resultado = $mysql -> query("DELETE FROM `comentarios` WHERE Usuario ='$duser'");
if ($resultado = true) {
	echo "Eliminado correctamente";
}
		else {
		echo "ups algo salío mal";
	}
?>