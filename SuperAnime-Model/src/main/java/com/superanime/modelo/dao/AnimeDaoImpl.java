package com.superanime.modelo.dao;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.superanime.modelo.entity.Anime;

public class AnimeDaoImpl implements AnimeDao {



	public ArrayList<Anime> listAllAnimes() {

		EntityManager em = EntityManagerGestor.crearEntityManager();

		ArrayList<Anime> animes = (ArrayList<Anime>) em.createQuery(Constantes.SQL_ANIME_FIND_ALL).getResultList();

		em.close();

		return animes;
	}

	public Anime addAnime(Anime anime) {

		EntityManager em = EntityManagerGestor.crearEntityManager();

		em.getTransaction().begin();

		em.persist(anime);

		em.getTransaction().commit();

		em.close();

		return anime;
	}
	
	public void deleteAnime(long id) {

		EntityManager em = EntityManagerGestor.crearEntityManager();

		em.getTransaction().begin();		

		// obtener Anime por Id
		Anime a = em.find(Anime.class, id);

		// eliminar
		if (a != null) {
			//TODO En el controller al llamar al metodo hay que poner activo=0;
			em.merge(a);
		} else {
			// System.out.println("No se puede elimiar un libro que no existe");
		}
		
		em.getTransaction().commit();
		
		em.close();
	}

	public void updateAnime(Anime anime) {

		EntityManager em = EntityManagerGestor.crearEntityManager();
		//TODO En el controller al llamar al metodo hay que poner activo=1;
		em.getTransaction().begin();
		em.merge(anime);	
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	public Anime getAnimeById(long id) {
		
		EntityManager em = EntityManagerGestor.crearEntityManager();
		
		Query query = em.createNamedQuery("find_anime_by_id");
		query.setParameter("id", id);
		
		Anime anime =  (Anime) query.getSingleResult();

		em.close();

		return anime;
	}

}
