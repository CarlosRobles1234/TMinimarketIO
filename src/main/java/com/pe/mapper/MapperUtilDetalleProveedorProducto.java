package com.pe.mapper;

import java.util.ArrayList;
import java.util.Collection;
import com.pe.model.*;

public class MapperUtilDetalleProveedorProducto {

	public static Collection<MapperDetalleProveedorProducto> convertDetalleProveedorProducto 
	(Collection<DetalleProveedorProducto>itemsDetalleProveedorProducto)
	{
		Collection<MapperDetalleProveedorProducto> collectionDetalleProveedorProducto
		=new ArrayList<>();
		
for(DetalleProveedorProducto detalleProveedorProducto:itemsDetalleProveedorProducto){
	MapperDetalleProveedorProducto mapperDetalleProveedorProducto=new
			MapperDetalleProveedorProducto();
	
	mapperDetalleProveedorProducto.setId_detalleProveedorProducto(detalleProveedorProducto.getId_detalleProveedorProducto());
	mapperDetalleProveedorProducto.setId_producto(detalleProveedorProducto.getProducto().getId_producto());
	mapperDetalleProveedorProducto.setId_proveedor(detalleProveedorProducto.getProveedor().getId_proveedor());
	mapperDetalleProveedorProducto.setPrecioCompra(detalleProveedorProducto.getPrecioCompra());
	
		collectionDetalleProveedorProducto.add(mapperDetalleProveedorProducto);
	}
		return collectionDetalleProveedorProducto;
	}
	
}
