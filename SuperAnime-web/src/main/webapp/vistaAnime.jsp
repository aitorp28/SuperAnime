
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.superanime.modelo.dao.AnimeDaoImpl"%>
<%@ page import="com.superanime.modelo.entity.Usuario"%>
<%@ page import="com.superanime.modelo.entity.Anime"%>

	<%@ page import="com.superanime.modelo.entity.Productora"%>
	<%@ page import="com.superanime.modelo.dao.ProductoraDaoImpl"%>
<!doctype html>
<html lang="en">
<head>
  <!-- Required meta tags -->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
   
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
   <%--   	<%
	AnimeDaoImpl dao = null;
	dao = AnimeDaoImpl.getInstance();
	Usuario u = (Usuario) session.getAttribute("usuario");
	
	%> --%>

<%@ include file = "navar.jsp" %>
<div class="container">
<div class="justify-content-center">
	 <hr class="featurette-divider">
            <div class="row-cols-auto">
            <br/>
            <div class="row">
            
            <div class="col-md-4 order-md-1">
           
         			<%
					Anime a = (Anime) request.getAttribute("anime");
					
					ProductoraDaoImpl dao = null;
					dao = ProductoraDaoImpl.getInstance();
					%>
				
            
                   <!--  <svg class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto" width="500" height="500" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: 500x500" preserveAspectRatio="xMidYMid slice" focusable="false">
                        <title>Placeholder</title>
                        <rect width="100%" height="100%" fill="#eee" /><text x="50%" y="50%" fill="#aaa" dy=".3em">500x500</text>
                    </svg> -->
                    <img src="//files.123inventatuweb.com/ed/6b/ed6b8300-19ae-451c-8c0c-8ec76de89f0d.gif">
                </div>
                <div class="col-md-7 order-md-2">
                <div class="row">
                 <h2><%=a.getNombre() %></h2>
                 <div class="col-3">
            		<p>Episodios: <%=a.getEpisodios()%><p>
            	</div>
            	 <div class="col-3">
            		<p>Genero: <%=a.getGeneros() %><p>
            		</p>
            	</div>
            <p>Productora<span>: <%=a.getProductora().getNombre() %></span><p>
          
                    <h3 class="featurette-heading">Sinopsis</h3>
                    <p class="lead">  <%=a.getSinopsis()%></p>
                 <div class="col-md-7 order-md-2">
                <form action = "vistaInicio" >
                 <button class="btn btn-secondary" type="submit">VOLVER</button>
                    </form>  
                     </div>  
                </div>
           </div>
          
              
             
                
</div>
<div class="form-row justify-content-center">
 
                    </div>
</div>
</div>
<%@ include file = "footer.jsp" %>
</body>
</html>
