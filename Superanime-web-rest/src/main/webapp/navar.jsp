
      <nav class="navbar navbar-expand-lg navbar-dark  bg-dark">
            <div class="container-fluid">
             <form action = "vistaInicio" name="verinicio">
                <a class="navbar-brand" href="javascript:verInicio()">SUPERANIME</a>
                </form>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="navbar-nav me-auto mb-2 mb-md-0 ">
                        
                      
                     
                        <li class="nav-item">
                       


                             <form action = "listaAnimes" onclick="verAnimes" name="animes">
                				 
                				<a class="nav-link" href="javascript:verAnimes()">Animes</a>
                			
                    		</form>
                    	
                        </li>
                        
                                           <li class="nav-item">
                    
                        


                             <form action = "listaProductoras" onclick="verProductoras()" name="productoras">
                				 
                				<a class="nav-link" href="javascript:verProductoras()">Productoras</a>
                			
                    		</form>
                    	
                        </li>
                    </ul>
              
<!--                         <input class="form-control me-2" type="search" placeholder="Buscar" aria-label="Buscar">
 -->  
 

       <form action = "mainController" class="d-flex" role="search">          
         <button class="btn btn-outline-success" id="registro" type="submit">Login</button>
          </form>
 
    	<form action="logoutUsuario">
    
       <button class="btn btn-outline-success" id="registro"   type="submit">Logout</button> 
        <%-- <button class="btn btn-outline-success" id="registro" onclick="<%session.setAttribute("usuario", null) ; %> "  type="submit"><c:if test="condition">Logout</c:if></button> --%>
    	
    	</form>
   
 


                   
                </div>
            </div>
        </nav>
<script type="text/javascript">

	function verAnimes() {
		 document.animes.submit()
	}

	function verProductoras() {
		 document.productoras.submit()
	}
	
	function verInicio() {
		 document.verinicio.submit()
	}

</script>
       
</div>       