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

	@Override
	public ArrayList<Anime> listAllAnimesCliente() {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.listAllAnimesCliente();
	}

	@Override
	public ArrayList<Anime> listAllAnimesAdmin() {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.listAllAnimesAdmin();
	}

	@Override
	public ArrayList<Anime> listAnimesUser(long id) {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.listAnimesUser(id);
	}

	@Override
	public ArrayList<Anime> listAnimesByNombre(String nombre) {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.listAnimesByNombre(nombre);
	}

	@Override
	public ArrayList<Anime> listAnimesByProductora(long id) {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.listAnimesByProductora(id);
	}

	@Override
	public List<Anime> findFilterByName(String name) {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.findFilterByName(name);
	}

	@Override
	public Anime addAnime(Anime anime) {

		Anime a = null;

		animeDao = AnimeDaoImpl.getInstance();

		if (!animeDao.existeNombre(anime.getNombre())) {
			a = animeDao.addAnime(anime);
		}

		return a;
	}

	@Override
	public boolean deleteLogicoAnime(long id) {

		animeDao = AnimeDaoImpl.getInstance();
		
		return animeDao.deleteLogicoAnime(id);
	}

	@Override
	public void updateAnime(Anime anime) {
		
		animeDao = AnimeDaoImpl.getInstance();
			
		animeDao.updateAnime(anime);
		
	}

	@Override
	public Anime getAnimeById(long id) {

		animeDao = AnimeDaoImpl.getInstance();

		return animeDao.getAnimeById(id);
	}

}
