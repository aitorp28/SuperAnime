package com.superanime.rest.service;

import java.util.List;

import com.superanime.modelo.entity.Productora;

public interface ProductoraService {

	public abstract List<Productora> listAllProductoras();

	public abstract List<Productora> findFilterByName(String name);

	public abstract boolean existeNombre(String nombre);

	public abstract Productora getProductoraById(long id);

}
