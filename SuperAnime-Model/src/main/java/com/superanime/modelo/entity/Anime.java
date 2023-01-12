package com.superanime.modelo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.superanime.modelo.dao.Constantes;

/**
 * 
 * @author Oskar LLaguno
 *
 */
@Entity
@Table(name = "anime")
@NamedQuery(query = Constantes.SQL_ANIME_FIND_BY_ID, name = "find_anime_by_id")
@NamedQuery(query = Constantes.SQL_ANIME_FIND_BY_NOMBRE, name = "find_anime_by_nombre")
@NamedQuery(query = Constantes.SQL_ANIME_FIND_BY_PRODUCTORA, name = "find_anime_by_productora")
@NamedQuery(query = Constantes.SQL_ANIME_FIND_ALL_VALIDADOS_USUARIO, name = "find_anime_by_usuario")
@NamedQuery(query = Constantes.SQL_ANIME_FIND_LIKE_NOMBRE, name = "find_anime_by_like_nombre")
public class Anime {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	@NotNull
	@Size(min = 1, max = 100)
	private String nombre;

	@Column
	@NotNull
	@Size(min = 1, max = 50)
	private String generos;

	@Column
	@NotNull
	@Size(min = 1, max = 200)
	private String sinopsis;
	@Column
	@NotNull
	@NotEmpty
	private int episodios;

	@ManyToOne
	@JoinColumn(name = "id_productora")
	private Productora productora;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@Column
	private long validado;

	@Column
	private long activo;

	public Anime() {
		super();
		this.id = 0;
		this.nombre = "";
		this.generos = "";
		this.sinopsis = "";
		this.episodios = 0;
		this.productora = new Productora();
		this.validado = 0;
		this.activo = 0;
		this.usuario = new Usuario();
	}

	public Anime(String nombre, String generos, String sinopsis, int episodios, Productora productora, Usuario usuario,
			long validado, long activo) {
		super();
		this.nombre = nombre;
		this.generos = generos;
		this.sinopsis = sinopsis;
		this.episodios = episodios;
		this.productora = productora;
		this.usuario = usuario;
		this.validado = validado;
		this.activo = activo;
	}

	public Anime(long id, String nombre, String generos, String sinopsis, int episodios, Productora productora,
			Usuario usuario, long validado, long activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.generos = generos;
		this.sinopsis = sinopsis;
		this.episodios = episodios;
		this.productora = productora;
		this.usuario = usuario;
		this.validado = validado;
		this.activo = activo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGeneros() {
		return generos;
	}

	public void setGeneros(String generos) {
		this.generos = generos;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public int getEpisodios() {
		return episodios;
	}

	public void setEpisodios(int episodios) {
		this.episodios = episodios;
	}

	public Productora getProductora() {
		return productora;
	}

	public void setProductora(Productora productora) {
		this.productora = productora;
	}

	public long getValidado() {
		return validado;
	}

	public void setValidado(long validado) {
		this.validado = validado;
	}

	public long getActivo() {
		return activo;
	}

	public void setActivo(long activo) {
		this.activo = activo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
