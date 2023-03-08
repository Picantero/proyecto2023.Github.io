<script>
function confirmacion() {
	var pregunta = confirm("¿Deseas abril correo?")
	if (pregunta){
		alert("Te envío allí rápidamente")
		window.location = "email://nhrobert@gmail.com/";
	}
	else{
		alert("Quizás en otro momento...\n Gracias de todas formas")
	}
}
</script>
<button type="button" onclick="confirmacion()" >Probar confirm</button>