package com.pe.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import com.pe.model.*;
import com.pe.repository.*;

@Service
public class OrdenCompraServiceImpl implements OrdenCompraService{

	@Autowired
	private OrdenCompraRepository repository;
	
	@Override
	@Transactional
	public OrdenCompra insert(OrdenCompra ordenCompra) {
		return	repository.save(ordenCompra);}

	@Override
	@Transactional
	public void update(OrdenCompra ordenCompra) {
		repository.save(ordenCompra);}
	
	@Override
	@Transactional
	public void delete(Integer id_ordenCompra) {
		repository.deleteById(id_ordenCompra);}

	@Override
	@Transactional(readOnly = true)
	public OrdenCompra findById(Integer id_ordenCompra) {
		return repository.findById(id_ordenCompra).orElse(null);}

	@Override
	@Transactional(readOnly = true)
	public Collection<OrdenCompra> findAll() {
		return (Collection<OrdenCompra>) repository.findAll();}
}
