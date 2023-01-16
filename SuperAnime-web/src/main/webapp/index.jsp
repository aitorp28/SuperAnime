<%@ page import="com.superanime.modelo.dao.AnimeDaoImpl"%>
<%@ page import="com.superanime.modelo.entity.Usuario"%>
<%@ page import="com.superanime.modelo.entity.Anime"%>
<%@ page import="java.util.ArrayList"%>

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
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    
    <style>
    
    	#paraVosotros{
		/* background-image: url("https://images3.alphacoders.com/117/1178785.jpg"); */
		background-position-y: top;
		background-position-x: center;
		 background-size: 740px;
		  background-attachment: fixed;
		    background-repeat: no-repeat;
	}
    	#naruto{
		background-image: url("https://giffiles.alphacoders.com/121/12161.gif");
		
		   max-height: 50px;
		 
	}
	
	
	
	#icono{
	 width:195px;
    height:191px;
    border-radius:100px;
	
	}
	
	
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
       

        
         
         
    </header>
     
    <%@ include file = "navar.jsp" %> 
     	<%
	AnimeDaoImpl dao = null;
	dao = AnimeDaoImpl.getInstance();
	Usuario u = (Usuario) session.getAttribute("usuario");
	Anime a = null;
	ArrayList<Anime> animes = new ArrayList<>();
	%>
     
	<!-- ESTE APARTADO SE INTRODUCEN LOS SEGEMENTOS EN EL BODY -->
	 <main>
        <section class="py-5 text-center container" id="paraVosotros">
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        <!-- Fin p�ra -->
            <div class="row py-lg-5" >
                <div class="col-lg-6 col-md-8 mx-auto">
                    <h1 class="fw-light">SUPERANIME</h1>
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
           <%
           
           
           animes = dao.listAllAnimesCliente();
           if(animes.size()!= 0){
       	for (int i = 0; i < animes.size(); i++) {
       		Anime anime = animes.get(i);
           %>
                <div class="col-md-3  col-md-offset-1">
                    
                       <!-- <img src="   https://cdn-icons-png.flaticon.com/128/1647/1647125.png " >  -->
                       <img id="icono"src="   https://c.tenor.com/T6UiVl0G2lsAAAAC/tenor.gif" > 
                    
                    <h2><%=anime.getNombre() %></h2>
                    
                    <p>Episodios: <%=anime.getEpisodios() %> <br/>Sinopsis: <%=anime.getSinopsis() %></p>
                    <p></p>
                   <form action = "verAnime" >
                   <%out.println("<input  name='id' class='d-none' value=" + anime.getId() + ">"); %>
                 <button class="btn btn-info" type="submit">Ver detalles</button>
                    </form>
                  
                </div>
                
                <%
       	}
           }else{
        	   
         
                %>  
                <img src="https://giffiles.alphacoders.com/350/35046.gif">
        <% } %>
                 </div>
            
            </div>
<%


%>

		
            </div>
           </main> 
           

	


      
 

		   <div class="container marketing">
</div>

 
<script>
               $( document ).ready(function(){
                    let images = [
                         "https://images3.alphacoders.com/117/1178785.jpg",
                         "https://giffiles.alphacoders.com/121/12161.gif",
                         "image 3",
                    ];
                    var i = 0;
                    window.setInterval(function(){
                         /* $('#paraVosotros'). css({"background-image": "url(" + images[i]+ ")"}).animate({"opacity": "0"}, "slow"); */
                         $('#paraVosotros'). css({"background-image": "url(" + images[i]+ ")"}).animate({opacity: "show"  });
                         i = (i==images.length-1) ? 0 : i+1;
                    }, 5000);
               });
          </script>



<%@ include file = "footer.jsp" %>
       </body>
<!-- CSS only -->


</html>
