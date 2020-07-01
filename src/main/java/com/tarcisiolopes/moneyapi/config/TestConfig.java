package com.tarcisiolopes.moneyapi.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.tarcisiolopes.moneyapi.model.Categoria;
import com.tarcisiolopes.moneyapi.model.Pessoa;
import com.tarcisiolopes.moneyapi.repositories.CategoriaRepository;
import com.tarcisiolopes.moneyapi.repositories.PessoaRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private PessoaRepository pessoaRepository;

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Lazer");
		Categoria cat2 = new Categoria(null, "Alimentação");
		Categoria cat3 = new Categoria(null, "Supermercado");
		Categoria cat4 = new Categoria(null, "Farmácia");

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));
		
		Pessoa p1 = new Pessoa(null, "Paulo Roberto", true, null);
		Pessoa p2 = new Pessoa(null, "Tarcisio Lopes", true, null);
		Pessoa p3 = new Pessoa(null, "Pollyana Lamounier", false, null);
		
		pessoaRepository.saveAll(Arrays.asList(p1, p2, p3));
	}

}
