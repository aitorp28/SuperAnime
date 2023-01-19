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
#formulario {
	max-Width: 660px !IMPORTANT;
}
</style>
</head>

<body>





	<%@ include file="navar.jsp"%>


	<div class="py-5 text-center container">

		<div class="container">
			<div class="row">
				<div class="col">
					<h1>Anime</h1>
				</div>


			</div>
			<div class="d-flex  justify-content-sm-center">
				<form action="actualizarAnime" id="formulario">


					<div class="row row-col align-items-center justify-content-center"
						id="center">
						<div class=" row">



							<%
							Anime a = (Anime) request.getAttribute("anime");

							ProductoraDaoImpl dao = null;
							dao = ProductoraDaoImpl.getInstance();
							%>

							<input type="text" id="id" name="id" class="form-control d-none"
								aria-describedby="nombre" value="<%=a.getId()%>">
							<div class="row g-3 align-items-center">
								<div class="col-auto">
									<label for="inputPassword6" class="col-form-label">Nombre</label>
								</div>
								<div class="col-auto">
									<input type="text" id="nombre" readonly="true" name="nombre"
										class="form-control" aria-describedby="nombre"
										value="<%=a.getNombre()%>">


								</div>

								<div class="col-auto">
									<label for="inputPassword6" class="col-form-label">Genero</label>
								</div>
								<div class="col-auto">
									<input type="text" id="genero" name="genero"
										class="form-control" aria-describedby="genero"
										value="<%=a.getGeneros()%>">
								</div>
							</div>
							<div class="row g-3 align-items-center">
								<div class="col-auto">
									<label for="inputPassword6" class="col-form-label">Episodios</label>
								</div>
								<div class="col-auto">
									<input type="text" id="episodios" class="form-control"
										name="episodios" aria-describedby="passwordHelpInline"
										value="<%=a.getEpisodios()%>">
								</div>
								<div class="col-auto">
									<label for="inputPassword6" class="col-form-label">Productora</label>
								</div>
								<div class="col-auto">
									<div>
										<%
										List<Productora> productora = dao.listAllProductoras();
										out.println("<select name='productora'>");
										for (Productora pa : productora) {
											if (pa.getId() == a.getProductora().getId()) {
										%>
										<option value="<%=pa.getId()%>" selected><%=pa.getNombre()%></option>
										<%
										} else {
										%>
										<option value="<%=pa.getId()%>"><%=pa.getNombre()%></option>
										<%
										}
										}
										%>

									</div>

									<input type="productora" id="productora"
										class="form-control  form-select-lg d-none" name="productora"
										aria-describedby="passwordHelpInline"
										value="<%=a.getProductora().getNombre()%>">
								</div>
							</div>
							<div class="row g-3 align-items-center">
								<div class="col-auto">
									<label for="inputPassword6" class="col-form-label">Sinopsis</label>
								</div>
								<div class="col-auto">
									<textarea name="sinopsis"><%=a.getSinopsis()%></textarea>
								</div>
							</div>

						</div>
					</div>
			</div>
			<br />
			<div>

				<form action="listaAnimes">
					<button class="btn btn-secondary" type="submit">Cancelar</button>
				</form>
				<button class="btn btn-primary" type="submit">Aceptar</button>
				</form>
			</div>

		</div>



	</div>

	<script type="text/javascript">
		function myFunction() {
			let txt = document.getElementById("formulario").style.maxWidth = "660px"
			!IMPORTANT;

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