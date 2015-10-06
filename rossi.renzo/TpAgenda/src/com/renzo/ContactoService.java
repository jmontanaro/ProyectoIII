package com.renzo;

import javax.ws.rs.Path;

import java.util.ArrayList;
import java.util.Collection;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
 

@Path("/contactos")
public class ContactoService {

	private static Collection contactosGuardados = new ArrayList<Contacto> () ;
	
	@POST
	public String procesarDatos (@FormParam("Nombre") String nombre, 
								 @FormParam("Apellido") String apellido, 
								 @FormParam("Direccion") String direccion, 
								 @FormParam("Tel")  String telefono){
				
		Contacto nuevoContacto = new Contacto();
		nuevoContacto.setNombre(nombre);
		nuevoContacto.setApellido(apellido);
		nuevoContacto.setDireccion(direccion);
		nuevoContacto.setTelefono(telefono);
		
		contactosGuardados.add(nuevoContacto);

		System.out.println(nuevoContacto);
		System.out.println ("Cantidad de contactos: " + contactosGuardados.size()) ;
		
	
	
		return "Nombre: " + nombre + " Apellido: " + apellido + " Direccion: " + direccion + " Telefono: " + telefono + " ---- Contactos Guardados: " + contactosGuardados.size();		
	} 
	

	
}
