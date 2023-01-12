package com.superanime.modelo.dao;

import java.util.ArrayList;
import java.util.List;

import com.superanime.modelo.entity.Anime;

public interface AnimeDao {
	
	public abstract ArrayList<Anime> listAllAnimesCliente();

	public abstract ArrayList<Anime> listAllAnimesAdmin();
	
	public abstract ArrayList<Anime> listAnimesUser(long id);

	public abstract ArrayList<Anime> listAnimesByNombre(String nombre);

	public abstract ArrayList<Anime> listAnimesByProductora(long id);

	public abstract List<Anime> findFilterByName(String name);

	public abstract Anime addAnime(Anime anime);

	public abstract boolean deleteLogicoAnime(long id);

	public abstract void updateAnime(Anime anime);

	public abstract Anime getAnimeById(long id);
	
	public abstract boolean existeNombre(String nombre);
}
