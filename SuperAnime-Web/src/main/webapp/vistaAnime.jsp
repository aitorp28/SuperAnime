
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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


<%@ include file = "navar.jsp" %>
<div class="container">
<div class="justify-content-center">
	 <hr class="featurette-divider">
            <div class="row-cols-auto">
            <br/>
            <div class="row">
            
            <div class="col-md-4 order-md-1">
           
         
            
                    <svg class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto" width="500" height="500" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: 500x500" preserveAspectRatio="xMidYMid slice" focusable="false">
                        <title>Placeholder</title>
                        <rect width="100%" height="100%" fill="#eee" /><text x="50%" y="50%" fill="#aaa" dy=".3em">500x500</text>
                    </svg>
                </div>
                <div class="col-md-7 order-md-2">
                <div class="row">
                 <h2>Nombre del Anime</h2>
                 <div class="col-3">
            		<p>EpisodiosNUMERO<p>
            	</div>
            	 <div class="col-3">
            		<p>GeneroNUMERO<p>
            		</p>
            	</div>
            <p>Productora<span>NUMERO</span><p>
            <p>Sinopsis<span>NUMERO</span><p>
                    <h2 class="featurette-heading">Oh, sí, es tan bueno. <span class="text-muted">Míralo tú mismo.</span></h2>
                    <p class="lead">¿Otro reportaje? Por supuesto. Más contenido de marcador de posición aquí para darle una idea de cómo funcionaría este diseño con algún contenido del mundo real en su lugar.</p>
                 <div class="col-md-7 order-md-2">
                <form action = "vistaInicio" class="btn btn-secondary" >
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
