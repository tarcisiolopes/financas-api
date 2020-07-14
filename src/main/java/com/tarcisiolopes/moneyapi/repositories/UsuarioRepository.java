package com.tarcisiolopes.moneyapi.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tarcisiolopes.moneyapi.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	public Optional<Usuario> findByEmail(String email);
}
