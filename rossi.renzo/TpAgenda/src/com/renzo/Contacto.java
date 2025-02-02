package com.renzo;

public class Contacto {
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private long id;
	
	public long getID() {
		return id;
	}
	public void setID(long ID) {
		this.id = ID;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Contacto [" + nombre + ", " + apellido + ", "+ direccion + " , "+ telefono +" , " + id + "]";
	}
}
