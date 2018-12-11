<?php
 $con = mysqli_connect("db.inf.uct.cl", "elobos", "elobos6252", "elobos");

 $NomUser = $_POST["NomUser"];
 $Contraseña = $_POST["Contraseña"];
 $Correo = $_POST["Correo"];
 $genero = $_POST["genero"];
 $statement =  "INSERT INTO Usuario (NomUser, Contrasena, Correo, Genero) VALUES ('$NomUser', '$Contraseña', 'Correo', '$genero')";

$respuesta=mysqli_query($con,$statement);
 	
 if ($con->query($statement) === TRUE) {
   		 echo "Record deleted successfully";
	} else {
		echo "Error: " . $statement . "<br>" . $con->error;
	}
 	?>