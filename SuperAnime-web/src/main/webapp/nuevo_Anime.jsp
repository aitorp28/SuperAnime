<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
	<%@ page import="com.superanime.modelo.entity.Anime"%>
	<%@ page import="com.superanime.modelo.entity.Productora"%>
	<%@ page import="com.superanime.modelo.dao.ProductoraDaoImpl"%>
	<%@ page import="java.util.List"%>
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
	<style>
		#formulario{
		max-Width : 660px !IMPORTANT;
		}
	
	
	
	</style>
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

		<div class="container">
			<div class="row">
				<div class="col">
					<h1>Anime</h1>
				</div>


			</div>
			<div class="d-flex  justify-content-sm-center">
				<form action="crearAnime" id="formulario">


					<div class="row row-col align-items-center justify-content-center" id="center">
						<div class=" row">


							<!-- 
					Nombre <input type="text" width=" !IMPORTANT 20px"> Genero
					<input type="text"> Episodios <input type="text">

					Productora <input type="text"> Sinopsis
					<textarea></textarea> -->
					<%
					Anime a = (Anime) request.getAttribute("anime");
					
					ProductoraDaoImpl dao = null;
					dao = ProductoraDaoImpl.getInstance();
					%>
				
					
							<div class="row g-3 align-items-center">
								<div class="col-auto">
									<label for="inputNombre" pattern="^[\s\S]{0,25}$" class="col-form-label">Nombre</label>
								</div>
								<div class="col-auto">
									<input type="text" id="nombre" placeholder="25 caracteres max" pattern="[a-zA-Z]{1,25}" name="nombre" class="form-control"
										aria-describedby="nombre" value="">
									
									
								</div>

								<div class="col-auto">
									<label for="inputGenero" class="col-form-label">Genero</label>
								</div>
								<div class="col-auto">
									<input type="text" id="genero" placeholder="25 caracteres max" pattern="[a-zA-Z]{1,25}" name="genero" class="form-control"
										aria-describedby="genero" value="">
								</div>
							</div>
							<div class="row g-3 align-items-center">
								<div class="col-auto">
									<label for="inputEpisodio" class="col-form-label">Episodios</label>
								</div>
								<div class="col-auto">
									<input type="text" id="episodios" placeholder="4 caracteres max" pattern="[0-9]{1,4}" class="form-control" name="episodios" 
										aria-describedby="passwordHelpInline" value="">
								</div>
								<div class="col-auto">
									<label for="inputProductora" class="col-form-label">Productora</label>
								</div>
								<div class="col-auto">
								<div>
								<%
								
									List<Productora> productora = dao.listAllProductoras();
 									out.println("<select name='productora'>");
											for (Productora pa : productora){
												
													%>
													 <option value="<%=pa.getId()%>" ><%= pa.getNombre()%></option>
													<%
												
												
												
											}
								
											%>
								
								</div>
								
									 <input type="productora" id="productora" class="form-control d-none" name="productora"
										aria-describedby="passwordHelpInline" value=""> 
								</div>
							</div>
							<div class="row g-3 align-items-center">
								<div class="col-auto">
									<label for="inputPassword6" class="col-form-label">Sinopsis</label>
								</div>
								<div class="col-auto">
									<textarea name="sinopsis"></textarea>
								</div>
							</div>
						
						</div>
					</div>
					</form>
			
			
			<br />
			<div>
			
			<form action="listaAnimes"></form>
				<button class="btn btn-secondary" onclick="volver" type="submit">Cancelar</button>
			
			<button class="btn btn-primary" onclick="crearAnime()" type="submit">Aceptar</button>
			
		</div>
</div>
	</div>

<script type="text/javascript">

	function crearAnime() {
		 document.crearAnime.submit()
	}

	function volver() {
		 document.listaAnimes.submit()
	}
	
	function verInicio() {
		 document.verinicio.submit()
	}

</script>

	</div>

	<script type="text/javascript">
		function myFunction() {
			let txt = document.getElementById("formulario").style.maxWidth = "660px" !IMPORTANT;
			
			txt.style.maxWidth = "660px";
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