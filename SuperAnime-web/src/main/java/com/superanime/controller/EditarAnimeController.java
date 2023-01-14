package com.superanime.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.entity.Anime;

/**
 * Servlet implementation class mainController
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
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		animeDaoImpl = AnimeDaoImpl.getInstance();
		
		long id= new Long(request.getParameter("id"));
		Anime a =  animeDaoImpl.getAnimeById(id);
		
		
		request.setAttribute("anime",a);
		RequestDispatcher despachador = request.getRequestDispatcher("editar_Anime.jsp");
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
