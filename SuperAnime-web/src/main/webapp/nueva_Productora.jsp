<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		max-Width : 378px !IMPORTANT;
		}
	
	
	
	</style>
</head>

<body>





	<%@ include file="navar.jsp"%>
	
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
        			<%
        			
					Productora p = (Productora) request.getAttribute("productora");
					
					ProductoraDaoImpl dao = null;
					dao = ProductoraDaoImpl.getInstance();
					%>
	<div class="py-5 text-center container">

		<div class="container">
			<div class="row">
				<div class="col">
					<h1>Productora</h1>
					
				</div>


			</div>
			<div class="d-flex  justify-content-sm-center">
				<form action="crearProductora" id="formulario" method="post">


					<div class="row row-col align-items-center justify-content-center" id="center">
						<div class=" row">


						
		
				
						
							<div class="row g-3 align-items-center">
						<div class="col-auto">
									<label for="inputPassword6" class="col-form-label">Nombre</label>
								</div>
								<div class="col-auto">
									<input type="text" id="nombre" placeholder="15 caracteres max" maxlength="20" name="nombre" class="form-control"
										aria-describedby="nombre" value="">
									
									
								</div>
								
								
							
							
							</div>
							<div class="row g-3 align-items-center">
									<div class="col-auto">
									<label for="inputPassword6" class="col-form-label">Descripcion</label>
								</div>
								<div class="col-auto">
									<textarea name="descripcion" ></textarea>
								</div>
							
							
							</div>
						
						
						</div>
					</div>
					
					
					
					
					
		
			<br />
			<div>
			
			<form action="listaProductoras">
				<button class="btn btn-secondary" type="submit">Cancelar</button>
			</form>
			<button class="btn btn-primary" type="submit">Aceptar</button>
			</form>
		</div>
	</div>
	</div>



	</div>

	<script type="text/javascript">
		function myFunction() {
			let txt = document.getElementById("formulario").style.maxWidth = "378px" !IMPORTANT;
			
			txt.style.maxWidth = "378px";
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