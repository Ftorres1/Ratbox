<!doctype html>
<html lang="es">

<head>
	<title>RatyBox</title>
	<meta charset="utf-8">
	<link rel="stylesheet" type="text/css" href="estilo.css">
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="plu.js"></script>
	<script>
   		$(document).ready(Principal);
		function Principal(){
			$("#Info").click(mostrarInf);
			$("#desc").click(mostrardesc);
			$("#pyr1").click(mostrarpyr);
			$("#btn1").click(MoverReg);
			$("#img").animar();
			
		}
		function mostrarInf(){
			$("#InfoP").toggle("slow");
		}
		function mostrardesc(){
			$("#ADesc").toggle("slow");
			$("#ADesc").animate({fontSize: '70px'}, "slow");
		}
		function mostrarpyr(){
			$("#pyr").toggle("slow");
		}
		function MoverReg(){
			$("#regylog").fadeOut("slow");
			$("#regylog").css({"background-color" : "#3A7999", "font-size": "200%"});
			$("#regylog").fadeIn("slow");
		}
	</script>
</head>
<body>
<header class="sansserif">
<nav id="navegador">
  <ul >
    <li><a href="#" id="Info">¿Que es Ratybox?</a></li>
    <li><a href="#" id="desc">Descargas</a></li>
    <li><a href="#" id="pyr1">Preguntas Frecuentes</a></li>
    <li><a href="formprincipal.php">Comentarios</a></li>
	
  </ul>
</nav>
</header>

	<h1 class="sansserif" >RatyBox </h1>
	<img id="img" src=unnamed.jpg width="300px" height="300px">
	<p id="p2"><ul id="reg">
		<div id="regylog">
	<p>
	<?php
	session_start();
	echo "Bienvenido: ".$_SESSION['user'];
	?>
	<br>
	 <a href="cerrarSesion.php">    Cerrar Sesión</a>
	</p>
     <li>
       <a href="registro.html">Registrate</a>      
     </li>
	 <li>
	  <a href="login.html">Inicia Sesión</a> 	  
	 </li></p> 
	  <button id="btn1">No ves donde registrarte o iniciar sesión?</button>
	</div>
	 <div style="display: none;" id="InfoP">
	<hr color="#1D8348">
	<p>
		Bienvenido a la página web de RatyBox una aplicación para dispositivos android que te ayudará con los títulos de videojuegos preferidos (siempre y cuando esté en nuestro repertorio)
	</p>
	<p>
		Con RatyBox podrás tener guias, trucos, consejos y más. Ya basta de páginas web, tendras todo lo que necesitas en una aplicación para tus videojuegos en tu computadora, con las noticias más relevantes y constantes actualizaciones para que puedan disfrutar al máximo.
	</p>
	</hr>
	</div>
    <div id="ADesc" style="display: none;">
    	<a href="http://pillan.inf.uct.cl/~mgonzalez/InfoJuegos/Fallout3/Ratybox.apk
" >Descarga Aqui</a>
    </div>
    <div id="pyr" style="display: none;">

    	<p>¿Es necesario pagar para acceder a la información?</p>
    	<p>R: No, Está aplicacción es completamente gratuita</p>
    </div>
   
</body>
</html>