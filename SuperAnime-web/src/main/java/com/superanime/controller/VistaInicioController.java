package com.superanime.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.superanime.modelo.dao.UsuarioDaoImpl;
import com.superanime.modelo.entity.Usuario;

/**
 * Servlet implementation class vistaInicio
 * para redireccionar a la vista de inicio llevando el usuario en la sesion
 * 
 * 
 */
@WebServlet("/vistaInicio")
public class VistaInicioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UsuarioDaoImpl usuarioDaoImpl ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VistaInicioController() {
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
		
		HttpSession sesion = request.getSession(true);
		
		Usuario u =(Usuario) sesion.getAttribute("usuario");
		
		
		
    	
		
    	
    	sesion.setAttribute("usuario",u);
		 
		
	        RequestDispatcher despachador = request.getRequestDispatcher("index.jsp");
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
