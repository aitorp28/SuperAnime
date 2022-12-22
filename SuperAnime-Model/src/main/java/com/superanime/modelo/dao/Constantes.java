package com.superanime.modelo.dao;

public class Constantes {
	//Anime
	public static final String SQL_ANIME_FIND_ALL_VALIDADOS_ACTIVOS="SELECT a FROM Anime a WHERE a.validado = 1 AND a.activo = 1";
	public static final String SQL_ANIME_FIND_ALL_VALIDADOS="SELECT a FROM Anime a WHERE a.validado = 1";
	public static final String SQL_ANIME_FIND_ALL="SELECT a FROM Anime a WHERE 1=1";
	public static final String SQL_ANIME_FIND_BY_ID="SELECT a FROM Anime a WHERE a.id = :id";
	public static final String SQL_ANIME_FIND_BY_NAME="SELECT a FROM Anime a WHERE a.nombre = :nombre";
	public static final String SQL_ANIME_FIND_BY_GENERO="SELECT a FROM Anime a WHERE a.genero = :genero";
	public static final String SQL_ANIME_FIND_BY_EPISODIOS="SELECT a FROM Anime a WHERE a.episodios = :genero";
	public static final String SQL_ANIME_FIND_BY_PRODUCTORA="SELECT a FROM Anime a WHERE a.productora.id = :id";
	
	//Productora
	public static final String SQL_PRODUCTORA_FIND_ALL="SELECT p FROM Productora p";
	public static final String SQL_PRODUCTORA_FIND_BY_ID="SELECT p FROM Productora p WHERE p.id = :id";
	public static final String SQL_PRODUCTORA_FIND_BY_NAME="SELECT pFROM Productora p WHERE p.nombre = :nombre";
	
	//Usuario
	public static final String SQL_USUARIO_FIND_ALL="SELECT u FROM Usuario u";
	public static final String SQL_USUARIO_FIND_BY_ID="SELECT u FROM Usuario u WHERE u.id = :id";
}
