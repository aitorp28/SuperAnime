package com.superanime.modelo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import com.superanime.modelo.entity.Anime;

public class AnimeDaoImpl implements AnimeDao {

	private static AnimeDaoImpl INSTANCE = null;

	private AnimeDaoImpl() {
		super();
	}

	public static AnimeDaoImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new AnimeDaoImpl();
		}
		return INSTANCE;
	}

	/**
	 * Metodo para mostrar todos los animes validados y activos
	 * @return ArrayList<Anime>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Anime> listAllAnimesCliente() {

		EntityManager em = EntityManagerGestor.crearEntityManager();

		ArrayList<Anime> animes = (ArrayList<Anime>) em.createQuery(Constantes.SQL_ANIME_FIND_ALL_VALIDADOS_ACTIVOS)
				.getResultList();

		em.close();

		return animes;
	}
	
	/**
	 * Metodo para mostrar todos los animes
	 * @return ArrayList<Anime>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Anime> listAllAnimesAdmin() {
		ArrayList<Anime> animes;
		EntityManager em = EntityManagerGestor.crearEntityManager();
		try {
			animes = (ArrayList<Anime>) em.createQuery(Constantes.SQL_ANIME_FIND_ALL).getResultList();
		} catch (NoResultException e) {
			animes = null;
		}
		em.close();

		return animes;
	}
	
	/**
	 * Metodo para mostrar todos los animes no validados
	 * @param id Id del Usuario
	 * @return ArrayList<Anime>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Anime> listAllAnimesNoValidados() {
		ArrayList<Anime> animes;
		EntityManager em = EntityManagerGestor.crearEntityManager();
		try {
			animes = (ArrayList<Anime>) em.createQuery(Constantes.SQL_ANIME_FIND_BY_NO_VALIDADO).getResultList();
		} catch (NoResultException e) {
			animes = null;
		}
		em.close();

		return animes;
	}
	/**
	 * Metodo para mostrar todos los animes validados
	 * @param id Id del Usuario
	 * @return ArrayList<Anime>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Anime> listAllAnimesValidados() {
		ArrayList<Anime> animes;
		EntityManager em = EntityManagerGestor.crearEntityManager();
		try {
			animes = (ArrayList<Anime>) em.createQuery(Constantes.SQL_ANIME_FIND_BY_VALIDADO).getResultList();
		} catch (NoResultException e) {
			animes = null;
		}
		em.close();

		return animes;
	}
	/**
	 * Metodo para mostrar los animes creados por el usuario enviado
	 * @param id Id del Usuario
	 * @return ArrayList<Anime>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Anime> listAnimesUser(long id) {

		ArrayList<Anime> animes = null;

		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("find_anime_by_usuario");
		query.setParameter("usuario", id);

		try {
			animes = (ArrayList<Anime>) query.getResultList();
		} catch (NoResultException e) {
			animes = null;
		}
		em.close();

		em.close();

		return animes;
	}
	/**
	 * Metodo para mostrar los animes que incluyen parte del nombre enviado
	 * @param nombre Nombre/parte de nombre que puede incluir los animes
	 * @return List<Anime>
	 */
	@SuppressWarnings("unchecked")
	public List<Anime> findFilterByName(String nombre) {
		ArrayList<Anime> animes;
		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("find_anime_by_like_nombre");
		query.setParameter("nombre", "%" + nombre + "%");
		try {
			animes = (ArrayList<Anime>) query.getResultList();
		} catch (NoResultException e) {
			animes = null;
		}
		em.close();

		return animes;
	}
	/**
	 * Metodo para comprobar si el nombre insertado existe ya dado a que el campo en la bbdd es unico
	 * @return boolean Devuelve false cuando no encuentra el nombre en la base de datos, true si ya existe el nombre de la bbdd
	 */
	public boolean existeNombre(String nombre) {
		Anime anime;
		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("find_anime_by_nombre");
		query.setParameter("nombre", nombre);
		try {
			anime = (Anime) query.getSingleResult();
		} catch (NoResultException e) {
			anime = null;
		}
		em.close();

		return anime != null;
	}
	/**
	 * Metodo para mostrar los animes con el nombre enviado
	 * @param nombre Nombre del Anime
	 * @return ArrayList<Anime>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Anime> listAnimesByNombre(String nombre) {

		ArrayList<Anime> animes = null;

		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("find_anime_by_nombre");
		query.setParameter("nombre", nombre);

		try {
			animes = (ArrayList<Anime>) query.getResultList();
		} catch (NoResultException e) {
			animes = null;
		}
		em.close();

		em.close();

		return animes;
	}
	/**
	 * Metodo para mostrar los animes por la productora enviada
	 * @param id Id de la Productora
	 * @return ArrayList<Anime>
	 */
	@SuppressWarnings("unchecked")
	public ArrayList<Anime> listAnimesByProductora(long id) {

		ArrayList<Anime> animes = null;

		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("find_anime_by_productora");
		query.setParameter("idproductora", id);

		try {
			animes = (ArrayList<Anime>) query.getResultList();
		} catch (NoResultException e) {
			animes = null;
		}
		em.close();

		em.close();

		return animes;
	}
	
	/**
	 * Metodo para añadir el anime en la bbdd
	 * @return Anime
	 */
	public Anime addAnime(Anime anime) {

		EntityManager em = EntityManagerGestor.crearEntityManager();

		em.getTransaction().begin();

		em.persist(anime);

		em.getTransaction().commit();

		em.close();

		return anime;
	}
	/**
	 * Metodo para borrar de manera logica un anime
	 * En caso de que no sea borrado devuelve false
	 * @return boolean
	 */
	public boolean deleteLogicoAnime(long id) {
		boolean borrado=true;
		EntityManager em = EntityManagerGestor.crearEntityManager();

		em.getTransaction().begin();

		// obtener Anime por Id
		Anime a = em.find(Anime.class, id);

		// eliminar
		if (a != null) {
			a.setActivo(0);
			em.merge(a);
		} else {
			borrado=false;
		}

		em.getTransaction().commit();

		em.close();
		
		return borrado;
	}
	/**
	 * Metodo para actualizar el anime
	 * En caso de que no este activo lo cambio ha activo
	 */
	public void updateAnime(Anime anime) {

		EntityManager em = EntityManagerGestor.crearEntityManager();
		anime.setActivo(1);
		em.getTransaction().begin();
		em.merge(anime);

		em.getTransaction().commit();

		em.close();

	}
	/**
	 * Metodo para buscar el anime por su id
	 * @param id Id del Anime
	 * @return Anime
	 */
	public Anime getAnimeById(long id) {
		Anime anime;
		EntityManager em = EntityManagerGestor.crearEntityManager();

		Query query = em.createNamedQuery("find_anime_by_id");
		query.setParameter("id", id);
		try {
			anime = (Anime) query.getSingleResult();
		} catch (NoResultException e) {
			anime = null;
		}
		em.close();

		return anime;
	}

}
