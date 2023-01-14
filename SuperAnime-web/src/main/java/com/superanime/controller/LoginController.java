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

import com.superanime.modelo.dao.UsuarioDaoImpl;
import com.superanime.modelo.entity.Usuario;

/**
 * Servlet implementation class mainController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private UsuarioDaoImpl usuarioDaoImpl ;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
	    usuarioDaoImpl = UsuarioDaoImpl.getInstance();
	    Usuario u = new Usuario ();
	   
	    u=usuarioDaoImpl.comprobarUsuario(request.getParameter("email"), request.getParameter("password"));
	    if(u!=null) { 
	    	HttpSession sesion = request.getSession(true);
	    	
		
	    	
	    	sesion.setAttribute("usuario",u);
	        RequestDispatcher despachador = request.getRequestDispatcher("index.jsp");
	        despachador.forward(request, response);
	        
	        
	        PrintWriter out = response.getWriter();
	        out.println("<script type=\"text/javascript\">");
	        out.println("document.getElementById('registro').innerHTML");
	        out.println("</script>");
	        
	    }else{
	    //si falla el login alert campos vacios
//	    	RequestDispatcher despachador = request.getRequestDispatcher("index.jsp"); 
//	    	despachador.forward(request, response);
	    	PrintWriter out = response.getWriter();
	    	 out.println("<script type=\"text/javascript\">");
	    	   out.println("alert('User or password incorrect');");
	    	   out.println("location='login.jsp';");
	    	   out.println("</script>");
	    } 

	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
