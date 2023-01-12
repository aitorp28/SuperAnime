package com.superanime.modelo.entity;

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
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.superanime.modelo.dao.Constantes;

@Entity
@Table(name = "usuario")
@NamedQuery(query = Constantes.SQL_COMPROBAR_USUARIO, name = "comprobar_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(unique = true)
	@NotNull
	private String email;
	
	@Column
	@NotNull
	private String password;

	@Column
	private String perfil;
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario",fetch=FetchType.EAGER)
	private Set<Anime> animes;

	public Usuario() {
		super();
		this.id = 0;
		this.email = "";
		this.perfil = "";
		this.password = "";
	}

	public Usuario(String email, String password,String perfil) {
		super();
		this.email = email;
		this.perfil = perfil;
		this.password = password;
	}
	public Usuario(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
