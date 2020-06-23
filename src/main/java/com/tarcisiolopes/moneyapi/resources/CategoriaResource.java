package com.tarcisiolopes.moneyapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarcisiolopes.moneyapi.model.Categoria;
import com.tarcisiolopes.moneyapi.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> findAll(){
		List<Categoria> list = service.findAll(); 
				
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{codigo}")
	public ResponseEntity<Categoria> findById(@PathVariable Integer codigo) {
		Categoria obj = service.findById(codigo);
		return ResponseEntity.ok().body(obj);
	}
}
