package com.Romina.restjersey;

public class Contacto {

	private String nombre;
	private String apellido;
	private String domicilio;
	private String telefono;
	private Long id;

	public long getId() {
		return id;
	}
	public void setID(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio + ", telefono="
				+ telefono + ", ID=" + id + "]";
	}


	
}
