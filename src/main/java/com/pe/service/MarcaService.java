package com.pe.service;

import java.util.Collection;
import com.pe.model.Marca;

public interface MarcaService {
	
	public Marca insert(Marca marca);
	public abstract void update(Marca marca);
	public abstract void delete(Integer id_marca);
	public abstract Marca findById(Integer id_marca);
	public abstract Collection<Marca> findAll();
	
}
