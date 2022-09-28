package com.pe.service;

import java.util.Collection;
import com.pe.model.DetalleProveedorProducto;

public interface DetalleProveedorProductoService {
	
	public DetalleProveedorProducto insert(DetalleProveedorProducto detalleProveedorProducto);
	public abstract void update(DetalleProveedorProducto detalleProveedorProducto);
	public abstract void delete(Integer id_detalleProveedorProducto);
	public abstract DetalleProveedorProducto findById(Integer id_detalleProveedorProducto);
	public abstract Collection<DetalleProveedorProducto> findAll();
}
