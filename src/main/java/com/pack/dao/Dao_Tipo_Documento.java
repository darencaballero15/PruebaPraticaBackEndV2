package com.pack.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.pack.entitys.Entity_Tipo_Documento;

import jakarta.transaction.Transactional;

@Transactional
public interface Dao_Tipo_Documento extends JpaRepository<Entity_Tipo_Documento, Long> {

	
}


