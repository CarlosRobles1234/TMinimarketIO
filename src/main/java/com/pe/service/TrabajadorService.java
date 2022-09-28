package com.pe.service;

import java.util.*;
import com.pe.model.*;

public interface TrabajadorService {
	
	public Trabajador insert(Trabajador trabajador);
	public abstract void update(Trabajador trabajador);
	public abstract void delete(Integer id_trabajador);
	public abstract Trabajador findById(Integer id_trabajador);
	public abstract Collection<Trabajador> findAll();
}