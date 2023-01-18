
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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%
Date dNow = new Date();
SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy");
String currentDate = ft.format(dNow);
%>
<br/>
<br/>
<br/>
<br/>

<div class="navbar fixed-bottom" id="estilosabajo">
	<footer class="container">
		<p class="float-end">
			<a href="#">Ir arriba</a> <img id="naruto">
		</p>

		<p class="text-end">
			
		 <%=currentDate%> 
		</p>

	</footer>




	<script type="text/javascript">
		$(document)
				.ready(
						function() {
							$('#estilosabajo')
									.css(
											{
												"background-image" : "url('https://i.pinimg.com/originals/ee/f6/a4/eef6a46e97fc7428ad471c2e02bdb2da.gif')"
											}).css({
										"background-size" : "contain"
									}).css({
										"background-repeat" : "no-repeat"
									}).css({
										"background-position" : "center"
									});

						});
	</script>



</div>
