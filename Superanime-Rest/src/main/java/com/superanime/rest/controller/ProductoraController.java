package com.superanime.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superanime.modelo.entity.Productora;
import com.superanime.rest.service.ProductoraService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins= {"*"})
public class ProductoraController {

	@Autowired
	private ProductoraService productoraServ;
	
	@GetMapping("/productoras")
	public List<Productora> listAllProductoras() {
		
		return productoraServ.listAllProductoras();
	}
	
	@GetMapping("/productorasByName")
	public List<Productora> findFilterByName(@PathVariable String nombre) {

		return productoraServ.findFilterByName(nombre);
	}
	
	@GetMapping("/productoras/{id}")
    public Productora getProductoraById(@PathVariable long id) {
    	return productoraServ.getProductoraById(id);
    }
}
