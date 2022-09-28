package com.pe.mapper;

import java.util.ArrayList;
import java.util.Collection;
import com.pe.model.Trabajador;

public class MapperUtilTrabajador {
	public static Collection<MapperTrabajador>convertTrabajador(Collection<Trabajador>
	itemsTrabajador)
	{
		Collection<MapperTrabajador>collectionTrabajador=new ArrayList<>();
		for(Trabajador trabajador:itemsTrabajador) {
			MapperTrabajador mapperTrabajador = new MapperTrabajador();
			
			mapperTrabajador.setId_trabajador(trabajador.getId_trabajador());
			mapperTrabajador.setNombre(trabajador.getNombre());
			mapperTrabajador.setTelefono(trabajador.getTelefono());
			mapperTrabajador.setDireccion(trabajador.getDireccion());
			mapperTrabajador.setId_tipotrabajo(trabajador.getTipoTrabajo().getId_tipotrabajo()); 
			mapperTrabajador.setNombreTipoTrabajo(trabajador.getTipoTrabajo().getNombre());
			mapperTrabajador.setId_documento(trabajador.getDocumento().getId_documento());
			mapperTrabajador.setNombreDocumento(trabajador.getDocumento().getNombre());
			collectionTrabajador.add(mapperTrabajador);	
			}
	return collectionTrabajador;
	}

	
}
