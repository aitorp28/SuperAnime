package com.superanime.modelo.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.entity.Productora;
/**
 * 
 * @author Oskar
 *
 */
public class ProductoraTest {

	static ProductoraDaoImpl dao = null;
	static Productora productora = null;
	static final String PRODUCTORA_NOMBRE = "Ghibli";
	static final String PRODUCTORA_DESCRIPCION = "Uno de los mejores estudios de animacion";
	static final long PRODUCTORA_ACTIVO = 1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = ProductoraDaoImpl.getInstance();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao = null;
	}

	@Before
	public void setUp() throws Exception {
		productora = new Productora();
		productora.setActivo(PRODUCTORA_ACTIVO);
		productora.setDescripcion(PRODUCTORA_DESCRIPCION);
		productora.setNombre(PRODUCTORA_NOMBRE);
		dao.addProductora(productora);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

	}

}
