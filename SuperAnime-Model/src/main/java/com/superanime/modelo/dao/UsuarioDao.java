package com.superanime.modelo.dao;

import java.util.List;

import com.superanime.modelo.entity.Usuario;

public interface UsuarioDao {

	public abstract List<Usuario> listAllUsuarios();

	public abstract Usuario addUsuario(Usuario usuario);

	public abstract void deleteUsuario(long id);

	public abstract void updateUsuario(Usuario usuario);

	public abstract Usuario getUsuarioById(long id);
}
