package com.superanime.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.superanime.modelo.dao.ProductoraDao;
import com.superanime.modelo.entity.Productora;

@Service("productoraservice")
public class ProductoraServiceImpl implements ProductoraService {

	// @Autowired
	private ProductoraDao productoraDao;

	@Override
	public List<Productora> listAllProductoras() {

		return productoraDao.listAllProductoras();

	}

	@Override
	public Productora addProductora(Productora productora) {

		return productoraDao.addProductora(productora);

	}

	@Override
	public void deleteProductora(long id) {

		productoraDao.deleteProductora(id);

	}

	@Override
	public void updateProductora(Productora productora) {

		productoraDao.updateProductora(productora);

	}

	@Override
	public Productora getProductoraById(long id) {

		return productoraDao.getProductoraById(id);

	}

}
