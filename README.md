# SuperAnime
Este proyecto está enfocado a crear una web que muestra a los usuarios la mayor parte de los animes existentes y la posibilidad de  añadir nuevos. Además de esto podrán ver información más detallada sobre ellos.

## Tecnologías usadas
Para llevar a cabo este proyecto se han utilizado las siguientes tecnologías: JavaScript, Boostrap, JSP, HTML5, CSS, Servlet, Java, Spring Boot y API REST. Todo esto se ha realizado en el entorno de desarrollo de Eclipse y Spring Tool Suite 4.

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

##Instalación

Antes de realizar está instalación es necesario tener instalado los entornos de desarrollo de Eclipse y Spring Tool Suit 4 , tener XAMPP o alguna otra aplicación que active la conexión con la bbdd y crear la bbdd con el nombre de superanime e tener una versión de Tomcat instalada.Para poder iniciar esta aplicación hay que entrar desde a [github](https://github.com/aitorp28/SuperAnime) 
![como descargar desde guthub](/documentacion/github_download.PNG)
Una vez descargado el zip, hay que descompromirlo y dentro de eclipse importar el proyecto File>Import>Maven Project>../SuperAnime-Model
Al haber terminado de importar hay que hacer click derecho en la raíz del proyecto>Run As>Maven Install.
Tras terminarlo podemos importar el proyecto de Superanime-Web añadimos el proyecto al Tomcat, iniciamos el proyecto y publicamos mediante el [enlace](localhost:8080/web/vistaInicio)  
