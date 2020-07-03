package com.tarcisiolopes.moneyapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tarcisiolopes.moneyapi.model.Lancamento;
import com.tarcisiolopes.moneyapi.repositories.lancamento.LancamentoRepositoryQuery;

@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Integer>, LancamentoRepositoryQuery{

}
