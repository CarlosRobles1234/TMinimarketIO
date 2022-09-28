package com.pe.service;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import com.pe.model.*;
import com.pe.repository.*;

@Service
public class TipoTrabajoServiceImpl  implements TipoTrabajoService{

	@Autowired
	private TipoTrabajoRepository repository;
	
	@Override
	@Transactional
	public TipoTrabajo insert(TipoTrabajo tipoTrabajo) {
		return	repository.save(tipoTrabajo);}

	@Override
	@Transactional
	public void update(TipoTrabajo tipoTrabajo) {
		repository.save(tipoTrabajo);}

	@Override
	@Transactional
	public void delete(Integer id_tipotrabajo) {
		repository.deleteById(id_tipotrabajo);}

	@Override
	@Transactional(readOnly = true)
	public TipoTrabajo findById(Integer id_tipotrabajo) {
		return repository.findById(id_tipotrabajo).orElse(null);}

	@Override
	@Transactional(readOnly = true)
	public Collection<TipoTrabajo> findAll() {
		return (Collection<TipoTrabajo>) repository.findAll();}
	
	
	
	
	
	
	
}
