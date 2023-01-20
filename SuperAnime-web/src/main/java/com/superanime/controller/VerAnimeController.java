package com.superanime.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.dao.UsuarioDaoImpl;
import com.superanime.modelo.entity.Anime;
import com.superanime.modelo.entity.Usuario;

/**
 * Servlet implementation class verAnime
 * para redireccionar a la venta de ver animes llevando la sesion del usuario logeado 
 * 
 */
@WebServlet("/verAnime")
public class VerAnimeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UsuarioDaoImpl usuarioDaoImpl ;
	private AnimeDaoImpl  animeDaoImpl;
        
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerAnimeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		usuarioDaoImpl=	UsuarioDaoImpl.getInstance();
		

	animeDaoImpl = AnimeDaoImpl.getInstance();

	long id= new Long(request.getParameter("id"));
	Anime a =  animeDaoImpl.getAnimeById(id);




		HttpSession sesion = request.getSession(true);
		
		Usuario u =(Usuario) sesion.getAttribute("usuario");
		
		
		
    	
		
    	
    	sesion.setAttribute("usuario",u);
    	request.setAttribute("anime",a);
		RequestDispatcher despachador = request.getRequestDispatcher("vistaAnime.jsp");
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
