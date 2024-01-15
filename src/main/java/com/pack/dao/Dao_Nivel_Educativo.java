package com.pack.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.pack.entitys.Entity_Nivel_Educativo;

import jakarta.transaction.Transactional;

@Transactional
public interface Dao_Nivel_Educativo extends JpaRepository<Entity_Nivel_Educativo, Long> {

	
}


