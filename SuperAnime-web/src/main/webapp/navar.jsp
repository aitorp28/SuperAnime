
      <nav class="navbar navbar-expand-lg navbar-dark fixed-top bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Carousel</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <ul class="navbar-nav me-auto mb-2 mb-md-0">
                        <li class="nav-item">
                            <form action = "vistaInicio" >
                				 <button class="btn btn-outline-secondary" type="submit">INICIO</button>
                    		</form>
                        </li>
                        <li class="nav-item">
                          <form action = "mainController" class="d-flex">
                            <a class="nav-link" href="#">Enlace</a>
                            </form>
                        </li>
                        <li class="nav-item">
                        <c:if test="${usuario.getPerfil().equals('admin')}">


                             <form action = "listaAnimes" >
                				 <button class="btn btn-outline-secondary" type="submit">ANIMES</button>
                    		</form>
                    		</c:if>
                        </li>
                    </ul>
                 <form action = "mainController" class="d-flex" role="search">
<!--                         <input class="form-control me-2" type="search" placeholder="Buscar" aria-label="Buscar">
 -->                        <button class="btn btn-outline-success" type="submit">Login</button>
                    </form>
                </div>
            </div>
        </nav>
        <br/>
</div>       