package com.pe.service;

import java.util.Collection;

import com.pe.model.DetalleCompra;

public interface DetalleCompraService {
	public DetalleCompra insert(DetalleCompra detalleCompra);
	public abstract void update(DetalleCompra detalleCompra);
	public abstract void delete(Integer id_detallecompras);
	public abstract DetalleCompra findById(Integer id_detallecompras);
	public abstract Collection<DetalleCompra> findAll();
}
