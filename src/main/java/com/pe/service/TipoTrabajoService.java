package com.pe.service;

import java.util.*;
import com.pe.model.*;

public interface TipoTrabajoService {
	
	public TipoTrabajo insert(TipoTrabajo tipoTrabajo);
	public abstract void update(TipoTrabajo tipoTrabajo);
	public abstract void delete(Integer id_tipotrabajo);
	public abstract TipoTrabajo findById(Integer id_tipotrabajo);
	public abstract Collection<TipoTrabajo> findAll();
}
