package com.superanime.modelo.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.superanime.modelo.dao.UsuarioDaoImpl;
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

//	@Test
//	public void test() {
//		
//		usuariodaoimpl = UsuarioDaoImpl.getInstance();
//
//		assertFalse(usuariodaoimpl.comprobarUsuario("oskarf4k3@gmail.com","paco") != null);
//		assertFalse(usuariodaoimpl.comprobarUsuario("paco@gmail.com","aaa") != null);
//		if(usuariodaoimpl.comprobarUsuario("oskarf4k3@gmail.com","paco")!=null) {
//			Usuario u = usuariodaoimpl.comprobarUsuario("oskarf4k3@gmail.com","paco");
//			System.out.println(u.getPerfil());
//		}
//		
//	}
}
