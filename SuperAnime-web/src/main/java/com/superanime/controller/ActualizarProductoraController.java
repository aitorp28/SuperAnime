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
 * Servlet implementation class actualizarProductora
 * para actualizar el productora seleccionado en el jsp
 * Solo el administrador puede editar una productora, esto se comprueba en el jsp,
 * dado que si no eres administrador en la ventana principal no tienes acceso al apartado donde se muestran dichas productoras.
 */
@WebServlet("/actualizarProductora")
public class ActualizarProductoraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private AnimeDaoImpl animeDaoImpl;
	private ProductoraDaoImpl productoraDaoImpl;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActualizarProductoraController() {
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
		String Descripcion =  (request.getParameter("descripcion"));
		
		
		
		Productora p= productoraDaoImpl.getProductoraById(id);
		
		
		p.setDescripcion(Descripcion);
		
		
		productoraDaoImpl.updateProductora(p);
	
		
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
