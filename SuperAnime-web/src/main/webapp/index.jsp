<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.91.2">
    <title>Plantilla de Carousel · Bootstrap 5 en Español v5.1</title>

    <link href="/docs/5.1/dist/css/bootstrap.min.css" rel="stylesheet">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <link rel="apple-touch-icon" href="/docs/5.1/assets/img/favicons/apple-touch-icon.png" sizes="180x180">
    <link rel="icon" href="/docs/5.1/assets/img/favicons/favicon-32x32.png" sizes="32x32" type="image/png">
    <link rel="icon" href="/docs/5.1/assets/img/favicons/favicon-16x16.png" sizes="16x16" type="image/png">
    <link rel="manifest" href="/docs/5.1/assets/img/favicons/manifest.json">
    <link rel="mask-icon" href="/docs/5.1/assets/img/favicons/safari-pinned-tab.svg" color="#7952b3">
    <link rel="icon" href="/docs/5.1/assets/img/favicons/favicon.ico">
    <meta name="theme-color" content="#7952b3">
    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }

    </style>

    <link href="carousel.css" rel="stylesheet">
</head>

<body>
    <header>
       
<!--         <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Carousel</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="navbar-nav me-auto mb-2 mb-md-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Inicio</a>
                        </li>
                        <li class="nav-item">
                         <form action = "listaAnimes"  class="btn">
                			 <button class="btn" type="submit">Ver detalles</button>
                    	</form>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link disabled">Deshabilitado</a>
                        </li>
                    </ul>
                    <form action = "mainController" class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Buscar" aria-label="Buscar">
                        <button class="btn btn-outline-success" type="submit">Buscar</button>
                    </form>
                </div>
            </div>
        </nav> --> 
        
         
         
    </header>
     
    <%@ include file = "navar.jsp" %> 
     
     
	<!-- ESTE APARTADO SE INTRODUCEN LOS SEGEMENTOS EN EL BODY -->
	 <main>
        <section class="py-5 text-center container">
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
        </section>

        <div class="container">

        <div class="container marketing">

            <div class="row align-items-center">
                <div class="col-md-3">
                    <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: 140x140" preserveAspectRatio="xMidYMid slice" focusable="false">
                        <title>Placeholder</title>
                        <rect width="100%" height="100%" fill="#777" /><text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                    </svg>
                    <h2>Encabezado</h2>
                    <p>Algo de contenidoplaceholder representativo para las tres columnas de texto debajo del carrusel. Esta es la primera columna.</p>
                     <form action = "verAnime" class="btn btn-secondary" >
                 <button class="btn btn-secondary" type="submit">Ver detalles</button>
                    </form>
                </div>
                <div class="col-md-3">
                    <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: 140x140" preserveAspectRatio="xMidYMid slice" focusable="false">
                        <title>Placeholder</title>
                        <rect width="100%" height="100%" fill="#777" /><text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                    </svg>
                    <h2>Encabezado</h2>
                    <p>Otro fragmento emocionante de contenidoplaceholder representativo. Esta vez, pasamos a la segunda columna.</p>
                   <form action = "verAnime" class="btn btn-secondary" >
                 <button class="btn btn-secondary" type="submit">Ver detalles</button>
                    </form>
                  
                </div>
                    <div class="col-md-3">
                    <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: 140x140" preserveAspectRatio="xMidYMid slice" focusable="false">
                        <title>Placeholder</title>
                        <rect width="100%" height="100%" fill="#777" /><text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                    </svg>
                    <h2>Encabezado</h2>
                    <p>Otro fragmento emocionante de contenidoplaceholder representativo. Esta vez, pasamos a la segunda columna.</p>
                      <form action = "verAnime" class="btn btn-secondary" >
                 <button class="btn btn-secondary" type="submit">Ver detalles</button>
                    </form>
                </div>
                <div class="col-md-3">
                  <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: 140x140" preserveAspectRatio="xMidYMid slice" focusable="false">
                        <title>Placeholder</title>
                        <rect width="100%" height="100%" fill="#777" /><text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                    </svg>
                    <h2>Encabezado</h2>
                    <p>Otro fragmento emocionante de contenidoplaceholder representativo. Esta vez, pasamos a la segunda columna.</p>
                     <form action = "verAnime" class="btn btn-secondary" >
                 <button class="btn btn-secondary" type="submit">Ver detalles</button>
                    </form>
                </div>
                 </div>
            
            </div>


		<div class="container marketing">

            <div class="row align-items-center">
                <div class="col-md-3">
                    <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: 140x140" preserveAspectRatio="xMidYMid slice" focusable="false">
                        <title>Placeholder</title>
                        <rect width="100%" height="100%" fill="#777" /><text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                    </svg>
                    <h2>Encabezado</h2>
                    <p>Algo de contenidoplaceholder representativo para las tres columnas de texto debajo del carrusel. Esta es la primera columna.</p>
                    <p><a class="btn btn-secondary" href="#">Ver detalles &raquo;</a></p>
                </div>
                <div class="col-md-3">
                    <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: 140x140" preserveAspectRatio="xMidYMid slice" focusable="false">
                        <title>Placeholder</title>
                        <rect width="100%" height="100%" fill="#777" /><text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                    </svg>
                    <h2>Encabezado</h2>
                    <p>Otro fragmento emocionante de contenidoplaceholder representativo. Esta vez, pasamos a la segunda columna.</p>
                    <p><a class="btn btn-secondary" href="#">Ver detalles &raquo;</a></p>
                </div>
                    <div class="col-md-3">
                    <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: 140x140" preserveAspectRatio="xMidYMid slice" focusable="false">
                        <title>Placeholder</title>
                        <rect width="100%" height="100%" fill="#777" /><text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                    </svg>
                    <h2>Encabezado</h2>
                    <p>Otro fragmento emocionante de contenidoplaceholder representativo. Esta vez, pasamos a la segunda columna.</p>
                    <p><a class="btn btn-secondary" href="#">Ver detalles &raquo;</a></p>
                </div>
                <div class="col-md-3">
                  <svg class="bd-placeholder-img rounded-circle" width="140" height="140" xmlns="http://www.w3.org/2000/svg" role="img" aria-label="Placeholder: 140x140" preserveAspectRatio="xMidYMid slice" focusable="false">
                        <title>Placeholder</title>
                        <rect width="100%" height="100%" fill="#777" /><text x="50%" y="50%" fill="#777" dy=".3em">140x140</text>
                    </svg>
                    <h2>Encabezado</h2>
                    <p>Otro fragmento emocionante de contenidoplaceholder representativo. Esta vez, pasamos a la segunda columna.</p>
                    <p><a class="btn btn-secondary" href="#">Ver detalles &raquo;</a></p>
                </div>
                 </div>
             </div>
            </div>
           </main> 
           

	


      
 

		   <div class="container marketing">
</div>


<script type="text/javascript">



</script>



<%@ include file = "footer.jsp" %>
       </body>
<!-- CSS only -->


</html>
