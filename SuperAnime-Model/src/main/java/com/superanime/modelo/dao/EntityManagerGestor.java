package com.superanime.modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerGestor {
		
		public static EntityManager crearEntityManager() {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("superanime");
			EntityManager em = emf.createEntityManager();
			return em;
		}
}
