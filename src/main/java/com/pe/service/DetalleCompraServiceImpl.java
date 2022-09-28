package com.pe.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import com.pe.model.*;
import com.pe.repository.*;

@Service
public class DetalleCompraServiceImpl implements DetalleCompraService {

	@Autowired
	private DetalleCompraRepository repository;
	
	@Override
	@Transactional
	public DetalleCompra insert(DetalleCompra detalleCompra) {
		return	repository.save(detalleCompra);}

	@Override
	@Transactional
	public void update(DetalleCompra detalleCompra) {
		repository.save(detalleCompra);}

	@Override
	@Transactional
	public void delete(Integer id_detallecompras) {
		repository.deleteById(id_detallecompras);}

	@Override
	@Transactional(readOnly = true)
	public DetalleCompra findById(Integer id_detallecompras) {
		return repository.findById(id_detallecompras).orElse(null);}

	@Override
	@Transactional(readOnly = true)
	public Collection<DetalleCompra> findAll() {
		return (Collection<DetalleCompra>) repository.findAll();}

}
