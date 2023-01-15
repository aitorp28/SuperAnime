package com.superanime.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.dao.UsuarioDaoImpl;
import com.superanime.modelo.entity.Anime;
import com.superanime.modelo.entity.Productora;
import com.superanime.modelo.entity.Usuario;

/**
 * Servlet implementation class mainController
 */
@WebServlet("/crearAnime")
public class CrearAnimeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private AnimeDaoImpl animeDaoImpl;
	private ProductoraDaoImpl productoraDaoImpl;
	private UsuarioDaoImpl usuarioDaoImpl;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearAnimeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		animeDaoImpl = AnimeDaoImpl.getInstance();
		productoraDaoImpl = ProductoraDaoImpl.getInstance();
		
		HttpSession sesion = request.getSession(true); 
		Usuario u =(Usuario) sesion.getAttribute("usuario");
		
		
		if(!animeDaoImpl.existeNombre((request.getParameter("nombre")))&& request.getParameter("episodios")!= "") {
			
		
		
		String nombre =  (request.getParameter("nombre"));
		String genero =  (request.getParameter("genero"));
		String sinopsis =  (request.getParameter("sinopsis"));
		int episodios =  Integer.parseInt(request.getParameter("episodios"));
		int id_productora = Integer.parseInt(request.getParameter("productora"));
		
		Productora productora = productoraDaoImpl.getProductoraById(id_productora);
//		Usuario u =(Usuario) request.getAttribute("usuario");
		
		
		
		
		
			sesion.setAttribute("usuario",u);
    	
		
    	
    	
		
		Anime a = new Anime( nombre,  genero,  sinopsis,  episodios,  productora,  u,
				 0,  1);
//		
//		a.setNombre(nombre);
//		a.setGeneros(genero);
//		a.setSinopsis(sinopsis);
//		a.setEpisodios(episodios);
//		a.setProductora(productora);
//		
//		a.setValidado(0);
//		a.setActivo(1);
//		a.setUsuario(u);
		animeDaoImpl.addAnime(a);
		}else {
			sesion.setAttribute("usuario",u);
			PrintWriter out = response.getWriter();
	    	 out.println("<script type='text/javascript'>");
	    	   out.println("alert('User or password incorrect');");
	    	   out.println("location='login.jsp';");
	    	   out.println("</script>");
			
		}
		
		
		
		 
		 
	
		RequestDispatcher despachador = request.getRequestDispatcher("tabla_animes.jsp");
	    despachador.forward(request, response);
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
