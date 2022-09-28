package com.pe.service;

import java.util.*;
import com.pe.model.*;


public interface ProductoService {
	
	public Producto insert(Producto producto);
	public abstract void update(Producto producto);
	public abstract void delete(Integer id_producto);
	public abstract Producto findById(Integer id_producto);
	public abstract Collection<Producto> findAll();
	
}
