package com.superanime.modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.superanime.modelo.entity.Anime;
import com.superanime.modelo.entity.Productora;

public class ProductoraDaoImpl implements ProductoraDao {

	public List<Productora> listAllProductoras() {
		EntityManager em = EntityManagerGestor.crearEntityManager();

		ArrayList<Productora> productoras = (ArrayList<Productora>) em.createQuery(Constantes.SQL_PRODUCTORA_FIND_ALL)
				.getResultList();

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

	public void deleteProductora(long id) {
		EntityManager em = EntityManagerGestor.crearEntityManager();

		em.getTransaction().begin();

		// obtener Anime por Id
		Productora p = em.find(Productora.class, id);

		// eliminar
		if (p != null) {
			// TODO En el controller al llamar al metodo hay que poner activo=0;
			em.merge(p);
		} else {
			// System.out.println("No se puede elimiar un libro que no existe");
		}

		em.getTransaction().commit();

		em.close();

	}

	public void updateProductora(Productora productora) {
		EntityManager em = EntityManagerGestor.crearEntityManager();
		// TODO En el controller al llamar al metodo hay que poner activo=1;
		em.getTransaction().begin();
		em.merge(productora);

		em.getTransaction().commit();

		em.close();

	}

	public Productora getProductoraById(long id) {
		
		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("find_productora_by_id");
		query.setParameter("id", id);

		Productora productora = (Productora) query.getSingleResult();

		em.close();

		return productora;
	}

}
