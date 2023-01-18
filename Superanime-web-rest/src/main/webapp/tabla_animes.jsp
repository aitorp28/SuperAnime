
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<link href="/docs/5.1/dist/css/bootstrap.min.css" rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js" integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
   
	
	<br />
	<br />

	<div class="container">
		<div class="form-row justify-content-center">
			<div class="col-lg-6 col-lg-12 mx-auto">
				<br />
				<div class="container">
					<div class="row">

						<div class="col">
							<form class="d-grid gap-2" action="filtrarSinValidar">


								
								<form action="filtrarSinValidar">
								<button class="btn btn-outline-secondary" type="submit">Animes
									Sin Aceptar</button>
									</form>
								
							</form>
						</div>
						<div class="col">
							<form class="d-grid gap-2 " action="filtrarValidados">
								
								<form action="filtrarValidados">
								<button class="btn btn-outline-secondary" type="submit">Animes
									General</button>
									</form>
									
								
							
							</form>
						</div>
						<div class="col">
							
						</div>
						<div class="col">
							<form class="d-flex" action="buscarAnime">
								<input class="form-control me-2" type="search"
									placeholder="Search" aria-label="Search" name="nombre"id="buscar">
								<button class="btn btn-outline-success" onclick="" type="submit">Search</button>
							</form>
						</div>
					</div>
				</div>

<script type="text/javascript">

function buscar(){
	
	
var texto=	document.getElementById("buscar").text;
	
	

	return texto;
}


</script>
 <script src="ListaJs.js"></script>


				<table class="table">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Nombre</th>
							<th scope="col">Episodios</th>
							<th scope="col">Genero</th>
							<th scope="col">Productora</th>
							<th scope="col">Usuario</th>
							<!-- 	<th scope="col">Activo</th>  -->
							<!-- <th scope="col">Validado</th> -->
							<th scope="col">Edit</th>


						
							<th scope="col">Validar</th>
							









						</tr>
					</thead>
					<tbody id='tbody'>
					
					
						switch(lista){
 								case "Cliente":
               <script ... ref="listaCliente.js"> </script>
									}
					
					
					
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>