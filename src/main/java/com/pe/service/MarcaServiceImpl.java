package com.pe.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.pe.model.*;
import com.pe.repository.MarcaRepository;

@Service
public class MarcaServiceImpl implements MarcaService{

	@Autowired
	private MarcaRepository repository;
	
	@Override
	@Transactional
	public Marca insert(Marca marca) {
		return	repository.save(marca);}

	@Override
	@Transactional
	public void update(Marca marca) {
		repository.save(marca);}

	@Override
	@Transactional
	public void delete(Integer id_marca) {
		repository.deleteById(id_marca);}

	@Override
	@Transactional(readOnly = true)
	public Marca findById(Integer id_marca) {
		return repository.findById(id_marca).orElse(null);}

	@Override
	@Transactional(readOnly = true)
	public Collection<Marca> findAll() {
		return (Collection<Marca>) repository.findAll();}

}
