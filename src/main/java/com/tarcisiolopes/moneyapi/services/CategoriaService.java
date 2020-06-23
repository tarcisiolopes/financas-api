package com.tarcisiolopes.moneyapi.services;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.tarcisiolopes.moneyapi.repositories.CategoriaRepository;
import com.tarcisiolopes.moneyapi.model.Categoria;
import com.tarcisiolopes.moneyapi.services.exceptions.DatabaseException;
import com.tarcisiolopes.moneyapi.services.exceptions.ResourceNotFoundException;


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
	
	public Categoria inserir(Categoria obj) {
		return repository.save(obj);
	}
	
	public void apagar(Integer codigo) {
		try {
			repository.deleteById(codigo);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(codigo);
		} catch (DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	public Categoria atualizar(Integer codigo, Categoria obj) {
		try {
		Categoria entity = repository.getOne(codigo);
		atualizarData(entity, obj);
		return repository.save(entity);
		} catch(EntityNotFoundException e) {
			e.printStackTrace();
			throw new ResourceNotFoundException(codigo);
		}
	}

	private void atualizarData(Categoria entity, Categoria obj) {
		entity.setNome(obj.getNome());
	}
	
	
}
