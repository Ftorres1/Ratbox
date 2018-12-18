<?php
	include("conexion.php");

	$tabla = $mysql ->query("SELECT * FROM `comentarios`");
	echo "<table bgcolor='#FFF' border = '1'>
			<th>Usuario</th>
			<th>Correo</th>
			<th>Comentario</th>
			<th>Eliminar</th>
			<tbody>
	";
	while ($row = mysqli_fetch_array($tabla)) {
		echo "<tr>";
		echo "<td>".$row['Usuario']."</td>";
		echo "<td>".$row['Correo']."</td>";
		echo "<td>".$row['Comentario']."</td>";
		echo "<td><a style='cursor:pointer' onclick =' Eliminar(\"" .$row['Usuario']."\"); '>Eliminar</a></td>";
		echo "</tr>";
	}
	echo "</tbody></table>";
	?>