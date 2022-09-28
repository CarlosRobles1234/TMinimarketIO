package com.pe.service;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import com.pe.model.*;
import com.pe.repository.*;

@Service
public class TiendaServiceImpl implements TiendaService {

	@Autowired
	private TiendaRepository repository;
	
	@Override
	@Transactional
	public Tienda insert(Tienda tienda) {
		return	repository.save(tienda);}

	@Override
	@Transactional
	public void update(Tienda tienda) {
		repository.save(tienda);}

	@Override
	@Transactional
	public void delete(Integer id_tienda) {
		repository.deleteById(id_tienda);}

	@Override
	@Transactional(readOnly = true)
	public Tienda findById(Integer id_tienda) {
		return repository.findById(id_tienda).orElse(null);}

	@Override
	@Transactional(readOnly = true)
	public Collection<Tienda> findAll() {
		return (Collection<Tienda>) repository.findAll();}

}
