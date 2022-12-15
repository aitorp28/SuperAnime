package com.superanime.modelo.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.dao.EntityManagerGestor;
import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.entity.Anime;
import com.superanime.modelo.entity.Productora;

public class ProductoraTest {

	private ProductoraDaoImpl productoradaoimpl;

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
		productoradaoimpl = new ProductoraDaoImpl();

		Productora prueba = new Productora("PRUEBA3", "Ivrea",1);
		productoradaoimpl.addProductora(prueba);
		// Prueba para probar que la WHERE de validado funciona y que se haya realizado
		// la insert correctamente y prueba de borrado logico
		ArrayList<Productora> productoralist = (ArrayList<Productora>) productoradaoimpl.listAllProductoras();
		for (Productora productora : productoralist) {
			assertTrue(productora != null);
			if (productora.getId() == 2) {
				productoradaoimpl.deleteProductora(productora.getId());
			}
		}
		// Prueba de que al hacer la delete pone el activo a 0
		ArrayList<Productora> productoralist1 = (ArrayList<Productora>) productoradaoimpl.listAllProductoras();
		for (Productora productora : productoralist1) {
			assertTrue(productora != null);
			System.out.println("Id: " + productora.getId() + " activo:" + productora.getActivo());
		}
		// Prueba para probar la update
		EntityManager em = EntityManagerGestor.crearEntityManager();

		em.getTransaction().begin();

		Productora a = em.find(Productora.class, new Long(2));
		System.out.println("Nombre al inicio: "+a.getNombre());
		a.setNombre("Naoki Urasawa");
		productoradaoimpl.updateProductora(a);
		System.out.println("Nombre tras actualizar: "+em.find(Productora.class, new Long(2)).getNombre());

		em.close();

	}

}
