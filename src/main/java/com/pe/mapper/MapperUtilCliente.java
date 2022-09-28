package com.pe.mapper;

import java.util.*;
import com.pe.model.*;

public class MapperUtilCliente {
	public static Collection<MapperCliente> convertCliente
	(Collection<Cliente>itemsCliente)
	{
		Collection<MapperCliente> collectionCliente =new ArrayList<>();
		for(Cliente cliente:itemsCliente) {
			
			MapperCliente mapperCliente= new MapperCliente();
			
			mapperCliente.setId_documento(cliente.getDocumento().getId_documento());
			mapperCliente.setNombre(cliente.getNombre());
			mapperCliente.setTelefono(cliente.getTelefono());
			mapperCliente.setDireccion(cliente.getDireccion());
			mapperCliente.setCorreo(cliente.getCorreo());
			mapperCliente.setId_cliente(cliente.getId_cliente());
		mapperCliente.setNombredocumento(cliente.getDocumento().getNombre());
			mapperCliente.setNumero_documento(cliente.getNumero_documento());
		
		collectionCliente.add(mapperCliente);
	}
		return collectionCliente;
	}
	    
	public static MapperCliente convertClienteList(Cliente  cliente) {
		MapperCliente mapperCliente2 = new MapperCliente();
		
		mapperCliente2.setId_cliente(cliente.getId_cliente());
		mapperCliente2.setNombre(cliente.getNombre());
		mapperCliente2.setDireccion(cliente.getDireccion());
		mapperCliente2.setTelefono(cliente.getTelefono());
		mapperCliente2.setDireccion(cliente.getDireccion());
		mapperCliente2.setCorreo(cliente.getCorreo());
		mapperCliente2.setId_documento(cliente.getDocumento().getId_documento());
		mapperCliente2.setNombredocumento(cliente.getDocumento().getNombre());
		mapperCliente2.setNumero_documento(cliente.getNumero_documento());
		return mapperCliente2;
	}
	
}
