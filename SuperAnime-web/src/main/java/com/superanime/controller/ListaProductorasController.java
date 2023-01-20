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
import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.dao.UsuarioDaoImpl;
import com.superanime.modelo.entity.Usuario;

/**
 * Servlet implementation class listaProductoras
 * para redireccionar desde cualquier apartado dando al boton de animes para mostrar en el caso de tener perfil usuario no podrias 
 * ver productoras por que no tiene accceso a este apartado se controla en la vista
 * en el caso de tener perfil administrador verias todas las productoras
 * 
 */
@WebServlet("/listaProductoras")
public class ListaProductorasController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private ProductoraDaoImpl productoraDaoImpl;
	private UsuarioDaoImpl usuarioDaoImpl;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaProductorasController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		productoraDaoImpl = ProductoraDaoImpl.getInstance();
		
		
	usuarioDaoImpl=	UsuarioDaoImpl.getInstance();
	HttpSession sesion = request.getSession(true); 
		Usuario u =(Usuario) sesion.getAttribute("usuario");
		
			sesion.setAttribute("usuario",u);
		RequestDispatcher despachador = request.getRequestDispatcher("tabla_productoras.jsp");
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
