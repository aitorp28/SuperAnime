package com.superanime.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.dao.UsuarioDaoImpl;
import com.superanime.modelo.entity.Usuario;

@Service("usuarioservice")
public class UsuarioServiceImpl implements UsuarioService {

	// @Autowired
	private UsuarioDaoImpl usuarioDao;

	@Override
	public List<Usuario> listAllUsuarios() {
		usuarioDao = UsuarioDaoImpl.getInstance();
		return usuarioDao.listAllUsuarios();

	}

	@Override
	public Usuario addUsuario(Usuario usuario) {
		usuarioDao = UsuarioDaoImpl.getInstance();
		return usuarioDao.addUsuario(usuario);

	}

	@Override
	public void deleteUsuario(long id) {
		usuarioDao = UsuarioDaoImpl.getInstance();
		usuarioDao.deleteUsuario(id);

	}

	@Override
	public void updateUsuario(Usuario usuario) {
		usuarioDao = UsuarioDaoImpl.getInstance();
		usuarioDao.updateUsuario(usuario);

	}

	@Override
	public Usuario getUsuarioById(long id) {
		usuarioDao = UsuarioDaoImpl.getInstance();
		return usuarioDao.getUsuarioById(id);

	}

}
