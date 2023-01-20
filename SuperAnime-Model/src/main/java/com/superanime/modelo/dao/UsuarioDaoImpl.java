package com.superanime.modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.superanime.modelo.entity.Usuario;

public class UsuarioDaoImpl implements UsuarioDao {

	private static UsuarioDaoImpl INSTANCE = null;

	private UsuarioDaoImpl() {
		super();
	}

	public static UsuarioDaoImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new UsuarioDaoImpl();
		}
		return INSTANCE;
	}
	/**
	 * Metodo para comprobar que el usuario pasado como parametro existe en la bbdd
	 * @return Usuario usuario nulo en caso de que no coincida con 
	 */
	public Usuario comprobarUsuario(String email,String password) {
		Usuario usuario;
		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("comprobar_usuario");
		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			
			usuario = (Usuario) query.getSingleResult();
		
		} catch (NoResultException e) {
			
			usuario = null;
		}
		
		em.close();

		return usuario;
	}

}
