<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

</head>
<body>





	<%@ include file="navar.jsp"%>
	<br>
	<!-- 	 <section class="py-5 text-center container">
            <div class="row py-lg-5">
                <div class="col-lg-6 col-md-8 mx-auto">
                    <h1 class="fw-light">Album example</h1>
                    <p class="lead text-muted">Something short and leading about the collection below—its contents, the creator, etc. Make it short and sweet, but not too short so folks don’t simply skip over it entirely.</p>
                    <p>
                        <a href="#" class="btn btn-primary my-2">Main call to action</a>
                        <a href="#" class="btn btn-secondary my-2">Secondary action</a>
                    </p>
                </div>
            </div>
        </section> -->
	<div class="py-5 text-center container">





		<h1>SUPER ANIME</h1>
		<br />
		<form  action="login" method="POST" onsubmit="comprobar()" id="formulario">
			<div class="form-row justify-content-center">
				<div class="col-lg-6 col-md-8 mx-auto">
					<div class="row">
						<div class="col-md-3">


							<label for="email" class="form-label">Email</label>
						</div>
						<div class="col-md-8">
							<input type="email" name="email" id="email">
						</div>
					</div>
				</div>
			</div>

			<br />
			<div class="form-row justify-content-center">
				<div class="col-lg-6 col-md-8 mx-auto">
					<div class="row">
						<div class="col-md-3">


							<label for="password" class="form-label">Password</label>
						</div>
						<div class="col-md-8">
							<input type="password" name="password" id="password">
						</div>
					</div>
				</div>
			</div>


			<br />

			<div class="form-row justify-content-center">
				<div class="col-lg-6 col-md-8 mx-auto">
					<div class="row">
						<div class="col-md-7">


							<!--  <form action = "vistaInicio" class="btn " id="formulario"> -->
							<button class="btn btn-secondary" type="submit">VOLVER</button>
							<!--      </form>   -->
						</div>
						<div class="col-md-2">
							<!-- <form action = "vistaInicio" class="btn " id="formulario"> -->
							<button class="btn btn-primary"  id="aceptar"  type="submit" >ACEPTAR</button>
							<!--      </form>   -->
						</div>
					</div>
				</div>
			</div>


		</form>



	</div>

 	<script >
		/* document.addEventListener("DOMContentLoaded", function() {
			document.getElementById("formulario").addEventListener('submit',
					validarFormulario);
		}); */
		function comprobar() {
			/* document.getElementById("aceptar").style.color = "red"; */
	 	/*  	evento.preventDefault(); */
			var empt = document.forms["formulario"]["email"].value;
			if (empt == "")
			{
			alert("Please input a Value");
			return false;
			}
			else 
			{
			/* alert('Code has accepted : you can try another'); */
			
			}
				

	/* 		if (usuario.length == 0) {
				alert('No has escrito nada en el usuario');
				return;
			}
			var clave = document.getElementById('password').value;
			if (clave.length < 6) {
				alert('La clave no es válida');
				return;
			} */

			this.submit();

		}
	</script> 



	<%@ include file="footer.jsp"%>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
		integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
		integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
		crossorigin="anonymous"></script>

</body>
</html>