package com.superanime.modelo.dao;

public class Constantes {

	// Anime
	public static final String SQL_ANIME_FIND_ALL_VALIDADOS_ACTIVOS = "SELECT a FROM Anime a WHERE a.validado = 1 AND a.activo = 1 ORDER BY a.nombre";
	public static final String SQL_ANIME_FIND_ALL_VALIDADOS_USUARIO = "SELECT a FROM Anime a WHERE a.activo = 1 AND a.usuario.id = :usuario";
	public static final String SQL_ANIME_FIND_ALL = "SELECT a FROM Anime a WHERE 1=1";
	public static final String SQL_ANIME_FIND_BY_ID = "SELECT a FROM Anime a WHERE a.id = :id";
	public static final String SQL_ANIME_FIND_BY_NOMBRE = "SELECT a FROM Anime a WHERE a.nombre = :nombre";
	public static final String SQL_ANIME_FIND_LIKE_NOMBRE = "SELECT a FROM Anime a WHERE a.nombre LIKE :nombre";
	public static final String SQL_ANIME_FIND_BY_PRODUCTORA = "SELECT a FROM Anime a WHERE a.activo=1 AND a.validado=1 AND a.productora.id = :idproductora";
	public static final String SQL_ANIME_FIND_BY_NO_VALIDADO = "SELECT a FROM Anime a WHERE a.validado = 0";
	public static final String SQL_ANIME_FIND_BY_VALIDADO = "SELECT a FROM Anime a WHERE a.validado = 1";

	// Productora
	public static final String SQL_PRODUCTORA_FIND_ALL = "SELECT p FROM Productora p WHERE 1 = 1";
	public static final String SQL_PRODUCTORA_FIND_BY_ID = "SELECT p FROM Productora p WHERE p.id = :id";
	public static final String SQL_PRODUCTORA_FIND_BY_NOMBRE = "SELECT p FROM Productora p WHERE p.nombre = :nombre";
	public static final String SQL_PRODUCTORA_FIND_LIKE__NOMBRE = "SELECT p FROM Productora p WHERE p.nombre LIKE :nombre";
	
	// Usuario
	public static final String SQL_COMPROBAR_USUARIO = "SELECT u FROM Usuario u WHERE u.email = :email AND u.password = :password";
}
