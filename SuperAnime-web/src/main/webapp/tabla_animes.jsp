<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

	<%@ include file="navar.jsp"%>
	<br />
	<br />
	<div class="container">
		<div class="form-row justify-content-center">
			<div class="col-lg-6 col-lg-12 mx-auto">
				<br />
				<div class="container">
					<div class="row">
					
						<div class="col">
							<form class="d-grid gap-2">
							
								<button class="btn btn-outline-secondary" type="submit">Animes Sin Aceptar</button>
							</form>
						</div>
						<div class="col">
							<form class="d-grid gap-2 ">
							
								<button class="btn btn-outline-secondary" type="submit">Animes General</button>
							</form>
						</div>
								<div class="col">
							<form class="d-grid gap-2 ">
							
								<button class="btn btn-outline-primary" type="submit">Nuevo Anime</button>
							</form>
						</div>
						<div class="col">
							<form class="d-flex">
								<input class="form-control me-2" type="search"
									placeholder="Search" aria-label="Search">
								<button class="btn btn-outline-success" type="submit">Search</button>
							</form>
						</div>
					</div>
				</div>





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
							<th scope="col">Validado</th>
							<th scope="col">Edit</th>
							<th scope="col">Validar</th>
						</tr>
					</thead>
					<tbody>
						<%
						/* 	PathfinderDaoImp dao=new PathfinderDaoImp();	
								
							List<Personaje> personaje =dao.ListPersonajes(); */

						int numeracion = 1;
						/* 			  for(int i=0; i < personaje.size();i++){
								  out.println("<tr>"); 
								  Personaje per=personaje.get(i);
								  out.println("<td>"+numeracion+"</td>");
								  out.println("<td>"+per.getNombre()+"</td>");
								  out.println("<td>"+per.getRaza().getNombre()+"</td>");
								  out.println("<td>"+per.getNivel()+"</td>");
								  out.println("<td>"+per.getClase()+"</td>");
								  out.println("<td>"+per.getUser().getNombre()+"</td>");			
								  numeracion ++;
								  out.println("</tr>"); 
							}*/
						%>
						<tr>
							<form action="editarAnime">
							<td>1</td>
							<td>Mirai Nikki</td>
							<td>26</td>
							<td>Puta loca</td>
							<td>SU PUTA MADRE</td>
							<td>Mi ex</td>
							<!--    <td>por suer no</td>-->
							<td>NO</td>
							<td>
								<button class="btn btn-info" type="submit">Editar</button>
							</td>

							</form>
							<form action="listaAnimes">
							<td>
								<button class="btn btn-success" type="submit">Aceptar</button>
							</td>
							</form>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>