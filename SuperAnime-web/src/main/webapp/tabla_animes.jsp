<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.superanime.modelo.dao.AnimeDaoImpl"%>
<%@ page import="com.superanime.modelo.entity.Usuario"%>
<%@ page import="com.superanime.modelo.entity.Anime"%>
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

	<%@ include file="navar.jsp"%>
	<br />
	<br />
	<%
	AnimeDaoImpl dao = null;
	dao = AnimeDaoImpl.getInstance();
	Usuario u = (Usuario) session.getAttribute("usuario");
	%>
	<div class="container">
		<div class="form-row justify-content-center">
			<div class="col-lg-6 col-lg-12 mx-auto">
				<br />
				<div class="container">
					<div class="row">

						<div class="col">
							<form class="d-grid gap-2" action="filtrarSinValidar">


								<%
								if (u.getPerfil().equals("admin")) {
								%>
								<form action="filtrarSinValidar">
								<button class="btn btn-outline-secondary" type="submit">Animes
									Sin Aceptar</button>
									</form>
								<%
								}
								%>
							</form>
						</div>
						<div class="col">
							<form class="d-grid gap-2 " action="filtrarValidados">
								<%
								if (u.getPerfil().equals("admin")) {
								%>
								<form action="filtrarValidados">
								<button class="btn btn-outline-secondary" type="submit">Animes
									General</button>
									</form>
									<%
								}
								%>
							</form>
						</div>
						<div class="col">
							<form class="d-grid gap-2 " action="nuevoAnime">

								<button class="btn btn-outline-primary" type="submit">Nuevo
									Anime</button>
							</form>
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


							<%
							if (u.getPerfil().equals("admin")) {
							%>
							<th scope="col">Validar</th>
							<%
							}
							%>









						</tr>
					</thead>
					<tbody>
						<tr>
							
								<%
								

								Anime a = null;
								ArrayList<Anime> animes = new ArrayList<>();
								if(request.getAttribute("animes") == null){
									switch (u.getPerfil()) {
									                                case "admin":
									                                    animes = dao.listAllAnimesAdmin();
									                                    break;
									                                case "user":

									                                    animes = dao.listAnimesUser(u.getId());
									                                    break;

									                                default:
									                                    animes = null;
									                                }
									}else{
									              animes =(ArrayList<Anime>) request.getAttribute("animes");
									}

								for (int i = 0; i < animes.size(); i++) {
								%>
								<form action="editarAnime">
								<% 
									out.println("<tr>");
									Anime anime = animes.get(i);
									out.println("<input  name='id' class='d-none' value=" + anime.getId() + ">");
									out.println("<td>" + i + "</td>");
									out.println("<td >"+"<input name='nombre' class='d-none'>" + anime.getNombre() + "</td>");
									out.println("<td>" +"<input name='episodios' class='d-none'>"+ anime.getEpisodios() + "</td>");
									out.println("<td>" +"<input name='generos' class='d-none'>"+ anime.getGeneros() + "</td>");
									out.println("<td>" +"<input name='nombre' class='d-none'>"+ anime.getProductora().getNombre() + "</td>");
									out.println("<td>" + "<input name='email' class='d-none'>"+anime.getUsuario().getEmail() + "</td>");
									
									/*  out.println("<td>"+anime.getValidado()+"</td>"); */
									out.println("<td><button class='btn btn-info' type='submit'>Editar</button></td>");
									if (anime.getValidado() == 0 && u.getPerfil().equals("admin")) {
										%>
									</form>	
										<form action="aceptarAnime">
										<%
										out.println("<input  name='id' class='d-none' value=" + anime.getId() + ">");
										out.println("<td><button class='btn btn-success' type='submit'>Aceptar</button></td>");
										
									}
									%>
									
									</form>
									
										<form action="eliminarAnime">
										<%
										out.println("<input  name='id' class='d-none' value=" + anime.getId() + ">");
										if(anime.getActivo()== 1){
										out.println("<td><button class='btn btn-danger' type='submit'>Borrar</button></td>");
										}
										%>
										</form>
										<form action="activarAnime">
										<%
										if(anime.getActivo()== 0){
											out.println("<input  name='id' class='d-none' value=" + anime.getId() + ">");
											out.println("<td><button class='btn btn-warning' type='submit'>Activar</button></td>");
										}
									
									%>
									</form>
									<%
									out.println("</tr>");
								
									%>
									
							<%	}
								%>
							
						</tr>
						<tr>

							<!-- 		<form action="listaAnimes">
							<td>
								<button class="btn btn-success" type="submit">Aceptar</button>
							</td>
							</form> -->
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>