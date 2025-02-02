$(document).ready(function(){
  
	$("#btn").click(function(){
		var nombre = $("#nombre").val();
		var apellido = $("#apellido").val();
		var domicilio = $("#domicilio").val();
		var telefono = $("#telefono").val();
		
		$.post("http://localhost:8080/TpAgenda/romina/contactos",
        {
          nombre: nombre,
          apellido: apellido, 
          telefono: telefono, 
          domicilio: domicilio
        },
        function(data,status){
            $("#resultadonom").text(data.nombre);
            $("#resultadoape").text(data.apellido);
            $("#resultadodom").text(data.domicilio);
            $("#resultadotel").text(data.telefono);
        });
    });

	$("#search").click(function(){
		
		var nombreBusqueda = $("#nombreBusqueda").val();
		var apellidoBusqueda = $("#apellidoBusqueda").val();
		var inicialBusqueda = $("#inicialBusqueda").val();
		var domicilioBusqueda = $("#domicilioBusqueda").val();
			
		var url ="http://localhost:8080/TpAgenda/romina/contactos";
		var queryString = "?";
			
			if (nombreBusqueda != "") {
				queryString += "filtroNombre=" + nombreBusqueda;
			}
			if (apellidoBusqueda != "") {
				if (queryString != "?") queryString += "&";
				queryString += "filtroApellido=" + apellidoBusqueda;
			}
			if (inicialBusqueda != ""){
				if (queryString != "?") queryString += "&";
				queryString += "filtroInicial=" + inicialBusqueda;
			}
			if (domicilioBusqueda != ""){
				if (queryString != "?") queryString += "&";
				queryString += "filtroDomicilio=" + domicilioBusqueda;
			}
			if (queryString != "?") {
				url += queryString;
			}
			//alert(url);
			
		$.get(url, function(data,status){			
			
			var text = "<table>";
			var x;
			for (x in data) {
			   	text += "<tr>";
				text +="   <td>"+data[x].id + "</td>";
			   	text +="   <td>"+data[x].nombre + "</td>";
			   	text +="   <td>"+data[x].apellido + "</td>";
			   	text +="   <td>"+data[x].domicilio + "</td>";
				text +="   <td>"+data[x].telefono + "</td>";
			   	text +="</tr>";
			
			}
			text+="</table>";
					
			document.getElementById("tabla").innerHTML = text;
		});
	});
});

