package com.superanime.modelo.dao;

import com.superanime.modelo.entity.Usuario;

public interface UsuarioDao {


	public abstract Usuario comprobarUsuario(String email,String password);
	
}
