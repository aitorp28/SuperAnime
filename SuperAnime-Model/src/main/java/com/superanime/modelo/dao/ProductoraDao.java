package com.superanime.modelo.dao;

import java.util.List;

import com.superanime.modelo.entity.Productora;

public interface ProductoraDao {
	
	public abstract List<Productora> listAllProductoras();

	public abstract boolean existeNombre(String nombre);

	public abstract Productora addProductora(Productora productora);

	public abstract boolean deleteLogicoProductora(long id);

	public abstract void updateProductora(Productora productora);

	public abstract Productora getProductoraById(long id);
}
