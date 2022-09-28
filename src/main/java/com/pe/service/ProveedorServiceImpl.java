package com.pe.service;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;
import com.pe.model.*;
import com.pe.repository.*;

@Service
public class ProveedorServiceImpl  implements ProveedorService{

	@Autowired
	private ProveedorRepository repository;
	
	@Override
	@Transactional
	public Proveedor insert(Proveedor proveedor) {
		return	repository.save(proveedor);}

	@Override
	@Transactional
	public void update(Proveedor proveedor) {
		repository.save(proveedor);}
	
	@Override
	@Transactional
	public void delete(Integer id_proveedor) {
		repository.deleteById(id_proveedor);}

	@Override
	@Transactional(readOnly = true)
	public Proveedor findById(Integer id_proveedor) {
		return repository.findById(id_proveedor).orElse(null);}

	@Override
	@Transactional(readOnly = true)
	public Collection<Proveedor> findAll() {
		return (Collection<Proveedor>) repository.findAll();}

}
