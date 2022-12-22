package com.superanime.modelo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.superanime.modelo.dao.Constantes;

@Entity
@Table(name = "productora")
@NamedQuery(query = Constantes.SQL_PRODUCTORA_FIND_BY_ID, name = "find_productora_by_id")
public class Productora {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(unique = true)
	@NotNull
	// @Size(min = 2 , max = 255 , message = "La longitud es muy larga")
	@Size(min = 1, max = 100)
	private String nombre;

	@Column
	@NotNull
	// @Size(min = 2 , max = 255 , message = "La longitud es muy larga")
	@Size(min = 1, max = 200)
	private String descripcion;
	
	@JsonIgnore
	@OneToMany(mappedBy = "productora",fetch=FetchType.EAGER)
	private Set<Anime> animes;

	@Column
	@NotNull
	@NotEmpty
	private long activo;

	public Productora() {
		super();
		this.id = 0;
		this.nombre = "";
		this.descripcion = "";
		this.animes = new HashSet<Anime>();
		this.activo = 0;
	}
	public Productora(long id) {
		super();
		this.id = id;
	}
	
	public Productora(String nombre, String descripcion, long activo) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.activo = activo;
	}
	
	public Productora(String nombre, String descripcion, Set<Anime> animes, long activo) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.animes = animes;
		this.activo = activo;
	}

	public Productora(long id, String nombre, String descripcion, Set<Anime> animes, long activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.animes = animes;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Anime> getAnimes() {
		return animes;
	}

	public void setAnimes(Set<Anime> animes) {
		this.animes = animes;
	}

	public long getActivo() {
		return activo;
	}

	public void setActivo(long activo) {
		this.activo = activo;
	}

}
