package com.pe.service;

import java.util.Collection;
import com.pe.model.OrdenCompra;


public interface OrdenCompraService   {
	public OrdenCompra insert(OrdenCompra ordenCompra);
	public abstract void update(OrdenCompra ordenCompra);
	public abstract void delete(Integer id_ordenCompra);
	public abstract OrdenCompra findById(Integer id_ordenCompra);
	public abstract Collection<OrdenCompra> findAll();
}
