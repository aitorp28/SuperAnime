<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.superanime.modelo.dao.ProductoraDaoImpl"%>
<%@ page import="com.superanime.modelo.entity.Usuario"%>
<%@ page import="com.superanime.modelo.entity.Productora"%>
<%@ page import="java.util.List"%>
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
	ProductoraDaoImpl dao = null;
	dao = ProductoraDaoImpl.getInstance();
	Usuario u = (Usuario) session.getAttribute("usuario");
	%>
	<div class="container">
		<div class="form-row justify-content-center">
			<div class="col-lg-6 col-lg-12 mx-auto">
				<br />
				<div class="container">
					<div class="row">

						<div class="col"></div>
						<div class="col"></div>
						<div class="col">
							<form class="d-grid gap-2 " action="nuevaProductora">

								<button class="btn btn-outline-primary" type="submit">Nueva
									Productora</button>
							</form>
						</div>
						<div class="col">
							<form class="d-flex" action="buscarProductora">
								<input class="form-control me-2" type="search"
									placeholder="Buscar" aria-label="Search" name="nombre"id="buscar">
								<button class="btn btn-outline-success" onclick="" type="submit">Buscar</button>
							</form>
						</div>
					</div>
				</div>

				<script type="text/javascript">
					function buscar() {

						var texto = document.getElementById("buscar").text;

						return texto;
					}
				</script>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Nombre</th>
							<th scope="col">Descripcion</th>
							<th scope="col">Activo</th>

						</tr>
					</thead>
					<tbody>
						<tr>

							<%
							Productora p = null;
							
							List<Productora> productoras = null;
							if(request.getAttribute("productoras") != null){
							     productoras =(List<Productora>) request.getAttribute("productoras");
							}else{
							     productoras = dao.listAllProductoras();
							}
							
							for (int i = 0; i < productoras.size(); i++) {
							%>
							<form action="editarProductora" method="post">
								<%
								out.println("<tr>");
								Productora productora = productoras.get(i);
								out.println("<input  name='id' class='d-none' value=" + productora.getId() + ">");
								out.println("<td>" + i + "</td>");
								out.println("<td >" + "<input name='nombre' class='d-none'>" + productora.getNombre() + "</td>");
								out.println("<td>" + "<input name='descripcion' class='d-none'>" + productora.getDescripcion() + "</td>");
								out.println("<td>" + "<input name='activo' class='d-none'>" + productora.getActivo() + "</td>");

								out.println("<td><button class='btn btn-info' type='submit'>Editar</button></td>");
								%>
							</form>





							</form>

							<form action="eliminarProductora">
								<%
								out.println("<input  name='id' class='d-none' value=" + productora.getId() + ">");
								if (productora.getActivo() == 1) {
									out.println("<td><button class='btn btn-danger' type='submit'>Borrar</button></td>");
								}
								%>
							</form>
							<form action="activarProductora">
								<%
								if (productora.getActivo() == 0) {
									out.println("<input  name='id' class='d-none' value=" + productora.getId() + ">");
									out.println("<td><button class='btn btn-warning' type='submit'>Activar</button></td>");
								}
								%>
							</form>
							<%
							out.println("</tr>");
							%>

							<%
							}
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