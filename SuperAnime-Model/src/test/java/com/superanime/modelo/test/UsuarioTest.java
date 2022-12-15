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
		usuariodaoimpl = new UsuarioDaoImpl();
		// Prueba para listar todos los usuarios
		ArrayList<Usuario> usuariolist = (ArrayList<Usuario>) usuariodaoimpl.listAllUsuarios();
		for (Usuario usuario : usuariolist) {
			assertTrue(usuario != null);
			System.out.println("Email: "+usuario.getEmail());
		}
		Usuario usu = usuariodaoimpl.getUsuarioById(new Long(0));
		System.out.println("Usuario email: "+usu.getEmail());
	}

}
