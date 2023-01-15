package com.superanime.modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.superanime.modelo.entity.Productora;

public class ProductoraDaoImpl implements ProductoraDao {

	private static ProductoraDaoImpl INSTANCE = null;

	private ProductoraDaoImpl() {
		super();
	}

	public static ProductoraDaoImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new ProductoraDaoImpl();
		}
		return INSTANCE;
	}

	@SuppressWarnings("unchecked")
	public List<Productora> listAllProductoras() {
		EntityManager em = EntityManagerGestor.crearEntityManager();

		ArrayList<Productora> productoras = (ArrayList<Productora>) em
				.createQuery(Constantes.SQL_PRODUCTORA_FIND_ALL).getResultList();

		em.close();

		return productoras;
	}

	@SuppressWarnings("unchecked")
	public List<Productora> findFilterByName(String nombre) {
		ArrayList<Productora> productoras;
		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("find_productora_by_like_nombre");
		query.setParameter("nombre", "%" + nombre + "%");
		try {
			productoras = (ArrayList<Productora>) query.getResultList();
		} catch (NoResultException e) {
			productoras = null;
		}
		em.close();

		return productoras;
	}

	public Productora addProductora(Productora productora) {
		EntityManager em = EntityManagerGestor.crearEntityManager();

		em.getTransaction().begin();

		em.persist(productora);

		em.getTransaction().commit();

		em.close();

		return productora;
	}

	public boolean existeNombre(String nombre) {
		Productora productora;
		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("find_productora_by_nombre");
		query.setParameter("nombre", nombre);
		try {
			productora = (Productora) query.getSingleResult();
		} catch (NoResultException e) {
			productora = null;
		}
		em.close();

		return productora != null;
	}

	public boolean deleteLogicoProductora(long id) {
		boolean borrado = true;
		EntityManager em = EntityManagerGestor.crearEntityManager();

		em.getTransaction().begin();

		// obtener Productora por Id
		Productora p = em.find(Productora.class, id);

		// borrado logico
		if (p != null) {
			p.setActivo(0);
			em.merge(p);
		} else {
			borrado = false;
		}

		em.getTransaction().commit();

		em.close();
		return borrado;
	}

	public void updateProductora(Productora productora) {
		EntityManager em = EntityManagerGestor.crearEntityManager();

		productora.setActivo(1);

		em.getTransaction().begin();

		em.merge(productora);

		em.getTransaction().commit();

		em.close();

	}

	public Productora getProductoraById(long id) {
		Productora productora;
		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("find_productora_by_id");
		query.setParameter("id", id);
		try {
			productora = (Productora) query.getSingleResult();
		} catch (NoResultException e) {
			productora = null;
		}
		em.close();

		return productora;
	}

}
