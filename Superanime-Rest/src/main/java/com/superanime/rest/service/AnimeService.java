package com.superanime.rest.service;

import java.util.ArrayList;

import com.superanime.modelo.entity.Anime;

public interface AnimeService {

	public abstract ArrayList<Anime> listAllAnimes();

	public abstract Anime addAnime(Anime anime);

	public abstract void deleteAnime(long id);

	public abstract void updateAnime(Anime anime);

	public abstract Anime getAnimeById(long id);
	
}
