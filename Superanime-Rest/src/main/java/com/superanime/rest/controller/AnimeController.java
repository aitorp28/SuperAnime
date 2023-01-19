package com.superanime.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superanime.modelo.entity.Anime;
import com.superanime.rest.service.AnimeService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"*"})
public class AnimeController {

	@Autowired
	private AnimeService animeServ;
	
	/**
	 * Metodo para mostrar todos los animes validados y activos
	 * @return List<Anime>
	 */
	@GetMapping("/animesCliente")
	public List<Anime> listAllAnimesCliente() {
		return animeServ.listAllAnimesCliente();
	}
	/**
	 * Metodo para mostrar todos los animes
	 * @return List<Anime>
	 */
	@GetMapping("/animesAdmin")
	public List<Anime> listAllAnimesAdmin() {
		return animeServ.listAllAnimesAdmin();
	}

	/**
	 * Metodo para mostrar los animes creados por el usuario enviado
	 * @param id Id del Usuario
	 * @return List<Anime>
	 */
	@GetMapping("/animesUser")
	public List<Anime> listAnimesUser(@PathVariable long id) {
		return animeServ.listAnimesUser(id);
	}

	/**
	 * Metodo para mostrar los animes con el nombre enviado
	 * @param nombre Nombre del Anime
	 * @return List<Anime>
	 */
	@GetMapping("/animesNombre")
	public List<Anime> listAnimesByNombre(@PathVariable String nombre) {
		return animeServ.listAnimesByNombre(nombre);
	}
	
	/**
	 * Metodo para mostrar los animes por la productora enviada
	 * @param id Id de la Productora
	 * @return List<Anime>
	 */
	@GetMapping("/animesProductora")
	public List<Anime> listAnimesByProductora(@PathVariable long id) {
		return animeServ.listAnimesByProductora(id);
	}
	
	/**
	 * Metodo para mostrar los animes que incluyen parte del nombre enviado
	 * @param nombre Nombre/parte de nombre que puede incluir los animes
	 * @return List<Anime>
	 */
	@GetMapping("/animesByName")
	public List<Anime> findFilterByName(String nombre) {
		return animeServ.findFilterByName(nombre);
	}
	
	/**
	 * Metodo para buscar el anime por su id
	 * @param id Id del Anime
	 * @return Anime
	 */
	@GetMapping("/anime/{id}")
	public Anime getAnimeById(@PathVariable long id) {
		return animeServ.getAnimeById(id);
	}
}
