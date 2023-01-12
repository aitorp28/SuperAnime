package com.superanime.modelo.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.entity.Anime;
import com.superanime.modelo.entity.Productora;
import com.superanime.modelo.entity.Usuario;


/**
 * @author Oskar Llaguno
 * Test para probar el CRUD de Anime
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
	@Test
	public void testUpdate() throws Exception {
//		Usuario u= dao.getAnimeById(1).getUsuario();
//		Productora p = dao.getAnimeById(1).getProductora();
//		//System.out.println(u.getPerfil());
//		//System.out.println(p.getAnimes().size());
//		System.out.println(dao.listAnimesUser(1).size());
//		System.out.println(dao.listAllAnimesAdmin().size());
//		System.out.println(dao.listAllAnimesCliente().size());
//		System.out.println(dao.listAnimesByProductora(1).size());
//		System.out.println(dao.listAnimesByProductora(1).get(0).getNombre());
//		System.out.println(dao.listAnimesUser(1).get(0).getUsuario().getEmail());
//		dao.deleteLogicoAnime(1);
	}
//	/**
//	 * Al finalizar todos los metodos de test
//	 * 
//	 * @throws java.lang.Exception
//	 */
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//		dao = null;
//		daop=null;
//	}
//
//	/**
//	 * Antes de cada test creamos un anime y una productora
//	 * 
//	 * @throws java.lang.Exception
//	 */
//	@Before
//	public void setUp() throws Exception {
//
//		anime = new Anime();
//		anime.setNombre(ANIME_NOMBRE);
//		anime.setGeneros(ANIME_GENERO);
//		anime.setEpisodios(ANIME_EPISODIOS);
//		ANIME_PRODUCTORA=daop.getProductoraById(53);
//		anime.setProductora(ANIME_PRODUCTORA);
//		anime.setActivo(ANIME_ACTIVO);
//		anime.setValidado(ANIME_VALIDADO);
//		anime.setSinopsis(ANIME_SINOPSIS);
//		dao.addAnime(anime);
//
//	}
//
//	/**
//	 * Despues de cada test lo eliminamos
//	 * 
//	 * @throws java.lang.Exception
//	 */
//	@After
//	public void tearDown() throws Exception {
//
//		dao.deleteAnime(anime.getId());
//	}
//
//	/************************** metodos TEST **************************************/
//
//	/**
//	 * Test method for
//	 * {@link com.superanime.modelo.dao.AnimeDaoImpl#listAllAnimes()}.
//	 */
//	@Test
//	public void testFindAll() {
//
//		assertTrue("por lo menos debe existir Persona 5", dao.listAllAnimesCliente().size() > 0);
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.superanime.modelo.dao.AnimeDaoImpl#getAnimeById(long)}.
//	 */
//	@Test
//	public void testFindById() {
//
//		// recupero el anime y compruebo sus campos
//		Anime a = dao.getAnimeById(anime.getId());
//		assertEquals(ANIME_NOMBRE, a.getNombre());
//		assertEquals(ANIME_GENERO, a.getGeneros());
//		assertEquals(ANIME_EPISODIOS, a.getEpisodios());
//		assertEquals(ANIME_ACTIVO, a.getActivo());
//		assertEquals(ANIME_VALIDADO, a.getValidado());
//		assertEquals(ANIME_SINOPSIS, a.getSinopsis());
//		assertEquals(ANIME_PRODUCTORA.getId(), a.getProductora().getId());
//		// comprueba un id que no exista
//		assertNull("no debe existir nadie con id == 0", dao.getAnimeById(0));
//
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.superanime.modelo.dao.AnimeDaoImpl#updateAnime(com.superanime.modelo.entity.Anime)}.
//	 * 
//	 * @throws Exception
//	 */
//	@Test
//	public void testUpdate() throws Exception {
//
//		// cambiar todos los datos y comprobar que se cambian
//		long id = anime.getId();
//		String nombre = "Persona 4";
//		String generos = "Accion,Ficcion";
//		String sinopsis = "Despiertan los corazones de la gente";
//		int episodios = 40;
//		long validado = 1;
//		long activo = 1;
//
//		anime.setEpisodios(episodios);
//		anime.setActivo(activo);
//		anime.setNombre(nombre);
//		anime.setValidado(validado);
//		anime.setGeneros(generos);
//		anime.setSinopsis(sinopsis);
//		
//		dao.updateAnime(anime);
//
//		Anime anime2 = dao.getAnimeById(id);
//		assertEquals(id, anime2.getId());
//		assertEquals(nombre, anime2.getNombre());
//
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.superanime.modelo.dao.AnimeDaoImpl#addAnime(com.superanime.modelo.entity.Anime)}.
//	 */
//	@Test
//	public void testInsert() {
//
//		// En setUp ya se inserta el anime
//		long id = anime.getId();
//		assertTrue("el id generado debe ser mayor a 0", id > 0);
//
//		// probar nombre duplicado
//		try {
//			dao.addAnime(anime);
//			fail("deberia haber lanzado excepcion por Nombre duplicado");
//		} catch (Exception e) {
//			// funciona si lanza exception
//			assertTrue(true);
//		}
//
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.txurdi.persistencia.modelo.dao.PersonaDAO#delete(int)}.
//	 * 
//	 * @throws Exception
//	 */
//	@Test
//	public void testDelete() throws Exception {
//		try {
//			dao.deleteAnime(anime.getId());
//		}catch(Exception e) {
//			System.out.println("Error");
//		}
//		try {
//			dao.deleteAnime(0);
//		}catch(Exception e) {
//			System.out.println("Error");
//		}
//
//
//	}

}
