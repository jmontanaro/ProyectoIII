package com.renzo;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
 

@Path("/contactos")
@Produces(MediaType.APPLICATION_JSON)

public class ContactoService {

	private static Map<Integer , Contacto> contactosGuardados = new HashMap<Integer , Contacto> () ;
	
	@POST
	
	public Response procesarDatos (@FormParam("Nombre") String nombre, 
								 @FormParam("Apellido") String apellido, 
								 @FormParam("Direccion") String direccion, 
								 @FormParam("Tel")  String telefono){
				
		Integer nuevoId = (contactosGuardados.size() + 1);
		
		Contacto nuevoContacto = new Contacto();
		nuevoContacto.setID(nuevoId);
		nuevoContacto.setNombre(nombre);
		nuevoContacto.setApellido(apellido);
		nuevoContacto.setDireccion(direccion);
		nuevoContacto.setTelefono(telefono);
		
		contactosGuardados.put(nuevoId , nuevoContacto);

		System.out.println(nuevoContacto);
		System.out.println ("Cantidad de contactos: " + contactosGuardados.size()) ;
		
		
		return Response.ok(nuevoContacto).build();		
	}
	
	@Path("/{ID}")
	@GET
	public Response getUno (@PathParam("ID") Integer id) {
		boolean buscaNobusca = contactosGuardados.containsKey(id);
		if (buscaNobusca){
			Contacto contactoBuscado = contactosGuardados.get(id);
			return Response.ok(contactoBuscado).build() ;
		}
		 
		return Response.status(Status.NOT_FOUND).build();
		}
	
	@GET
	public Response getTodo (){
		contactosGuardados.values();
		
		return Response.ok(contactosGuardados).build();
	}
	
	
	List<Contacto> ListContactos = new ArrayList <Contacto> (contactosGuardados.values() );
	
	
	
	@GET
	public Response getFiltroNombre (@QueryParam ("nombre") String filterName){
		
		if (filterName != null){
			String result = filtrarNombre (filterName , ListContactos);
		}
		
		private <ListContactos> ListContactos filtrarNombre(String filtro, List ContactosList){
			if(filtro == null || filtro.isEmpty()
						return ;
		
		for(contacto c : l){
		if(c.getNombre()equals(filtro)){
		filtrada.add(c);
		}
		return filtrada;

	}
	
}
