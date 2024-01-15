package com.pack.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.entitys.Entity_Consulta_Menus_Rol;
import com.pack.entitys.Entity_Consulta_Usuarios;
import com.pack.entitys.Entity_Estado_Civil;
import com.pack.entitys.Entity_Genero;
import com.pack.entitys.Entity_Nivel_Educativo;
import com.pack.entitys.Entity_Roles;
import com.pack.entitys.Entity_Tipo_Documento;
import com.pack.entitys.Entity_Usuarios;
import com.pack.services.Services_PruebaPraticaBackEnd;




@RestController
@RequestMapping("/prueba")
@CrossOrigin("*")
public class Controller_PruebaPraticaBackEnd {
	
    @Autowired
    private Services_PruebaPraticaBackEnd services;
   
     
       
    @GetMapping("/generos")
	public ResponseEntity<?> Generos() {
		HashMap<String, String> httpResponseMessage = new HashMap<>();
		CompletableFuture<List<Entity_Genero>> response = null;
		String msn = "";
		try {
			response = services.findAllGeneros();
			if (response.get().size() > 0) {
				CompletableFuture.completedFuture(response);
				return new ResponseEntity<>(response.get(), HttpStatus.OK);
			}else {
				msn = "No se encontraron generos disponibles para consultar!";
				httpResponseMessage.put("message", msn);
				return new ResponseEntity<>(httpResponseMessage, HttpStatus.NOT_FOUND);
			} 
		}catch (Exception e) {
			System.out.println("Exception>>>> "+e);
			httpResponseMessage.put("message", "Error /generos..");
			return new ResponseEntity<>(httpResponseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    	
    }
        

    
    @GetMapping("/niveles_educativos")
	public ResponseEntity<?> Nivel_Educativo() {
		HashMap<String, String> httpResponseMessage = new HashMap<>();
		CompletableFuture<List<Entity_Nivel_Educativo>> response = null;
		String msn = "";
		try {
			response = services.findAllNivel_Educativo();
			if (response.get().size() > 0) {
				CompletableFuture.completedFuture(response);
				return new ResponseEntity<>(response.get(), HttpStatus.OK);
			}else {
				msn = "No se encontraron niveles educativos disponibles para consultar!";
				httpResponseMessage.put("message", msn);
				return new ResponseEntity<>(httpResponseMessage, HttpStatus.NOT_FOUND);
			} 
		}catch (Exception e) {
			System.out.println("Exception>>>> "+e);
			httpResponseMessage.put("message", "Error /niveles_educativos..");
			return new ResponseEntity<>(httpResponseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    	
    }
    
    @GetMapping("/estado_civil")
	public ResponseEntity<?> Estado_Civil() {
		HashMap<String, String> httpResponseMessage = new HashMap<>();
		CompletableFuture<List<Entity_Estado_Civil>> response = null;
		String msn = "";
		try {
			response = services.findAllEstado_Civil();
			if (response.get().size() > 0) {
				CompletableFuture.completedFuture(response);
				return new ResponseEntity<>(response.get(), HttpStatus.OK);
			}else {
				msn = "No se encontraron estados civiles disponibles para consultar!";
				httpResponseMessage.put("message", msn);
				return new ResponseEntity<>(httpResponseMessage, HttpStatus.NOT_FOUND);
			} 
		}catch (Exception e) {
			System.out.println("Exception>>>> "+e);
			httpResponseMessage.put("message", "Error /estado_civil..");
			return new ResponseEntity<>(httpResponseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    	
    }
    
    @GetMapping("/tipo_documento")
 	public ResponseEntity<?> Tipo_Documento() {
 		HashMap<String, String> httpResponseMessage = new HashMap<>();
 		CompletableFuture<List<Entity_Tipo_Documento>> response = null;
 		String msn = "";
 		try {
 			response = services.findAllTipo_Documento();
 			if (response.get().size() > 0) {
 				CompletableFuture.completedFuture(response);
 				return new ResponseEntity<>(response.get(), HttpStatus.OK);
 			}else {
 				msn = "No se encontraron tipo documento disponibles para consultar!";
 				httpResponseMessage.put("message", msn);
 				return new ResponseEntity<>(httpResponseMessage, HttpStatus.NOT_FOUND);
 			} 
 		}catch (Exception e) {
 			System.out.println("Exception>>>> "+e);
 			httpResponseMessage.put("message", "Error /tipo_documento..");
 			return new ResponseEntity<>(httpResponseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
 		}
     }
    
    @GetMapping("/roles")
 	public ResponseEntity<?> Roles() {
 		HashMap<String, String> httpResponseMessage = new HashMap<>();
 		CompletableFuture<List<Entity_Roles>> response = null;
 		String msn = "";
 		try {
 			response = services.Roles();
 			if (response.get().size() > 0) {
 				CompletableFuture.completedFuture(response);
 				return new ResponseEntity<>(response.get(), HttpStatus.OK);
 			}else {
 				msn = "No se encontraron roles disponibles para consultar!";
 				httpResponseMessage.put("message", msn);
 				return new ResponseEntity<>(httpResponseMessage, HttpStatus.NOT_FOUND);
 			} 
 		}catch (Exception e) {
 			System.out.println("Exception>>>> "+e);
 			httpResponseMessage.put("message", "Error /roles..");
 			return new ResponseEntity<>(httpResponseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
 		}
     }

    
    
    // Users
    
    @GetMapping("/consulta_usuarios")
 	public ResponseEntity<?> Consulta_Ususarios() {
 		HashMap<String, String> httpResponseMessage = new HashMap<>();
 		CompletableFuture<List<Entity_Consulta_Usuarios>> response = null;
 		String msn = "";
 		try {
 			response = services.Consulta_Usuarios();
 			if (response.get().size() > 0) {
 				CompletableFuture.completedFuture(response);
 				return new ResponseEntity<>(response.get(), HttpStatus.OK);
 			}else {
 				msn = "No se encontraron usuarios disponibles para consultar!";
 				httpResponseMessage.put("message", msn);
 				return new ResponseEntity<>(httpResponseMessage, HttpStatus.NOT_FOUND);
 			} 
 		}catch (Exception e) {
 			System.out.println("Exception>>>> "+e);
 			httpResponseMessage.put("message", "Error /consulta_usuarios..");
 			return new ResponseEntity<>(httpResponseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
 		}
     }
    
    @GetMapping("/consulta_usuario/{documento}")
 	public ResponseEntity<?> Consulta_Ususario(@PathVariable Long documento) {
 		HashMap<String, String> httpResponseMessage = new HashMap<>();
 		CompletableFuture<Entity_Consulta_Usuarios> response = null;
 		String msn = "";
 		try {
 			response = services.Consulta_Usuario(documento);
 			if (response.get() != null) {
 				CompletableFuture.completedFuture(response);
 				return new ResponseEntity<>(response.get(), HttpStatus.OK);
 			}else {
 				msn = "No se enconto el usuario con documento : "+documento+" , por favor validar e intentar nuevamente!";
 				httpResponseMessage.put("message", msn);
 				return new ResponseEntity<>(httpResponseMessage, HttpStatus.NOT_FOUND);
 			} 
 		}catch (Exception e) {
 			System.out.println("Exception>>>> "+e);
 			httpResponseMessage.put("message", "Error /consulta_usuario/{documento}..");
 			return new ResponseEntity<>(httpResponseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
 		}
     }
    
    @PostMapping("/crear_usuario")
 	public ResponseEntity<?> Crear_Usuario(@RequestBody Entity_Usuarios usuario) {
 		HashMap<String, String> httpResponseMessage = new HashMap<>();
 		CompletableFuture<Entity_Usuarios> response = null;
 		String msn = "";
 		try {
 			  services.Crear_Usuario(usuario);
 			  msn = "Usuario creado con exito!";
 			  httpResponseMessage.put("message", msn);
 			  return new ResponseEntity<>(httpResponseMessage, HttpStatus.NOT_FOUND);
 
 		}catch (Exception e) {
 			System.out.println("Exception>>>> "+e);
 			httpResponseMessage.put("message", "Error /crear_usuario..");
 			return new ResponseEntity<>(httpResponseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
 		}

     }
    
	
	@PutMapping("/editar_usuario")
	public ResponseEntity<?> Editar_Usuario(@RequestBody Map<String,String> requestParams) {
		HashMap<String, String> httpResponseMessage = new HashMap<>();
		CompletableFuture<Entity_Consulta_Usuarios> response= null;
		
		Long documento = Long.parseLong(requestParams.get("documento"));
		Long nivel_educativo = Long.parseLong(requestParams.get("nivel_educativo"));
		Long estado_civil =  Long.parseLong(requestParams.get("estado_civil"));
		Long telefono = Long.parseLong(requestParams.get("telefono"));
		String email = requestParams.get("email");
		String direccion = requestParams.get("direccion");
		Long rol = Long.parseLong(requestParams.get("rol"));
		String estado = requestParams.get("estado");
		
		String msn = "";

        try {
          response = services.Editar_Usuario(documento,nivel_educativo,estado_civil,telefono,email,direccion,rol,estado);
  	      msn = "Usuario "+documento+" Editado con exito!";
          httpResponseMessage.put("mensaje", msn);
		  return new ResponseEntity<>(httpResponseMessage, HttpStatus.NOT_FOUND);
        }catch (Exception e) {
 			System.out.println("Exception>>>> "+e);
 			httpResponseMessage.put("message", "Error /editar_usuario..");
 			return new ResponseEntity<>(httpResponseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
 		}

	}

	@DeleteMapping("/borrar_usuario/{documento}")
 	public ResponseEntity<?> Borrar_Usuario(@PathVariable Long documento) {
 		HashMap<String, String> httpResponseMessage = new HashMap<>();
 		CompletableFuture<Entity_Usuarios> response = null;
 		String msn = "";
 		try {
 			  services.Borrar_Usuario(documento);
 			  msn = "Usuario "+ documento +" borrado con exito!";
 			  httpResponseMessage.put("message", msn);
 			  return new ResponseEntity<>(httpResponseMessage, HttpStatus.NOT_FOUND);
 
 		}catch (Exception e) {
 			System.out.println("Exception>>>> "+e);
 			httpResponseMessage.put("message", "Error /borrar_usuario/{documento}..");
 			return new ResponseEntity<>(httpResponseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
 		}

     }
	
    
    
    @GetMapping("/consulta_menus_rol/{rol}")
 	public ResponseEntity<?> Consulta_Menus_Rol(@PathVariable Long rol) {
 		HashMap<String, String> httpResponseMessage = new HashMap<>();
 		CompletableFuture<List<Entity_Consulta_Menus_Rol>> response = null;
 		String msn = "";
 		try {
 			response = services.Consulta_Menus_Rol(rol);
 			if (response.get() != null) {
 				CompletableFuture.completedFuture(response);
 				return new ResponseEntity<>(response.get(), HttpStatus.OK);
 			}else {
 				msn = "No se enconto el rol, por favor validar e intentar nuevamente!";
 				httpResponseMessage.put("message", msn);
 				return new ResponseEntity<>(httpResponseMessage, HttpStatus.NOT_FOUND);
 			} 
 		}catch (Exception e) {
 			System.out.println("Exception>>>> "+e);
 			httpResponseMessage.put("message", "Error /consulta_menus_rol/{rol}..");
 			return new ResponseEntity<>(httpResponseMessage, HttpStatus.INTERNAL_SERVER_ERROR);
 		}
     }
    
    
    
 
    
	    
}
