package com.superanime.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.entity.Productora;

@Service("productoraservice")
public class ProductoraServiceImpl implements ProductoraService {

	// @Autowired
	private ProductoraDaoImpl productoraDao;

	@Override
	public List<Productora> listAllProductoras() {

		productoraDao = ProductoraDaoImpl.getInstance();
		
		return productoraDao.listAllProductoras();
	}

	@Override
	public List<Productora> findFilterByName(String name) {

		productoraDao = ProductoraDaoImpl.getInstance();
		
		return productoraDao.findFilterByName(name);
	}
	
	@Override
	public boolean existeNombre(String nombre) {

		productoraDao = ProductoraDaoImpl.getInstance();
		
		return productoraDao.existeNombre(nombre);
	}

	@Override
	public Productora getProductoraById(long id) {

		productoraDao = ProductoraDaoImpl.getInstance();
		
		return productoraDao.getProductoraById(id);
	}

}
