package com.pe.mapper;

import java.util.*;
import com.pe.model.*;

public class ProductoMapperUtil {
	public static Collection<ProductoMapper>convertProducto(Collection<Producto>
	itemsProducto)
	{
		Collection<ProductoMapper>collectionProducto=new ArrayList<>();
		
		for(Producto producto:itemsProducto ) {
			ProductoMapper mapperProducto = new ProductoMapper();
			
			mapperProducto.setId_producto(producto.getId_producto());
			mapperProducto.setDescripcion(producto.getDescripcion());
			mapperProducto.setNombre(producto.getNombre());
			mapperProducto.setPrecioVenta(producto.getPrecioVenta());
			mapperProducto.setNombreMarca(producto.getMarca().getNombre());
			mapperProducto.setId_marca(producto.getMarca().getId_marca());
			collectionProducto.add(mapperProducto);	
		}
		
		return collectionProducto;
	}
	
	
	public static ProductoMapper convertProductoList (Producto producto) {
		
		ProductoMapper mapperProducto1 =new ProductoMapper();
		mapperProducto1.setId_producto(producto.getId_producto());
		mapperProducto1.setDescripcion(producto.getDescripcion());
		mapperProducto1.setNombre(producto.getNombre());
		mapperProducto1.setPrecioVenta(producto.getPrecioVenta());
		mapperProducto1.setNombreMarca(producto.getMarca().getNombre());
		mapperProducto1.setId_marca(producto.getMarca().getId_marca());
		return mapperProducto1;
	}
}
