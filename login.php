<?php
include('conexion.php');
$user=$_GET['nomb'];
$pass=$_GET['pass'];
$query="SELECT * FROM `Usuario` WHERE NomUser='$user' AND Contrasena='$pass'";
$consulta = $mysql ->query($query);
if (mysqli_num_rows($consulta) == true) {
	session_start();
	$_SESSION['user']=$user;
	header("Location: index.php");
}else{
	echo "Los datos son incorrectos";
	header("Location: login.html");
}