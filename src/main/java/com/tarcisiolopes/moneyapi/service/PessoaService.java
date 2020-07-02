package com.tarcisiolopes.moneyapi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.tarcisiolopes.moneyapi.model.Pessoa;
import com.tarcisiolopes.moneyapi.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Integer id, Pessoa pessoa) {
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(id);
		
		BeanUtils.copyProperties(pessoa, pessoaSalva, "id");
		return pessoaRepository.save(pessoaSalva);
	}


	public void atualizarPropriedadeAtivo(Integer id, Boolean ativo) {
		Pessoa pessoaSalva = buscarPessoaPeloCodigo(id);
		pessoaSalva.setAtivo(ativo);
		pessoaRepository.save(pessoaSalva);
	}

	private Pessoa buscarPessoaPeloCodigo(Integer id) {
		Pessoa pessoaSalva = pessoaRepository.getOne(id);
		if(pessoaSalva == null) {
			throw new EmptyResultDataAccessException(1);
		}
		return pessoaSalva;
	}
}
