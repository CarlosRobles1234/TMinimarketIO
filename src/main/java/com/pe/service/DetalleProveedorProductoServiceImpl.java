package com.pe.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import com.pe.model.*;
import com.pe.repository.*;

@Service
public class DetalleProveedorProductoServiceImpl implements DetalleProveedorProductoService {

	@Autowired
	private DetalleProveedorProductoRepository repository;
	
	@Override
	@Transactional
	public DetalleProveedorProducto insert(DetalleProveedorProducto detalleProveedorProducto) {
		return	repository.save(detalleProveedorProducto);}

	@Override
	@Transactional
	public void update(DetalleProveedorProducto detalleProveedorProducto) {
		repository.save(detalleProveedorProducto);}

	@Override
	@Transactional
	public void delete(Integer id_detalleProveedorProducto) {
		repository.deleteById(id_detalleProveedorProducto);}

	@Override
	@Transactional(readOnly = true)
	public DetalleProveedorProducto findById(Integer id_detalleProveedorProducto) {
		return repository.findById(id_detalleProveedorProducto).orElse(null);}

	@Override
	@Transactional(readOnly = true)
	public Collection<DetalleProveedorProducto> findAll() {
		return (Collection<DetalleProveedorProducto>) repository.findAll();}

}
