package com.superanime.rest.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.superanime.modelo.dao.AnimeDao;
import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.entity.Anime;

@Service("animeservice")
public class AnimeServiceImpl implements AnimeService {
	
	//@Autowired
	private AnimeDaoImpl animeDao;

	@Override
	public ArrayList<Anime> listAllAnimes() {
		animeDao=new AnimeDaoImpl();
		return animeDao.listAllAnimes();
	
	}

	@Override
	public Anime addAnime(Anime anime) {
		
		return animeDao.addAnime(anime);
	
	}

	@Override
	public void deleteAnime(long id) {
		
		animeDao.deleteAnime(id);
		
	}

	@Override
	public void updateAnime(Anime anime) {

		animeDao.updateAnime(anime);
		
	}

	@Override
	public Anime getAnimeById(long id) {

		return animeDao.getAnimeById(id);
	
	}

}
