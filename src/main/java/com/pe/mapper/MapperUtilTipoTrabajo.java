package com.pe.mapper;

import java.util.*;
import com.pe.model.*;

public class MapperUtilTipoTrabajo {

	public static Collection<MapperTipoTrabajo> convertTipoTrabajo
	(Collection<TipoTrabajo>itemsTipoTrabajo)
	{
		Collection<MapperTipoTrabajo> collectionTipoTrabajo =new ArrayList<>();
		for(TipoTrabajo tipoTrabajo:itemsTipoTrabajo) {
			MapperTipoTrabajo mapperTipoTrabajo= new MapperTipoTrabajo();
		
			mapperTipoTrabajo.setId_tipotrabajo(tipoTrabajo.getId_tipotrabajo());
			mapperTipoTrabajo.setNombre(tipoTrabajo.getNombre());
			mapperTipoTrabajo.setDescripcion(tipoTrabajo.getDescripcion());
			
		collectionTipoTrabajo.add(mapperTipoTrabajo);
		}
			return collectionTipoTrabajo;
	}
	
	public static MapperTipoTrabajo convertTipoTrabajoList(TipoTrabajo tipoTrabajo) {
		MapperTipoTrabajo mapperTipoTrabajo2 = new MapperTipoTrabajo();
		
		
		mapperTipoTrabajo2.setDescripcion(tipoTrabajo.getDescripcion());
		mapperTipoTrabajo2.setId_tipotrabajo(tipoTrabajo.getId_tipotrabajo());
		mapperTipoTrabajo2.setNombre(tipoTrabajo.getNombre());

		return mapperTipoTrabajo2;}
	
	
}
