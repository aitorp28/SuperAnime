package com.superanime.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.superanime.modelo.dao.UsuarioDaoImpl;
import com.superanime.modelo.entity.Usuario;

@Service("usuarioservice")
public class UsuarioServiceImpl implements UsuarioService {

	// @Autowired
	private UsuarioDaoImpl usuarioDao;

	@Override
	public List<Usuario> listAllUsuarios() {
		usuarioDao = new UsuarioDaoImpl();
		return usuarioDao.listAllUsuarios();

	}

	@Override
	public Usuario addUsuario(Usuario usuario) {
		usuarioDao = new UsuarioDaoImpl();
		return usuarioDao.addUsuario(usuario);

	}

	@Override
	public void deleteUsuario(long id) {
		usuarioDao = new UsuarioDaoImpl();
		usuarioDao.deleteUsuario(id);

	}

	@Override
	public void updateUsuario(Usuario usuario) {
		usuarioDao = new UsuarioDaoImpl();
		usuarioDao.updateUsuario(usuario);

	}

	@Override
	public Usuario getUsuarioById(long id) {
		usuarioDao = new UsuarioDaoImpl();
		return usuarioDao.getUsuarioById(id);

	}

}
