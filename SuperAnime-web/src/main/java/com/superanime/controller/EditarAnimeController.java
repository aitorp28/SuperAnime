package com.superanime.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.entity.Anime;
import com.superanime.modelo.entity.Usuario;

/**
 * Servlet implementation class editarAnime
 * para editar tus animes en el caso de tener perfil usuario y en el caso del administrador puede editar todos los animes
 */
@WebServlet("/editarAnime")
public class EditarAnimeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AnimeDaoImpl  animeDaoImpl;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditarAnimeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		animeDaoImpl = AnimeDaoImpl.getInstance();
		
		HttpSession sesion = request.getSession(true); 
		Usuario u =(Usuario) sesion.getAttribute("usuario");
		
		long id= new Long(request.getParameter("id"));
		Anime a =  animeDaoImpl.getAnimeById(id);
		
		sesion.setAttribute("usuario",u);
		
		request.setAttribute("anime",a);
		RequestDispatcher despachador = request.getRequestDispatcher("editar_Anime.jsp");
	    despachador.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
