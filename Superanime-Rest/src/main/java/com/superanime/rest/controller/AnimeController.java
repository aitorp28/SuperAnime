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
	
	@GetMapping("/animes")
	public List<Anime> listAllAnimes() {
		return animeServ.listAllAnimes();
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
		 animeServ.deleteAnime(id);
	 }
	
	 @PutMapping("/anime/{id}")
	 public Anime update(@RequestBody Anime anime,@PathVariable long id) {
		 Anime a= animeServ.getAnimeById(id);
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
