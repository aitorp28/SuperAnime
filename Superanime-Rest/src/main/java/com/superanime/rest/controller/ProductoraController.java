package com.superanime.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superanime.modelo.entity.Productora;
import com.superanime.rest.service.ProductoraService;

@RestController
@RequestMapping("/api")
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
	
	@PostMapping("/productora")
	public Productora addProductora(@RequestBody Productora productora) {	      		
		return productoraServ.addProductora(productora);
	}
	
	 @DeleteMapping("/productora/{id}")
	 public void deleteProductora(@PathVariable long id) {
		 productoraServ.deleteLogicoProductora(id);
	 }
	
	 @PutMapping("/productora/{id}")
	 public Productora update(@RequestBody Productora productora,@PathVariable long id) {
		 Productora p= productoraServ.getProductoraById(id);
		p.setNombre(productora.getNombre());
		p.setDescripcion(productora.getDescripcion());
		p.setAnimes(productora.getAnimes());
		p.setActivo(productora.getActivo());
		productoraServ.updateProductora(p);
		return p;
	 }	
}
