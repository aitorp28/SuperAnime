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
 * Servlet implementation class activarProductora
 *para activar la productora una vez que se ha hecho el borrado logico,
 *  en este caso lo hace el usuario administrador y esto se comprueba en el jsp
 */
@WebServlet("/activarProductora")
public class ActivarProductoraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private AnimeDaoImpl animeDaoImpl;
	private ProductoraDaoImpl productoraDaoImpl;
	private UsuarioDaoImpl usuarioDaoImpl;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActivarProductoraController() {
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
		
		
		//Actualiza la tabla en la base de datos para poner en Activo cambiando el valor de 0 a 1 y asi volver a activar la productora

		long id= new Long(request.getParameter("id"));
		Productora p =  productoraDaoImpl.getProductoraById(id);
		

		
		
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
