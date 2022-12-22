package com.superanime.modelo.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.entity.Anime;
import com.superanime.modelo.entity.Productora;


/**
 * @author Oskar Llaguno
 *
 */
public class AnimeTest {

	static AnimeDaoImpl dao = null;
	static ProductoraDaoImpl daop = null;
	// objeto mock para pruebas
	static Anime anime = null;
	static final String ANIME_NOMBRE = "Persona 5";
	static final String ANIME_GENERO = "Accion,Ficcion";
	static final String ANIME_SINOPSIS = "Despiertan los corazones de la gente";
	static final int ANIME_EPISODIOS = 40;
	static final long ANIME_VALIDADO = 1;
	static final long ANIME_ACTIVO = 1;
	static  Productora ANIME_PRODUCTORA = new Productora();
	/**
	 * Antes de empezar los metodos de test
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		dao = AnimeDaoImpl.getInstance();
		daop = ProductoraDaoImpl.getInstance();
	}

	/**
	 * Al finalizar todos los metodos de test
	 * 
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao = null;
		daop=null;
	}

	/**
	 * antes de cada test creamos a "pepe", en este caso tenemos 4
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		anime = new Anime();
		anime.setNombre(ANIME_NOMBRE);
		anime.setGeneros(ANIME_GENERO);
		anime.setEpisodios(ANIME_EPISODIOS);
		ANIME_PRODUCTORA=daop.getProductoraById(3);
		anime.setProductora(ANIME_PRODUCTORA);
		anime.setActivo(ANIME_ACTIVO);
		anime.setValidado(ANIME_VALIDADO);
		anime.setSinopsis(ANIME_SINOPSIS);
		dao.addAnime(anime);

	}

	/**
	 * Despues de cada test lo eliminamos, en este caso tenemos 4
	 * 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {

		dao.deleteAnime(anime.getId());
	}

	/************************** metodos TEST **************************************/

	/**
	 * Test method for
	 * {@link com.superanime.modelo.dao.AnimeDaoImpl.PersonaDAO#findAll()}.
	 */
	@Test
	public void testFindAll() {

		assertTrue("por lo menos debe existir Persona 5", dao.listAllAnimes().size() > 0);
	}

	/**
	 * Test method for
	 * {@link com.txurdi.persistencia.modelo.dao.PersonaDAO#findById(int)}.
	 */
	@Test
	public void testFindById() {

		// recupero a pepe y compruebo sus campos
		Anime a = dao.getAnimeById(anime.getId());
		assertEquals(ANIME_NOMBRE, a.getNombre());
		assertEquals(ANIME_GENERO, a.getGeneros());
		assertEquals(ANIME_EPISODIOS, a.getEpisodios());
		assertEquals(ANIME_ACTIVO, a.getActivo());
		assertEquals(ANIME_VALIDADO, a.getValidado());
		assertEquals(ANIME_SINOPSIS, a.getSinopsis());
		assertEquals(ANIME_PRODUCTORA.getId(), a.getProductora().getId());
		// comprueba un id que no exista
		assertNull("no debe existir nadie con id == 0", dao.getAnimeById(0));

	}

	/**
	 * Test method for
	 * {@link com.txurdi.persistencia.modelo.dao.PersonaDAO#update(com.txurdi.persistencia.modelo.pojo.Persona)}.
	 * 
	 * @throws Exception
	 */
	@Test
	public void testUpdate() throws Exception {

		// cambiar todos los datos y comrpobar que se cambian
		long id = anime.getId();
		String nombre = "Persona 4";
		String generos = "Accion,Ficcion";
		String sinopsis = "Despiertan los corazones de la gente";
		int episodios = 40;
		long validado = 1;
		long activo = 1;

		anime.setEpisodios(episodios);
		anime.setActivo(activo);
		anime.setNombre(nombre);
		anime.setValidado(validado);
		anime.setGeneros(generos);
		anime.setSinopsis(sinopsis);
		
		dao.updateAnime(anime);

		Anime anime2 = dao.getAnimeById(id);
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
		long id = anime.getId();
		assertTrue("el id generado debe ser mayor a 0", id > 0);

		// probar NIF duplicado
		try {
			dao.addAnime(anime);
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
			dao.deleteAnime(anime.getId());
		}catch(Exception e) {
			System.out.println("Error");
		}
		try {
			dao.deleteAnime(0);
		}catch(Exception e) {
			System.out.println("Error");
		}


	}

}
