package com.pack.services;


import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.pack.dao.Dao_Estado_Civil;
import com.pack.dao.Dao_Genero;
import com.pack.dao.Dao_Nivel_Educativo;
import com.pack.dao.Dao_Roles;
import com.pack.dao.Dao_Tipo_Documento;
import com.pack.dao.Dao_Usuarios;
import com.pack.dao.Dao_Consulta_Menus_Rol;
import com.pack.dao.Dao_Consulta_Usuarios;
import com.pack.dao.Dao_Editar_Usuarios;
import com.pack.entitys.Entity_Consulta_Menus_Rol;
import com.pack.entitys.Entity_Consulta_Usuarios;
import com.pack.entitys.Entity_Estado_Civil;
import com.pack.entitys.Entity_Genero;
import com.pack.entitys.Entity_Nivel_Educativo;
import com.pack.entitys.Entity_Roles;
import com.pack.entitys.Entity_Tipo_Documento;
import com.pack.entitys.Entity_Usuarios;




@Service
public class Services_PruebaPraticaBackEnd {

	 @Autowired
	 private Dao_Genero generoRepository;
	 
	 @Autowired
	 private Dao_Estado_Civil estado_civilRepository;
	 
	 @Autowired
	 private Dao_Nivel_Educativo nivel_educativoRepository;
	 
	 @Autowired
	 private Dao_Roles rolesRepository;
	 
	 @Autowired
	 private Dao_Tipo_Documento tipo_documentoRepository;
	 
	 @Autowired
	 private Dao_Consulta_Usuarios consulta_usuariosRepository;
	 
	 @Autowired
	 private Dao_Usuarios usuariosRepository;
	 
	 @Autowired
	 private Dao_Editar_Usuarios editar_usuariosRepository;
	 
	 @Autowired
	 private Dao_Consulta_Menus_Rol consulta_menus_rolRepository;
	 
	    @Async
	    public CompletableFuture<List<Entity_Genero>> findAllGeneros() {
	        return CompletableFuture.completedFuture(generoRepository.findAll()); 
	    }
	    
	    @Async
	    public CompletableFuture<List<Entity_Estado_Civil>> findAllEstado_Civil() {
	        return CompletableFuture.completedFuture(estado_civilRepository.findAll()); 
	    }
	    
	    @Async
	    public CompletableFuture<List<Entity_Nivel_Educativo>> findAllNivel_Educativo() {
	        return CompletableFuture.completedFuture(nivel_educativoRepository.findAll()); 
	    }
	    
	    @Async
	    public CompletableFuture<List<Entity_Roles>> Roles() {
	        return CompletableFuture.completedFuture(rolesRepository.Roles()); 
	    }
	    
	    @Async
	    public CompletableFuture<List<Entity_Tipo_Documento>> findAllTipo_Documento() {
	        return CompletableFuture.completedFuture(tipo_documentoRepository.findAll()); 
	    }
	    
	    //
	    
	    @Async
	    public CompletableFuture<List<Entity_Consulta_Usuarios>> Consulta_Usuarios() {
	        return CompletableFuture.completedFuture(consulta_usuariosRepository.Consulta_Usuarios()); 
	    }
	    
	    @Async
	    public CompletableFuture<Entity_Consulta_Usuarios> Consulta_Usuario(Long documento) {
	        return CompletableFuture.completedFuture(consulta_usuariosRepository.Consulta_Usuario(documento)); 
	    }
	    
	    @Async
	    public void Crear_Usuario(Entity_Usuarios usuario) {
	    CompletableFuture.completedFuture(usuariosRepository.saveAndFlush(usuario));
	    }
	    
	    @Async
	    public CompletableFuture<Entity_Consulta_Usuarios> Editar_Usuario(Long documento,Long nivel_educativo,Long estado_civil,Long telefono,String email,String direccion,Long rol,String estado) {
	    	editar_usuariosRepository.Editar_Usuario(documento,nivel_educativo,estado_civil,telefono,email,direccion,rol,estado);
	    	Entity_Consulta_Usuarios entidadActualizada = consulta_usuariosRepository.Consulta_Usuario(documento);
	    	 return CompletableFuture.completedFuture(entidadActualizada);
	    }
	    
	    @Async
	    public void Borrar_Usuario(Long documento) {
	    usuariosRepository.deleteByDocumento(documento);
	    }
	    
	    @Async
	    public CompletableFuture<List<Entity_Consulta_Menus_Rol>> Consulta_Menus_Rol(Long rol) {
	        return CompletableFuture.completedFuture(consulta_menus_rolRepository.Consulta_Menus_Rol(rol)); 
	    }
	    
	    
	    
	  
	        

	  
}
