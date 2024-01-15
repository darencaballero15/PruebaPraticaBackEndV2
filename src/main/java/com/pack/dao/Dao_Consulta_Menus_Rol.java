package com.pack.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.pack.entitys.Entity_Consulta_Menus_Rol;


import jakarta.transaction.Transactional;

	@Transactional
public interface Dao_Consulta_Menus_Rol extends JpaRepository<Entity_Consulta_Menus_Rol, Long> {

		@Query(value = "SELECT r.id AS rol_id,r.nombre AS nombre_rol,m.id AS menu_id, m.nombre AS nombre_menu,rm.id AS roles_menu_id,m.estado\r\n"
				+ "FROM roles r\r\n"
				+ "JOIN roles_menus rm ON r.id = rm.rol_id\r\n"
				+ "JOIN menus m ON rm.menu_id = m.id\r\n"
				+ "and r.id = ?1", nativeQuery = true)
	    List<Entity_Consulta_Menus_Rol> Consulta_Menus_Rol(Long rol);
}
