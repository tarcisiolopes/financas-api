package com.tarcisiolopes.moneyapi.repositories.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.tarcisiolopes.moneyapi.model.Lancamento;
import com.tarcisiolopes.moneyapi.repositories.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
}
