package com.pe.mapper;

import java.util.ArrayList;
import java.util.Collection;

import com.pe.model.*;

public class MapperUtilDetalleCompra {
	
	public static Collection<MapperDetalleCompra> convertDetalleCompra
	(Collection<DetalleCompra>itemsDetalleCompra)
	{
		Collection<MapperDetalleCompra>collectionDetalleCompra=new ArrayList<>();
		for(DetalleCompra detalleCompra:itemsDetalleCompra ) {
		MapperDetalleCompra mapperDetalleCompra = new MapperDetalleCompra();
			
		mapperDetalleCompra.setId_detallecompras(detalleCompra.getId_detallecompras());
		mapperDetalleCompra.setCantidad(detalleCompra.getCantidad());
		mapperDetalleCompra.setPrecio(detalleCompra.getPrecio());
		mapperDetalleCompra.setId_producto(detalleCompra.getProducto().getId_producto());
		mapperDetalleCompra.setId_ordenCompra(detalleCompra.getOrdenCompra().getId_ordenCompra());
		collectionDetalleCompra.add(mapperDetalleCompra);
		}		
		return collectionDetalleCompra;
	}
	
	public static MapperDetalleCompra convertDetalleCompraList(DetalleCompra detalleCompra) {
		MapperDetalleCompra mapperDetalleCompra=new MapperDetalleCompra();
		
		mapperDetalleCompra.setId_ordenCompra(detalleCompra.getOrdenCompra().getId_ordenCompra());
		mapperDetalleCompra.setId_producto(detalleCompra.getProducto().getId_producto());
		mapperDetalleCompra.setCantidad(detalleCompra.getCantidad());
		mapperDetalleCompra.setPrecio(detalleCompra.getPrecio());
		mapperDetalleCompra.setId_detallecompras(detalleCompra.getId_detallecompras());
		return mapperDetalleCompra; 
	}
	
	
}
