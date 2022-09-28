package com.pe.service;

import java.util.Collection;

import com.pe.model.Documento;

public interface DocumentoService {
	public Documento insert(Documento documento);
	public abstract void update(Documento documento);
	public abstract void delete(Integer id_documento);
	public abstract Documento findById(Integer id_documento);
	public abstract Collection<Documento> findAll();
}
