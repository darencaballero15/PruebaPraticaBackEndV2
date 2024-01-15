
package com.pack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.pack.entitys.Entity_Editar_Usuarios;
import jakarta.transaction.Transactional;

@Transactional
public interface Dao_Editar_Usuarios extends JpaRepository<Entity_Editar_Usuarios, Long> {

    @Modifying
    @Query(value = "UPDATE usuarios\r\n"
            + "SET nivel_educativo = ?2, estado_civil = ?3, telefono = ?4, email = ?5, direccion = ?6, rol = ?7, estado = ?8 \r\n"
            + "WHERE documento = ?1", nativeQuery = true)
    void Editar_Usuario(Long documento, Long nivel_educativo, Long estado_civil, Long telefono, String email, String direccion, Long rol, String estado);
}