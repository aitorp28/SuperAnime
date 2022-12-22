package com.superanime.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.superanime.modelo.dao.AnimeDaoImpl;
import com.superanime.modelo.dao.ProductoraDaoImpl;
import com.superanime.modelo.entity.Productora;

@Service("productoraservice")
public class ProductoraServiceImpl implements ProductoraService {

	// @Autowired
	private ProductoraDaoImpl productoraDao;

	@Override
	public List<Productora> listAllProductoras() {
		productoraDao=ProductoraDaoImpl.getInstance();
		return productoraDao.listAllProductoras();

	}

	@Override
	public Productora addProductora(Productora productora) {
		productoraDao=ProductoraDaoImpl.getInstance();
		return productoraDao.addProductora(productora);

	}

	@Override
	public void deleteProductora(long id) {
		productoraDao=ProductoraDaoImpl.getInstance();
		productoraDao.deleteProductora(id);

	}

	@Override
	public void updateProductora(Productora productora) {
		productoraDao=ProductoraDaoImpl.getInstance();
		productoraDao.updateProductora(productora);

	}

	@Override
	public Productora getProductoraById(long id) {
		productoraDao=ProductoraDaoImpl.getInstance();
		return productoraDao.getProductoraById(id);

	}

}
