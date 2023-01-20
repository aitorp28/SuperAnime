package com.superanime.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.entity.Anime;

@Service("animeservice")
public class AnimeServiceImpl implements AnimeService {

	// @Autowired
	private AnimeDaoImpl animeDao;

	/**
	 * Metodo para mostrar todos los animes validados y activos
	 * @return ArrayList<Anime>
	 */
	@Override
	public ArrayList<Anime> listAllAnimesCliente() {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.listAllAnimesCliente();
	}
	/**
	 * Metodo para mostrar todos los animes
	 * @return ArrayList<Anime>
	 */
	@Override
	public ArrayList<Anime> listAllAnimesAdmin() {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.listAllAnimesAdmin();
	}
	/**
	 * Metodo para mostrar los animes creados por el usuario enviado
	 * @param id Id del Usuario
	 * @return ArrayList<Anime>
	 */
	@Override
	public ArrayList<Anime> listAnimesUser(long id) {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.listAnimesUser(id);
	}
	/**
	 * Metodo para mostrar los animes con el nombre enviado
	 * @param nombre Nombre del Anime
	 * @return ArrayList<Anime>
	 */
	@Override
	public ArrayList<Anime> listAnimesByNombre(String nombre) {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.listAnimesByNombre(nombre);
	}
	/**
	 * Metodo para mostrar los animes por la productora enviada
	 * @param id Id de la Productora
	 * @return ArrayList<Anime>
	 */
	@Override
	public ArrayList<Anime> listAnimesByProductora(long id) {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.listAnimesByProductora(id);
	}
	/**
	 * Metodo para mostrar los animes que incluyen parte del nombre enviado
	 * @param nombre Nombre/parte de nombre que puede incluir los animes
	 * @return List<Anime>
	 */
	@Override
	public List<Anime> findFilterByName(String name) {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.findFilterByName(name);
	}
	/**
	 * Metodo para buscar el anime por su id
	 * @param id Id del Anime
	 * @return Anime
	 */
	@Override
	public Anime getAnimeById(long id) {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.getAnimeById(id);
	}
	/**
	 * Metodo para comprobar si el nombre insertado existe ya dado a que el campo en la bbdd es unico
	 * @return boolean Devuelve false cuando no encuentra el nombre en la base de datos, true si ya existe el nombre de la bbdd
	 */
	@Override
	public boolean existeNombre(String nombre) {

		animeDao = AnimeDaoImpl.getInstance();
		
		return animeDao.existeNombre(nombre);
	}
}
