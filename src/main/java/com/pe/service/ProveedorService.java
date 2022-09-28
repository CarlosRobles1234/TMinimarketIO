package com.pe.service;

import java.util.*;
import com.pe.model.*;

public interface ProveedorService {
	public Proveedor insert(Proveedor proveedor);
	public abstract void update(Proveedor proveedor);
	public abstract void delete(Integer id_proveedor);
	public abstract Proveedor findById(Integer id_proveedor);
	public abstract Collection<Proveedor> findAll();
}
