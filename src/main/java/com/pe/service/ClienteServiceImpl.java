package com.pe.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import com.pe.model.*;
import com.pe.repository.*;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository repository;
	
	@Override
	@Transactional
	public Cliente insert(Cliente cliente) {
		return	repository.save(cliente);}

	@Override
	@Transactional
	public void update(Cliente cliente) {
		repository.save(cliente);}

	@Override
	@Transactional
	public void delete(Integer id_cliente) {
		repository.deleteById(id_cliente);}
	
	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Integer id_cliente) {
		return repository.findById(id_cliente).orElse(null);}
	
	@Override
	@Transactional(readOnly = true)
	public Collection<Cliente> findAll() {
		return (Collection<Cliente>) repository.findAll();}

}
