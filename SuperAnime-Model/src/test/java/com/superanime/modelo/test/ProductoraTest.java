package com.superanime.modelo.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.entity.Productora;
/**
 * 
 * @author Oskar
 * Test para probar el CRUD de Productora
 */
public class ProductoraTest {

	static ProductoraDaoImpl dao = null;
	// objeto mock para pruebas
	static Productora productora = null;
	static final String PRODUCTORA_NOMBRE = "Ghibli";
	static final String PRODUCTORA_DESCRIPCION = "Uno de los mejores estudios de animacion";
	static final long PRODUCTORA_ACTIVO = 1;
	
	/**
	 * Antes de empezar los metodos de test
	 * 
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = ProductoraDaoImpl.getInstance();
		productora = new Productora();
	}
	/**
	 * Al finalizar todos los metodos de test
	 * 
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao = null;
	}
	@Test
	public void test() {
		dao.deleteLogicoProductora(1);
		dao.updateProductora(dao.getProductoraById(1));
		System.out.println(dao.findFilterByName("p").size());
		System.out.println(dao.listAllProductoras().size());
		System.out.println(dao.existeNombre("Mappa"));
	}
	/**
	 * Antes de cada test creamos una productora
	 * 
	 * @throws java.lang.Exception
	 */
//	@Before
//	public void setUp() throws Exception {		
//		productora.setActivo(PRODUCTORA_ACTIVO);
//		productora.setDescripcion(PRODUCTORA_DESCRIPCION);
//		productora.setNombre(PRODUCTORA_NOMBRE);
//		if(!dao.existeNombre(productora.getNombre())) {
//			dao.addProductora(productora);
//		}else {
//			if(dao.findFilterByName(PRODUCTORA_NOMBRE)!=null && dao.findFilterByName(PRODUCTORA_NOMBRE).size()>0) {
//				productora.setId(dao.findFilterByName(PRODUCTORA_NOMBRE).get(0).getId());
//			}
//		}
//		
//	}
//	/**
//	 * Despues de cada test lo eliminamos
//	 * 
//	 * @throws java.lang.Exception
//	 */
//	@After
//	public void tearDown() throws Exception {
//		dao.deleteLogicoProductora(productora.getId());
//	}
//
//	/************************** metodos TEST **************************************/
//
//	/**
//	 * Test method for
//	 * {@link com.superanime.modelo.dao.ProductoraDaoImpl#listAllProductoras()}.
//	 */
//	@Test
//	public void testFindAllActivo() {
//
//		assertTrue("deberia haber estar como minimo Mappa", dao.listAllProductoras().size() == 0);
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.superanime.modelo.dao.ProductoraDaoImpl#getProductoraById(long)}.
//	 */
//	@Test
//	public void testFindById() {
//
//		// recupero a pepe y compruebo sus campos
//		Productora p = dao.getProductoraById(productora.getId());
//		if(p!=null) {
//			assertEquals(PRODUCTORA_NOMBRE, p.getNombre());
//			assertEquals(1, p.getActivo());
//			assertEquals(PRODUCTORA_DESCRIPCION, p.getDescripcion());
//		}		
//		// comprueba un id que no exista
//		assertNull("no debe existir nadie con id == 0", dao.getProductoraById(0));
//
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.superanime.modelo.dao.ProductoraDaoImpl#updateProductora(com.superanime.modelo.entity.Productora)}.
//	 * 
//	 * @throws Exception
//	 */
//	@Test
//	public void testUpdate() throws Exception {
//
//		// cambiar todos los datos y comrpobar que se cambian
//		long id = productora.getId();
//		String nombre = "Mappa";
//		String descripcion = "El besto estudio de animacion";
//		long activo = 1;
//
//		//productora.setNombre(nombre);
//		productora.setActivo(activo);
//		productora.setDescripcion(descripcion);
//		
//		
//		//if(dao.existeNombre(productora.getNombre())) {
//			dao.updateProductora(productora);
//		//}
//			Productora productora = dao.getProductoraById(id);
//			assertEquals(id, productora.getId());
//			assertEquals(descripcion, productora.getDescripcion());
//		//	assertEquals(nombre, productora.getNombre());
//			assertEquals(activo, productora.getActivo());		
//	}
//
//	/**
//	 * Test method for
//	 * {@link com.superanime.modelo.dao.ProductoraDaoImpl#addProductora(com.superanime.modelo.entity.Productora)}
//	 */
//	@Test
//	public void testInsert() {
//
//		// probar nombre duplicado
//		try {
//			dao.addProductora(productora);
//			fail("deberia haber lanzado excepcion por Nombre duplicado");
//		} catch (Exception e) {
//			// funciona si lanza exception
//			assertTrue(true);
//		}
//
//	}

}
