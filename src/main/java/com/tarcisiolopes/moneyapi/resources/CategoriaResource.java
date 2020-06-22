package com.tarcisiolopes.moneyapi.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tarcisiolopes.moneyapi.model.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@GetMapping
	public ResponseEntity<Categoria> findAll(){
		Categoria cat = new Categoria(null, "Receita");
		return ResponseEntity.ok().body(cat);
	}
}
