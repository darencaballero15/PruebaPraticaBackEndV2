package com.pack.dao;



import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.pack.entitys.Entity_Roles;

import jakarta.transaction.Transactional;

@Transactional
public interface Dao_Roles extends JpaRepository<Entity_Roles, Long> {

	@Query(value = "select * from roles r where estado = 'S'", nativeQuery = true)
	
   List<Entity_Roles> Roles();
}


