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
public class TestConfig implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Lazer");
		Categoria cat2 = new Categoria(null, "Alimentação");
		Categoria cat3 = new Categoria(null, "Supermercado");
		Categoria cat4 = new Categoria(null, "Farmácia");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
	}

}
