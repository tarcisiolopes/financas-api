package com.tarcisiolopes.moneyapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tarcisiolopes.moneyapi.model.Categoria;
import com.tarcisiolopes.moneyapi.repositories.CategoriaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Receita");
		Categoria cat2 = new Categoria(null, "Despesa");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		
	}
	
	
}
