package com.superanime.modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.superanime.modelo.entity.Usuario;

public class UsuarioDaoImpl implements UsuarioDao {

	public List<Usuario> listAllUsuarios() {

		EntityManager em = EntityManagerGestor.crearEntityManager();

		ArrayList<Usuario> usuarios = (ArrayList<Usuario>) em.createQuery(Constantes.SQL_USUARIO_FIND_ALL)
				.getResultList();

		em.close();

		return usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {

		EntityManager em = EntityManagerGestor.crearEntityManager();

		em.getTransaction().begin();

		em.persist(usuario);

		em.getTransaction().commit();

		em.close();

		return usuario;
	}

	public void deleteUsuario(int id) {

		EntityManager em = EntityManagerGestor.crearEntityManager();

		em.getTransaction().begin();

		// obtener Anime por Id
		Usuario a = em.find(Usuario.class, id);

		// eliminar

		em.merge(a);

		em.getTransaction().commit();

		em.close();
	}

	public void updateUsuario(Usuario usuario) {

		EntityManager em = EntityManagerGestor.crearEntityManager();
		// TODO En el controller al llamar al metodo hay que poner activo=1;
		em.getTransaction().begin();
		em.merge(usuario);

		em.getTransaction().commit();

		em.close();
	}

	public Usuario getUsuarioById(Long id) {

		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("find_usuario_by_id");
		query.setParameter("id", id);

		Usuario usuario = (Usuario) query.getSingleResult();

		em.close();

		return usuario;
	}

}
