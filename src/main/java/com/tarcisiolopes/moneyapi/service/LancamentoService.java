package com.tarcisiolopes.moneyapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarcisiolopes.moneyapi.model.Lancamento;
import com.tarcisiolopes.moneyapi.model.Pessoa;
import com.tarcisiolopes.moneyapi.repositories.LancamentoRepository;
import com.tarcisiolopes.moneyapi.repositories.PessoaRepository;
import com.tarcisiolopes.moneyapi.service.exception.PessoaInexistenteOuInativaException;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;

	public Lancamento save(Lancamento lancamento) {
		Pessoa pessoa = pessoaRepository.getOne(lancamento.getPessoa().getId());
		if(pessoa == null || !pessoa.isInativo()) {
			throw new PessoaInexistenteOuInativaException();			
		}
		return lancamentoRepository.save(lancamento);
	}

}
