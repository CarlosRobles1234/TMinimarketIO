package com.pe.mapper;

import java.util.*;

import com.pe.model.Marca;

public class MapperUtilMarca {

	public static Collection<MarcaMapper>convertMarca
	(Collection<Marca>itemsMarca)
	{
		Collection<MarcaMapper>collectionMarca=new ArrayList<>();
		for(Marca marca:itemsMarca ) {
		MarcaMapper mapperMarca= new MarcaMapper();
		
		mapperMarca.setId_marca(marca.getId_marca());
		mapperMarca.setNombre(marca.getNombre());
			
		collectionMarca.add(mapperMarca);
	}
		return collectionMarca;
	}
	public static MarcaMapper convertMarcaList (Marca marca){
		
		MarcaMapper mapperMarca= new MarcaMapper();
		mapperMarca.setId_marca(marca.getId_marca());
		mapperMarca.setNombre(marca.getNombre());
		return mapperMarca;
	}
	
}
