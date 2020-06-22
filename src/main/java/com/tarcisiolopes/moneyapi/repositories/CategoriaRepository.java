package com.tarcisiolopes.moneyapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarcisiolopes.moneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
}
