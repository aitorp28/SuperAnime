package com.superanime.modelo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.superanime.modelo.dao.Constantes;

@Entity
@Table(name = "usuario")
@NamedQuery(query = Constantes.SQL_USUARIO_FIND_BY_ID, name = "find_usuario_by_id")
public class Usuario {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(unique = true)
	@NotNull
	// @Size(min = 2 , max = 255 , message = "La longitud es muy larga")
	@Size(min = 1, max = 100)
	private String nombre;
	
	@Column(unique = true)
	@NotNull
	// @Size(min = 2 , max = 255 , message = "La longitud es muy larga")
	@Size(min = 3, max = 100)
	private String email;
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}
	
	public Usuario(long id, String nombre, String email) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
