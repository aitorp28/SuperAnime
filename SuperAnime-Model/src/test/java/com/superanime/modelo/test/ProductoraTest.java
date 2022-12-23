package com.superanime.modelo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.entity.Anime;
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
		dao.deleteProductora(productora.getId());
	}

	/************************** metodos TEST **************************************/

	/**
	 * Test method for
	 * {@link com.superanime.modelo.dao.ProductoraDaoImpl#listAllProductoras()}.
	 */
	@Test
	public void testFindAll() {

		assertTrue("por lo menos debe existir Ghibli", dao.listAllProductoras().size() > 0);
	}

	/**
	 * Test method for
	 * {@link com.superanime.modelo.dao.ProductoraDaoImpl#getProductoraById(long)}.
	 */
	@Test
	public void testFindById() {

		// recupero a pepe y compruebo sus campos
		Productora p = dao.getProductoraById(productora.getId());
		assertEquals(PRODUCTORA_NOMBRE, p.getNombre());
		//assertEquals(ANIME_GENERO, p.getGeneros());
		//assertEquals(ANIME_EPISODIOS, p.getEpisodios());
		assertEquals(PRODUCTORA_ACTIVO, p.getActivo());
		//assertEquals(ANIME_VALIDADO, p.getValidado());
		//assertEquals(ANIME_SINOPSIS, p.getSinopsis());
		// comprueba un id que no exista
		assertNull("no debe existir nadie con id == 0", dao.getProductoraById(0));

	}

	/**
	 * Test method for
	 * {@link com.superanime.modelo.dao.ProductoraDaoImpl#addProductora(com.superanime.modelo.entity.Productora))}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testUpdate() throws Exception {

		// cambiar todos los datos y comrpobar que se cambian
		long id = productora.getId();
		String nombre = "Mappa";
		String sinopsis = "El besto estudio de animacion";
		int episodios = 40;
		long validado = 1;
		long activo = 1;

		productora.setNombre(nombre);
		//anime.setValidado(validado);
		//anime.setGeneros(generos);
		//anime.setSinopsis(sinopsis);
		
		//dao.updateAnime(anime);

		Productora anime2 = dao.getProductoraById(id);
		assertEquals(id, anime2.getId());
		assertEquals(nombre, anime2.getNombre());

	}

	/**
	 * Test method for
	 * {@link com.txurdi.persistencia.modelo.dao.PersonaDAO#insert(com.txurdi.persistencia.modelo.pojo.Persona)}.
	 */
	@Test
	public void testInsert() {

		// setUp ya se inserta pepe
		long id = productora.getId();
		assertTrue("el id generado debe ser mayor a 0", id > 0);

		// probar NIF duplicado
		try {
			dao.addProductora(productora);
			fail("deberia haber lanzado excepcion por Nombre duplicado");
		} catch (Exception e) {
			// funciona si lanza exception
			assertTrue(true);
		}

	}

	/**
	 * Test method for
	 * {@link com.txurdi.persistencia.modelo.dao.PersonaDAO#delete(int)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testDelete() throws Exception {
		try {
			dao.deleteProductora(productora.getId());
		}catch(Exception e) {
			System.out.println("Error");
		}
		try {
			dao.deleteProductora(0);
		}catch(Exception e) {
			System.out.println("Error");
		}


	}

}
