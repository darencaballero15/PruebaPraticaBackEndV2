package com.pack.entitys;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@IdClass(Entity_Consulta_Usuarios.class)
@Table(name = "usuarios")
public class Entity_Consulta_Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "tipo_documento")
	private String tipo_documento;
	@Id
	@Column(name = "documento")
	private Long documento;
	@Column(name = "nombres")
	private String nombres;
	@Column(name = "apellido1")
	private String apellido1;
	@Column(name = "apellido2")
	private String apellido2;
	@Column(name = "genero")
	private String genero;
	@Column(name = "nivel_educativo")
	private String nivel_educativo;
	@Column(name = "estado_civil")
	private String estado_civil;
	@Column(name = "telefono")
	private Long telefono;
	@Column(name = "email")
	private String email;
	@Column(name = "direccion")
	private String direccion;
	@Column(name = "rol")
	private String rol;
	@Column(name = "estado")
	private String estado;
	@Column(name = "fecha_nacimiento")
	private Date fecha_nacimiento;
	@Column(name = "fecha_registro")
	private Date fecha_registro;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public Long getDocumento() {
		return documento;
	}
	public void setDocumento(Long documento) {
		this.documento = documento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNivel_educativo() {
		return nivel_educativo;
	}
	public void setNivel_educativo(String nivel_educativo) {
		this.nivel_educativo = nivel_educativo;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
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
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFecha_nacimiento() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		  return sdf.format(fecha_nacimiento);
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public String getFecha_registro() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		  return sdf.format(fecha_registro);
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Entity_Consulta_Usuarios [id=" + id + ", tipo_documento=" + tipo_documento + ", documento=" + documento
				+ ", nombres=" + nombres + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", genero="
				+ genero + ", nivel_educativo=" + nivel_educativo + ", estado_civil=" + estado_civil + ", telefono="
				+ telefono + ", email=" + email + ", direccion=" + direccion + ", rol=" + rol + ", estado=" + estado
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", fecha_registro=" + fecha_registro + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(apellido1, apellido2, direccion, documento, email, estado, estado_civil, fecha_nacimiento,
				fecha_registro, genero, id, nivel_educativo, nombres, rol, telefono, tipo_documento);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Entity_Consulta_Usuarios other = (Entity_Consulta_Usuarios) obj;
		return Objects.equals(apellido1, other.apellido1) && Objects.equals(apellido2, other.apellido2)
				&& Objects.equals(direccion, other.direccion) && Objects.equals(documento, other.documento)
				&& Objects.equals(email, other.email) && Objects.equals(estado, other.estado)
				&& Objects.equals(estado_civil, other.estado_civil)
				&& Objects.equals(fecha_nacimiento, other.fecha_nacimiento)
				&& Objects.equals(fecha_registro, other.fecha_registro) && Objects.equals(genero, other.genero)
				&& Objects.equals(id, other.id) && Objects.equals(nivel_educativo, other.nivel_educativo)
				&& Objects.equals(nombres, other.nombres) && Objects.equals(rol, other.rol)
				&& Objects.equals(telefono, other.telefono) && Objects.equals(tipo_documento, other.tipo_documento);
	}
	
	
}
