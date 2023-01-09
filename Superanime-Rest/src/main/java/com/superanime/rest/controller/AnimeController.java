package com.superanime.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superanime.modelo.entity.Anime;
import com.superanime.rest.service.AnimeService;

@RestController
@RequestMapping("/api")
public class AnimeController {

	@Autowired
	private AnimeService animeServ;

	@GetMapping("/animesCliente")
	public List<Anime> listAllAnimesCliente() {
		return animeServ.listAllAnimesCliente();
	}

	@GetMapping("/animesAdmin")
	public List<Anime> listAllAnimesAdmin() {
		return animeServ.listAllAnimesAdmin();
	}

	@GetMapping("/animesUser")
	public List<Anime> listAnimesUser(@PathVariable long id) {
		return animeServ.listAnimesUser(id);
	}

	@GetMapping("/animesNombre")
	public List<Anime> listAnimesByNombre(@PathVariable String nombre) {
		return animeServ.listAnimesByNombre(nombre);
	}
	
	@GetMapping("/animesProductora")
	public List<Anime> listAnimesByProductora(@PathVariable long id) {
		return animeServ.listAnimesByProductora(id);
	}
	
	@GetMapping("/animesByName")
	public List<Anime> findFilterByName(String nombre) {
		return animeServ.findFilterByName(nombre);
	}
	
	@GetMapping("/anime/{id}")
	public Anime getAnimeById(@PathVariable long id) {
		return animeServ.getAnimeById(id);
	}

	@PostMapping("/anime")
	public Anime addAnime(@RequestBody Anime anime) {
		return animeServ.addAnime(anime);
	}

	@DeleteMapping("/anime/{id}")
	public void deleteAnime(@PathVariable long id) {
		animeServ.deleteLogicoAnime(id);
	}

	@PutMapping("/anime/{id}")
	public Anime update(@RequestBody Anime anime, @PathVariable long id) {
		Anime a = animeServ.getAnimeById(id);
		a.setNombre(anime.getNombre());
		a.setSinopsis(anime.getSinopsis());
		a.setEpisodios(anime.getEpisodios());
		a.setProductora(anime.getProductora());
		a.setActivo(anime.getActivo());
		a.setGeneros(anime.getGeneros());
		a.setValidado(anime.getValidado());
		return animeServ.addAnime(a);
	}
}
