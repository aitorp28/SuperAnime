package com.superanime.modelo.dao;

public class Constantes {
	//Anime
	public static final String SQL_ANIME_FIND_ALL="SELECT a FROM Anime a WHERE a.validado = 1";
	public static final String SQL_ANIME_FIND_BY_ID="SELECT a FROM Anime a WHERE a.id = :id";
	
	//Productora
	public static final String SQL_PRODUCTORA_FIND_ALL="SELECT p FROM Productora p";
	public static final String SQL_PRODUCTORA_FIND_BY_ID="SELECT p FROM Productora p WHERE p.id = :id";
	
	//Usuario
	public static final String SQL_USUARIO_FIND_ALL="SELECT u FROM Usuario u";
	public static final String SQL_USUARIO_FIND_BY_ID="SELECT u FROM Usuario u WHERE u.id = :id";
}
