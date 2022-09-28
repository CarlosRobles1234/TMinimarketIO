package com.pe.mapper;

import java.util.ArrayList;
import java.util.Collection;

import com.pe.model.OrdenCompra;

public class MapperUtilOrdenCompra {

	public static Collection<MapperOrdenCompra>convertOrdenCompra(Collection
			<OrdenCompra>itemsOrdenCompra)
	{
		Collection<MapperOrdenCompra> collectionOrdenCompra=new ArrayList<>();
		for(OrdenCompra ordenCompra:itemsOrdenCompra ) {
			MapperOrdenCompra mapperOrdenCompra	=new MapperOrdenCompra();
			
			mapperOrdenCompra.setId_ordenCompra(ordenCompra.getId_ordenCompra());
			mapperOrdenCompra.setCosto(ordenCompra.getCosto());
			mapperOrdenCompra.setObservacion(ordenCompra.getObservacion());
			mapperOrdenCompra.setFechaEntrada(ordenCompra.getFechaEntrada());
			mapperOrdenCompra.setFechaPerdido(ordenCompra.getFechaPerdido());
			
			collectionOrdenCompra.add(mapperOrdenCompra);
		}
		return collectionOrdenCompra;
	}
	
}
