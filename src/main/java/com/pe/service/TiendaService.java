package com.pe.service;

import java.util.Collection;
import com.pe.model.Tienda;

public interface TiendaService {
	public Tienda insert(Tienda tienda);
	public abstract void update(Tienda tienda);
	public abstract void delete(Integer id_tienda);
	public abstract Tienda findById(Integer id_tienda);
	public abstract Collection<Tienda> findAll();
}
