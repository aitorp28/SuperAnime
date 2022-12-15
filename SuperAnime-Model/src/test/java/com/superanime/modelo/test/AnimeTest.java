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

public class AnimeTest {

	private AnimeDaoImpl animedaoimpl;

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
		animedaoimpl = new AnimeDaoImpl();

		Anime prueba = new Anime("Pokemon", "Seinen", "Esta muy guapo, muere mucha gente", 8, new Productora(1), 1, 1);
		animedaoimpl.addAnime(prueba);
		// Prueba para probar que la WHERE de validado funciona y que se haya realizado
		// la insert correctamente y prueba de borrado logico
		ArrayList<Anime> animelist = (ArrayList<Anime>) animedaoimpl.listAllAnimes();
		for (Anime anime : animelist) {
			assertTrue(anime != null);
			if (anime.getId() == 8) {
				animedaoimpl.deleteAnime(anime.getId());
			}
		}
		// Prueba de que al hacer la delete pone el activo a 0
		ArrayList<Anime> animelist1 = (ArrayList<Anime>) animedaoimpl.listAllAnimes();
		for (Anime anime : animelist1) {
			assertTrue(anime != null);
			System.out.println("Id: " + anime.getId() + " activo:" + anime.getActivo());
		}
		// Prueba para probar la update
		EntityManager em = EntityManagerGestor.crearEntityManager();

		em.getTransaction().begin();

		Anime a = em.find(Anime.class, new Long(8));
		System.out.println("Nombre al inicio: "+a.getNombre());
		a.setNombre("Monster");
		animedaoimpl.updateAnime(a);
		System.out.println("Nombre tras actualizar: "+em.find(Anime.class, new Long(8)).getNombre());

		em.close();

	}

}
