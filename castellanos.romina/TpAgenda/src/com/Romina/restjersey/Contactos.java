package com.Romina.restjersey;

 
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
 
@Path("/contactos")
public class Contactos {
	
	@POST
	
	public String procesarDatos(
			@FormParam("nombre") String nombre,
			@FormParam("apellido") String apellido,
			@FormParam("domicilio") String domicilio,
			@FormParam("telefono") String telefono
			){
		System.out.println("Nombre:" + nombre);
		return "Nombre: " + nombre + " Apellido: " + apellido + "Domicilio: " + domicilio + "Telefono: " + telefono;

	}
	
	@GET
	public String metodoprocesado(){
		return "Metodo Ejecutado";
	}
 
}