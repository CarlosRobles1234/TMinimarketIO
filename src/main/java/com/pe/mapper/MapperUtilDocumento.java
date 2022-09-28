package com.pe.mapper;

import java.util.ArrayList;
import java.util.Collection;
import com.pe.model.Documento;

public class MapperUtilDocumento {

	public static Collection<MapperDocumento>convertDocumento
	(Collection<Documento>itemsDocumento){
		Collection<MapperDocumento> collectionDocumento =new ArrayList<>();
		
		for(Documento documento:itemsDocumento) {
			MapperDocumento mapperDocumento = new MapperDocumento();
			
			mapperDocumento.setId_documento(documento.getId_documento());
			mapperDocumento.setNombre(documento.getNombre());
			
			collectionDocumento.add(mapperDocumento);
		}
		
		return collectionDocumento;
	}
	public static MapperDocumento convertDocumentoList
	(Documento documento){
			
		MapperDocumento mapperDocumento2 = new MapperDocumento();
		mapperDocumento2.setId_documento(documento.getId_documento());
		mapperDocumento2.setNombre(documento.getNombre());

		return mapperDocumento2;
	}
	
}
