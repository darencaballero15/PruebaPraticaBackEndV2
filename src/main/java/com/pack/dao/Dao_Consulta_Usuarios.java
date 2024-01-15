package com.pack.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.pack.entitys.Entity_Consulta_Usuarios;


import jakarta.transaction.Transactional;

@Transactional
public interface Dao_Consulta_Usuarios extends JpaRepository<Entity_Consulta_Usuarios, Long> {

	@Query(value = "SELECT us.id as ID, td.descripcion as TIPO_DOCUMENTO, us.documento as DOCUMENTO, us.nombres as NOMBRES, us.apellido1 as APELLIDO1, us.apellido2 as APELLIDO2, " +
            "ge.descripcion as GENERO, ne.descripcion as NIVEL_EDUCATIVO, ec.descripcion as ESTADO_CIVIL, us.telefono as TELEFONO, us.email as EMAIL, us.direccion as DIRECCION, " +
            "r.nombre AS ROL, us.fecha_nacimiento AS FECHA_NACIMIENTO, us.fecha_registro AS FECHA_REGISTRO, us.estado as ESTADO " +
            "FROM usuarios us " +
            "JOIN genero ge ON us.genero = ge.id " +
            "JOIN tipo_documento td ON us.tipo_documento = td.id " +
            "JOIN nivel_educativo ne ON us.nivel_educativo = ne.id " +
            "JOIN estado_civil ec ON us.estado_civil = ec.id " +
            "JOIN roles r ON us.rol = r.id", nativeQuery = true)
    List<Entity_Consulta_Usuarios> Consulta_Usuarios();
    
    @Query(value = "SELECT us.id as ID, td.descripcion as TIPO_DOCUMENTO, us.documento as DOCUMENTO, us.nombres as NOMBRES, us.apellido1 as APELLIDO1, us.apellido2 as APELLIDO2, " +
            "ge.descripcion as GENERO, ne.descripcion as NIVEL_EDUCATIVO, ec.descripcion as ESTADO_CIVIL, us.telefono as TELEFONO, us.email as EMAIL, us.direccion as DIRECCION, " +
            "r.nombre AS ROL, us.fecha_nacimiento AS FECHA_NACIMIENTO, us.fecha_registro AS FECHA_REGISTRO, us.estado as ESTADO " +
            "FROM usuarios us " +
            "JOIN genero ge ON us.genero = ge.id " +
            "JOIN tipo_documento td ON us.tipo_documento = td.id " +
            "JOIN nivel_educativo ne ON us.nivel_educativo = ne.id " +
            "JOIN estado_civil ec ON us.estado_civil = ec.id " +
            "JOIN roles r ON us.rol = r.id AND us.DOCUMENTO = ?1", nativeQuery = true)
    Entity_Consulta_Usuarios Consulta_Usuario(Long documento);




}


