package com.pack.dao;


import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.pack.entitys.Entity_Genero;
import com.pack.entitys.Entity_Usuarios;


import jakarta.transaction.Transactional;

@Transactional
public interface Dao_Usuarios extends JpaRepository<Entity_Usuarios, Long> {

	CompletableFuture<Entity_Genero> findByDocumento(Long documento);
	void deleteByDocumento(Long documento);
	
}


