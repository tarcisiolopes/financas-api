package com.tarcisiolopes.moneyapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarcisiolopes.moneyapi.repositories.CategoriaRepository;
import com.tarcisiolopes.moneyapi.model.Categoria;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repository;
	
	public List<Categoria> findAll(){
		return repository.findAll();
	}
	
	public Categoria findById(Integer codigo) {
		Optional<Categoria> obj = repository.findById(codigo);
		return obj.get();
	}
}
