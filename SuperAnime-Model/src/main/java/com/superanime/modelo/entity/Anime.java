package com.superanime.modelo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

@Entity
@Table(name="anime")
@NamedQuery(query = Constantes.SQL_ANIME_FIND_BY_ID, name = "find_anime_by_id")
public class Anime {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	@NotNull
	//@Size(min = 2 , max = 255 , message = "La longitud es muy larga")
	@Size(min = 1 , max = 100)
	private String nombre;
	@Column
	@NotNull
	//@Size(min = 2 , max = 255 , message = "La longitud es muy larga")
	@Size(min = 1 , max = 50)
	private String generos;
	@Column
	@NotNull
	//@Size(min = 2 , max = 255 , message = "La longitud es muy larga")
	@Size(min = 1 , max = 200)
	private String sinopsis;
	@Column
	@NotNull
	@NotEmpty
	private int episodios;
	@ManyToOne
	@JoinColumn(name = "id_productora")
	//@Valid //sirve para validar en cascada cuando se valida este objeto
	private Productora productora;
	//@Column
	//@NotNull
	//@Size(min = 2 , max = 255 , message = "La longitud es muy larga")
	//@Size(min = 1 , max = 50 , message = "La longitud es muy larga")
	//private Date fecha_lanazamiento;
	
	@Column
	@NotNull
	@NotEmpty
	private long validado;
	
	@Column
	@NotNull
	@NotEmpty
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
	}
	
	public Anime(String nombre, String generos, String sinopsis, int episodios, Productora productora, long validado,
			long activo) {
		super();
		this.nombre = nombre;
		this.generos = generos;
		this.sinopsis = sinopsis;
		this.episodios = episodios;
		this.productora = productora;
		this.validado = validado;
		this.activo = activo;
	}

	public Anime(long id, String nombre, String generos, String sinopsis, int episodios, Productora productora,
			long validado, long activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.generos = generos;
		this.sinopsis = sinopsis;
		this.episodios = episodios;
		this.productora = productora;
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
	
}
