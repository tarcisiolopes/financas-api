package com.tarcisiolopes.moneyapi.repositories.lancamento;

import java.util.List;

import com.tarcisiolopes.moneyapi.model.Lancamento;
import com.tarcisiolopes.moneyapi.repositories.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
