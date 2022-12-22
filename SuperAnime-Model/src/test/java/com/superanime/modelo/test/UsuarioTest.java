package com.superanime.modelo.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.dao.EntityManagerGestor;
import com.superanime.modelo.dao.UsuarioDaoImpl;
import com.superanime.modelo.entity.Anime;
import com.superanime.modelo.entity.Usuario;

public class UsuarioTest {

	private UsuarioDaoImpl usuariodaoimpl;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		/*
		usuariodaoimpl = new UsuarioDaoImpl();
		// Prueba para listar todos los usuarios
		ArrayList<Usuario> usuariolist = (ArrayList<Usuario>) usuariodaoimpl.listAllUsuarios();
		Usuario u = new Usuario("IDPRUEBA4", "aaaaaaaaaa@gmail.com");
		for (Usuario usuario : usuariolist) {
			System.out.println("Email: " + usuario.getEmail());
			if(usuario.getNombre().equals(u.getNombre())|| usuario.getEmail().equals(u.getEmail())) {
				usuariodaoimpl.addUsuario(u);
				System.out.println("El ID del objeto es: " + u.getId());
			}
		}
		*/
	}

	@Test
	public void testSelectAll() {
		/*
		// Prueba para listar todos los usuarios
		ArrayList<Usuario> usuariolist = (ArrayList<Usuario>) usuariodaoimpl.listAllUsuarios();
		for (Usuario usuario : usuariolist) {
			System.out.println("Email: " + usuario.getEmail());
		}
		*/
	}

	@Test
	public void testInsert() {
		/*
		 * usuariodaoimpl = new UsuarioDaoImpl(); Usuario u= new
		 * Usuario("Prueba545555","prueba5454556@gmail.com");
		 * usuariodaoimpl.addUsuario(u);
		 * 
		 * assertTrue(usuariodaoimpl.getUsuarioById(new Long(1))!=null);
		 * 
		 * usuariodaoimpl.updateUsuario(usu);
		 */

	}
}
