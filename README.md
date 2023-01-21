# SuperAnime
Este proyecto está enfocado a crear una web que muestra a los usuarios la mayor parte de los animes existentes y la posibilidad de  añadir nuevos. Además de esto podrán ver información más detallada sobre ellos.

## Tecnologías usadas
Para llevar a cabo este proyecto se han utilizado las siguientes tecnologías: JavaScript, Boostrap, JSP, HTML5, CSS, Servlet, Java, Spring Boot y API REST. Todo esto se ha realizado en el entorno de desarrollo de Eclipse y Spring Tool Suite 4.

Tecnologias usadas en el apartado de vista hemos usado javaScript para dar funcionalidad a ciertos botones para lanzar un formulario ademas de aplicar css con ello
tambien usamos jquery para crear un carousel de imagenes en el apartado de inicio. Estas dos tecnologias an sido usadas para facilitar todo el trabajo en el apartado visual
y este sea mas dinamico

## Proyectos

### Superanime-Modelo

El Superanime-Modelo es donde se crean las entidades de Usuario, Anime y Productora y se generan los diferentes métodos CRUD en el DAO.

### Superanime-Rest
El Superanime-Modelo es el proyecto que se cean los diferentes métodos que llaman al DAO del Superanime-Modelo mediante la capa de Service el cual puede ser usado por terceras empresas.

### Superanime-Web
Superanime-Web es la parte front del proyecto, tiene las páginas y los controladores los cuales enlazan la web con la capa Modelo para realizar el acceso a los datos

### Superanime-Web-Rest
Superanime-Web-Rest es similar a Superanime-Web pero con la diferencia que en vez de realizar la conexión con la capa de Modelo hace conexión con la capa de Superanime-Rest.

## Configuración bbdd

No hace falta los scripts de la bbdd porque lo crea Hibernate mediante ORM.

Si que es necesario: crear la base datos llamada **jpa**, intersante mirar el fichero **java/resources/META-INF/persistance.xml**

Disponemos de dos tablas con una relación 1:N las cuales son Animes y Productoras y luego la tabla de Usuario fuera aparte

![diagrama de la base datos](/documentacion/bbddv1_0.PNG)

Disponemos de dos tablas con una relación 1:N las cuales son Animes y Productoras y Animes y Usuario y cambiado campos 

![diagrama de la base datos](/documentacion/bbddv2_0.PNG)

## Instalación

Antes de realizar está instalación es necesario tener instalado los entornos de desarrollo de [Eclipse](https://www.eclipse.org/downloads/)  y [Spring Tool Suit 4](https://spring.io/tools) , tener [XAMPP](https://www.apachefriends.org/es/download.html) y clickar en start en el apartado de MySQL (en caso de no saber como hacerlo consulta este [enlace](https://www.ionos.es/digitalguide/servidores/herramientas/instala-tu-servidor-local-xampp-en-unos-pocos-pasos/)) crear la bbdd con el nombre de superanime(en caso de duda consulte el siguiente [enlance](https://kb.iweb.com/hc/es/articles/230246688-Cómo-crear-bases-de-datos-en-phpMyAdmin)) y tener el [Tomcat 9.0](https://tomcat.apache.org/download-90.cgi) el cual va ha ser el servidor.Para poder iniciar esta aplicación hay que entrar desde a [github](https://github.com/aitorp28/SuperAnime) 
![como descargar desde github](/documentacion/github_download.PNG)
Una vez descargado el zip, hay que descomprimirlo y dentro de eclipse importar el proyecto: File>Import>Maven Project>../SuperAnime-Model
Al haber terminado de importar hay que hacer click derecho en la raíz del proyecto>Run As>Maven Install.
![como realizar el Maven install](/documentacion/maven_install.PNG)
Tras terminarlo podemos importar el proyecto de Superanime-Web siguiendo los pasos mencionados en el SuperAnime-Model. Al importarlo tenemos que añadirlo en el tomcat (en caso de duda es recomendable seguir [este](https://jesusfernandeztoledo.com/instalar-eclipse-e-incluir-tomcat-en-eclipse/) tutorial pero en nuestro caso con la versión 9.0 de Tomcat)
![como añadir el proyecto web](/documentacion/add_remove.PNG)
Después de añadirlo y publicar, para acceder a la página pondremos en nuestro navegador el siguiente [enlace](http://localhost:8080/SuperAnime-We/index.jsp).
Al cargar la página ya se habrán creado las tablas en la bbdd anterionmente creada con lo que para tener acceso a la página recomiendo insertar el siguiente [script](/documentacion/script.sql) de la bbdd el cual inserta un juego de datos.

Para realizar la instalación de la API REST debemos abrir el IDE de Spring Tool Suit 4 e importar el proyecto siguiendo los mismo pasos realizados. Una vez realizado esto importaremos el proyecto de SuperAnime-web-rest de la misma manera.
Una vez realizado esto debemos hace el haz and remove del proyecto web REST e iniciar el royecto rest en el boot dashboard
![add and remove web REST](/documentacion/add_remove_rest.PNG)
![dashboard REST](/documentacion/dashboard.png)

Para terminar accederemos a la siguiente [URL](http://localhost:8080/SuperAnime-web-rest/tabla_animes.jsp) para visualizar la web.
En caso de querer ver la documentación de la REST click en el siguiente [enlace](http://localhost:8081/swagger-ui/index.html)
