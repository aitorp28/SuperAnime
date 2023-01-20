package com.superanime.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.entity.Productora;

@Service("productoraservice")
public class ProductoraServiceImpl implements ProductoraService {

	// @Autowired
	private ProductoraDaoImpl productoraDao;
	/**
	 * Metodo para mostrar todos las productoras
	 * @return ArrayList<Productora>
	 */
	@Override
	public List<Productora> listAllProductoras() {

		productoraDao = ProductoraDaoImpl.getInstance();
		
		return productoraDao.listAllProductoras();
	}
	/**
	 * Metodo para mostrar las productoras que incluyen parte del nombre enviado
	 * @param nombre Nombre/parte de nombre que puede incluir las productoras
	 * @return List<Productora>
	 */
	@Override
	public List<Productora> findFilterByName(String name) {

		productoraDao = ProductoraDaoImpl.getInstance();
		
		return productoraDao.findFilterByName(name);
	}
	/**
	 * Metodo para comprobar si el nombre insertado existe ya dado a que el campo en la bbdd es unico
	 * @return boolean Devuelve false cuando no encuentra el nombre en la base de datos, true si ya existe el nombre de la bbdd
	 */
	@Override
	public boolean existeNombre(String nombre) {

		productoraDao = ProductoraDaoImpl.getInstance();
		
		return productoraDao.existeNombre(nombre);
	}
	/**
	 * Metodo para buscar la productora por su id
	 * @param id Id del Productora
	 * @return Productora
	 */
	@Override
	public Productora getProductoraById(long id) {

		productoraDao = ProductoraDaoImpl.getInstance();
		
		return productoraDao.getProductoraById(id);
	}

}
