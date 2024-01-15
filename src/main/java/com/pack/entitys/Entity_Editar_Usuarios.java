package com.pack.entitys;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@IdClass(Entity_Editar_Usuarios.class)
@Table(name = "usuarios")
public class Entity_Editar_Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "documento")
	private Long documento;
	@Column(name = "nivel_educativo")
	private Long nivel_educativo;
	@Column(name = "estado_civil")
	private Long estado_civil;
	@Column(name = "telefono")
	private Long telefono;
	@Column(name = "email")
	private String email;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "rol")
	private Long rol;
	@Column(name = "estado")
	private String estado;
	

	public Long getDocumento() {
		return documento;
	}
	public void setDocumento(Long documento) {
		this.documento = documento;
	}
	public Long getNivel_educativo() {
		return nivel_educativo;
	}
	public void setNivel_educativo(Long nivel_educativo) {
		this.nivel_educativo = nivel_educativo;
	}
	public Long getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(Long estado_civil) {
		this.estado_civil = estado_civil;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Long getRol() {
		return rol;
	}
	public void setRol(Long rol) {
		this.rol = rol;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		return Objects.hash(direccion, documento, email, estado, estado_civil, nivel_educativo, rol, telefono);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity_Editar_Usuarios other = (Entity_Editar_Usuarios) obj;
		return Objects.equals(direccion, other.direccion) && Objects.equals(documento, other.documento)
				&& Objects.equals(email, other.email) && Objects.equals(estado, other.estado)
				&& Objects.equals(estado_civil, other.estado_civil)
				&& Objects.equals(nivel_educativo, other.nivel_educativo) && Objects.equals(rol, other.rol)
				&& Objects.equals(telefono, other.telefono);
	}
	
	
}
