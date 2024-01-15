package com.pack.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.pack.entitys.Entity_Estado_Civil;
import jakarta.transaction.Transactional;

@Transactional
public interface Dao_Estado_Civil extends JpaRepository<Entity_Estado_Civil, Long> {

	
}


