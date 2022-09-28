package com.pe.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import com.pe.model.*;
import com.pe.repository.*;

@Service
public class DocumentoServiceImpl implements DocumentoService {

	@Autowired
	private DocumentoRepository repository;
	
	@Override
	@Transactional
	public Documento insert(Documento documento) {
		return	repository.save(documento);}

	@Override
	@Transactional
	public void update(Documento documento) {
		repository.save(documento);}

	@Override
	@Transactional
	public void delete(Integer id_documento) {
		repository.deleteById(id_documento);}

	@Override
	@Transactional(readOnly = true)
	public Documento findById(Integer id_documento) {
		return repository.findById(id_documento).orElse(null);}

	@Override
	@Transactional(readOnly = true)
	public Collection<Documento> findAll() {
		return (Collection<Documento>) repository.findAll();}

}
