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
import com.superanime.modelo.entity.Anime;
import com.superanime.modelo.entity.Productora;
import com.superanime.modelo.entity.Usuario;

/**
 * Servlet implementation class actualizarAnime 
 * para actualizar el anime seleccionado en el jsp
 * En el caso de ser administrador puede editarlos todos dado que se muestran todos en la tabla
 * En el caso de ser un usuario normal solo podria editar sus propios animes
 */
@WebServlet("/actualizarAnime")
public class ActualizarAnimeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private AnimeDaoImpl animeDaoImpl;
	private ProductoraDaoImpl productoraDaoImpl;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarAnimeController() {
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
			
		long id= new Long(request.getParameter("id"));
		String nombre =  (request.getParameter("nombre"));
		String genero =  (request.getParameter("genero"));
		String sinopsis =  (request.getParameter("sinopsis"));
		int episodios =  Integer.parseInt(request.getParameter("episodios"));
		int id_productora = Integer.parseInt(request.getParameter("productora"));
		Productora productora = productoraDaoImpl.getProductoraById(id_productora);
		
		
		Anime a= animeDaoImpl.getAnimeById(id);
		
		a.setGeneros(genero);
		a.setSinopsis(sinopsis);
		a.setEpisodios(episodios);
		a.setProductora(productora);
		
		animeDaoImpl.updateAnime(a);
	
		sesion.setAttribute("usuario",u);
		
		
		 
		 

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
