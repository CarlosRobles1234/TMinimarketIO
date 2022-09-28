package com.pe.mapper;

import java.util.*;
import com.pe.model.*;

public class MapperUtilProveedor {
	
	public static Collection<MapperProveedor> convertProveedor 
	(Collection<Proveedor>itemsProveedor)
	{
		Collection<MapperProveedor> collectionProveedor =new ArrayList<>();
		for(Proveedor proveedor:itemsProveedor ) {
			
			MapperProveedor mapperProveedor= new MapperProveedor();
			
			mapperProveedor.setId_proveedor(proveedor.getId_proveedor());
			mapperProveedor.setNombre(proveedor.getNoombre());
			mapperProveedor.setDireccion(proveedor.getDireccion());
			mapperProveedor.setRuc(proveedor.getRuc());
			mapperProveedor.setTelefono(proveedor.getTelefono());
			
			collectionProveedor.add(mapperProveedor);
		}
		return collectionProveedor;
	}
//convertProveedorList
	public static MapperProveedor convertProveedorList(Proveedor  proveedor) {
		MapperProveedor mapperProducto2 = new MapperProveedor();
		
		mapperProducto2.setId_proveedor(proveedor.getId_proveedor());
		mapperProducto2.setNombre(proveedor.getNoombre());
		mapperProducto2.setDireccion(proveedor.getDireccion());
		mapperProducto2.setRuc(proveedor.getRuc());
		mapperProducto2.setTelefono(proveedor.getTelefono());

		return mapperProducto2;
	}
}
