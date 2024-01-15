package com.pack.entitys;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@IdClass(Entity_Consulta_Menus_Rol.class)
@Table(name = "roles")
public class Entity_Consulta_Menus_Rol implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "rol_id")
	private Long rol_id;
	@Column(name = "nombre_rol")
	private String nombre_rol;
	@Column(name = "menu_id")
	private Long menu_id;
	@Column(name = "nombre_menu")
	private String nombre_menu;
	@Column(name = "roles_menu_id")
	private Long roles_menu_id;
	
	
	public Long getRol_id() {
		return rol_id;
	}
	public void setRol_id(Long rol_id) {
		this.rol_id = rol_id;
	}
	public String getNombre_rol() {
		return nombre_rol;
	}
	public void setNombre_rol(String nombre_rol) {
		this.nombre_rol = nombre_rol;
	}
	public Long getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(Long menu_id) {
		this.menu_id = menu_id;
	}
	public String getNombre_menu() {
		return nombre_menu;
	}
	public void setNombre_menu(String nombre_menu) {
		this.nombre_menu = nombre_menu;
	}
	public Long getRoles_menu_id() {
		return roles_menu_id;
	}
	public void setRoles_menu_id(Long roles_menu_id) {
		this.roles_menu_id = roles_menu_id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(menu_id, nombre_menu, nombre_rol, rol_id, roles_menu_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity_Consulta_Menus_Rol other = (Entity_Consulta_Menus_Rol) obj;
		return Objects.equals(menu_id, other.menu_id) && Objects.equals(nombre_menu, other.nombre_menu)
				&& Objects.equals(nombre_rol, other.nombre_rol) && Objects.equals(rol_id, other.rol_id)
				&& Objects.equals(roles_menu_id, other.roles_menu_id);
	}
	
	
	
}
