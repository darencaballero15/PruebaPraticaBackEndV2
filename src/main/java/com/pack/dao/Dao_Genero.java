package com.pack.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.pack.entitys.Entity_Genero;
import jakarta.transaction.Transactional;

@Transactional
public interface Dao_Genero extends JpaRepository<Entity_Genero, Long> {

	
}


