package com.superanime.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.entity.Productora;
import com.superanime.modelo.entity.Usuario;

/**
 * Servlet implementation class mainController
 */
@WebServlet("/buscarProductora")
public class BuscarProductoraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private AnimeDaoImpl animeDaoImpl;
	private ProductoraDaoImpl productoraDaoImpl;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarProductoraController() {
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
	
		String nombre =  (request.getParameter("nombre"));
		
		
		
		
		
		List<Productora> productoras = productoraDaoImpl.findFilterByName(nombre);
	
		request.setAttribute("productoras", productoras);
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
