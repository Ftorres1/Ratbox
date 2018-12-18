<?php
	$mysql = new mysqli("db.inf.uct.cl","elobos","elobos6252","elobos");
	if (!$mysql) {
		echo "Error en la conexion".mysql_error(); 
		exit();
	}
?>