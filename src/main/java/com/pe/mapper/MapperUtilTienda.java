package com.pe.mapper;

import java.util.ArrayList;
import java.util.Collection;
import com.pe.model.Tienda;

public class MapperUtilTienda {
	public static Collection<MapperTienda>convertTienda(Collection<Tienda>
	itemsTienda)
	{
		Collection<MapperTienda>collectionTienda=new ArrayList<>();
		for(Tienda tienda:itemsTienda) {
			MapperTienda mapperTienda = new MapperTienda();
		
			mapperTienda.setId_tienda(tienda.getId_tienda());
			mapperTienda.setNombre(tienda.getNombre());
			
		collectionTienda.add(mapperTienda);		
		}	
		return collectionTienda;	
	}
	
	public static MapperTienda convertTiendaList (Tienda tienda) {
		MapperTienda mapperTienda1 =new MapperTienda();
		mapperTienda1.setId_tienda(tienda.getId_tienda());
		mapperTienda1.setNombre(tienda.getNombre());
		return mapperTienda1;	
	}
}
