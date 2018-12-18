<?php
include('conexion.php');
session_start()
   // obtenemos los datos del archivo
$tamano      = $_FILES ["archivo"] ['size'];

$tipo            = $_FILES ["archivo"]['type'];

$archivo      = $_FILES ["archivo"] ['name'];

$nomTemporal = $_FILES ["archivo"] ['tmp_name'];
if ( $archivo != "" ) {

	$prefijo   =  substr(md5(uniqid(rand())),0,6);  //Para que el sistema le asigne un nombre al archivo, asi evitamos duplicados

	$NuevoNombre = $prefijo."_".$archivo;

       $destino = "imagenes/".$NuevoNombre;

       if ( copy ($nomTemporal, $destino) ) {

                  $msj = "Archivo subido: $NuevoNombre <br />

                               Tamaño: $tamano bytes<br />

                                Tipo: $tipo";   

   }

   else  $msj = "Error: puede que la carpeta esté sin permiso";

}

else $msj = "No se cargó nigún archivo";
echo $msj;
$sql = "UPDATE Usuario SET imagen='$archivo' WHERE NomUser='$_SESSION['user']'";
$resp = mysqli_query($link, $sql);
if($resp)    echo "Se grabó un registro en la BD";
else          echo "Error al guardar registro";
header("Location: perfil.php");
?>