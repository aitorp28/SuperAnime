package com.superanime.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superanime.modelo.entity.Anime;
import com.superanime.modelo.entity.Usuario;
import com.superanime.rest.service.UsuarioService;

@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioServ;
	
	@GetMapping("/usuarios")
	public List<Usuario> listAllUsuarios() {
		return usuarioServ.listAllUsuarios();
	}
	
	@GetMapping("/usuario/{id}")
    public Usuario getUsuarioById(@PathVariable long id) {
    	return usuarioServ.getUsuarioById(id);
    }
	
	@PostMapping("/usuario")
	public Usuario addUsuario(@RequestBody Usuario usuario) {	      		
		return usuarioServ.addUsuario(usuario);
	}
	
	 @DeleteMapping("/usuario/{id}")
	 public void deleteUsuario(@PathVariable long id) {
		 usuarioServ.deleteUsuario(id);
	 }
	
	 @PutMapping("/usuario/{id}")
	 public Usuario update(@RequestBody Usuario usuario,@PathVariable long id) {
		 Usuario u= usuarioServ.getUsuarioById(id);
		u.setNombre(usuario.getNombre());
		u.setEmail(usuario.getEmail());

		return usuarioServ.addUsuario(u);
	 }	
}
