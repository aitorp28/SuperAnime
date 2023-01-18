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
	
	
	
	 .icono{
	 width:195px;
    height:191px;
    border-radius:100px;
    background-repeat:no-repeat; 
    background-size: contain !IMPORTANT;
	 -webkit-text-fill-color: transparent;
	 margin-top: 1em;
	}
	
		/* #container {  width:195px;
    height:191px;
    border-radius:100px; } */
	
	
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
	
	
	#transparencia{
	
	background-color: rgb(254 239 195 / 87%);

	
	}
	#emboss-txt {
  position: relative;
  /* font-size: 180px; */
  font-family: dock11;
  letter-spacing: 5px;
  color:rgb(207,207,207);
  
  	 text-shadow: 
  /*3D layers*/
  0px 0px 1px rgb(167,167,167),
  0px 1px 1px rgb(167,167,167),
  0px 2px 1px rgb(167,167,167),

  1px 1px 1px rgb(167,167,167),
  1px 2px 1px rgb(167,167,167),
  1px 3px 1px rgb(167,167,167),

  2px 2px 1px rgb(167,167,167),
  2px 3px 1px rgb(167,167,167),
  2px 4px 1px rgb(167,167,167),
  
  /*long soft bottom*/
1px 10px 30px rgba(0,0,0,0.8),
1px 10px 70px rgba(0,0,0,0.8),

/*short soft bottom*/
0px 5px 5px rgba(0,0,0,0.8),

/*left shadow*/
-5px 5px 20px rgba(0,0,0,0.8),
/*right shadow*/
5px 5px 20px rgba(0,0,0,0.8),
1px 1px 120px rgba(255,255,255,0.5);
  position: relative;
  
}
}

#emboss-txt::after {
  /* content: "SUPER ANIME"; */
  /* font-size: 180px; */
  letter-spacing: 5px;
  font-family: dock11;
  position: absolute;
  top:0;
  left:0;
   text-shadow: 0px 0px 100px rgba(11,124,199,0.5);
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
             
                    <h1 class="fw-light" id="emboss-txt">SUPERANIME</h1>
                    <p class="lead text-muted" id="transparencia">SuperAnime la web donde podras encontrar y crear tus animes favoritos sin ningun tipo de problema.</p>
                  
                </div>
            </div>
        </section>
<br/>
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
                       <div id="container">
                       
                       <img id="icono" class="icono"src="https://giffiles.alphacoders.com/130/13036.gif" > 
                    	</div>
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
                         "https://images6.alphacoders.com/756/756653.jpg",
                         "https://images5.alphacoders.com/606/606284.jpg",
                         "https://images7.alphacoders.com/106/1065298.jpg",
                    ];
                    var i = 0;
                    window.setInterval(function(){
                         /* $('#paraVosotros'). css({"background-image": "url(" + images[i]+ ")"}).animate({"opacity": "0"}, "slow"); */
                         $('#paraVosotros'). css({"background-image": "url(" + images[i]+ ")"}).animate({opacity: "show"  });
                         i = (i==images.length-1) ? 0 : i+1;
                    }, 5000);
               });
               
           /*     $( document ).ready(function(){
                   let images = [
                        "https://images3.alphacoders.com/117/1178785.jpg",
                        "https://giffiles.alphacoders.com/121/12161.gif",
                        "https://avatarfiles.alphacoders.com/134/13472.gif",
                        "https://images5.alphacoders.com/606/606284.jpg",
                   ];
                   var i = 0;
                   window.setInterval(function(){
                       
                        $('#icono'). css({"background": "url(" + images[i]+ ")"})
                        .animate({opacity: "show"  })
                        .css({"background-repeat":"no-repeat"})
                        .css({"background-position-x":"center"}) 
                         ;
                        i = (i==images.length-1) ? 0 : i+1;
                   }, 900);
              }); */
              </script> 



<%@ include file = "footer.jsp" %>
       </body>
<!-- CSS only -->


</html>
