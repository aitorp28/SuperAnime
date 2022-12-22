package com.superanime.modelo.dao;

import java.util.List;

import com.superanime.modelo.entity.Productora;

public interface ProductoraDao {
	public abstract List<Productora> listAllProductoras();
	public abstract Productora addProductora(Productora productora);
	public abstract void deleteProductora(long id);
	public abstract void updateProductora(Productora productora);
    public abstract Productora getProductoraById(long id);
}
