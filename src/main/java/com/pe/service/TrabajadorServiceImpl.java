package com.pe.service;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import com.pe.model.*;
import com.pe.repository.*;

@Service
public class TrabajadorServiceImpl implements TrabajadorService{

	@Autowired
	private TrabajadorRepository repository;
		
	@Override
	public Trabajador insert(Trabajador trabajador) {
		return	repository.save(trabajador);}

	@Override
	public void update(Trabajador trabajador) {
		repository.save(trabajador);}

	@Override
	public void delete(Integer id_trabajador) {
		repository.deleteById(id_trabajador);}

	@Override
	public Trabajador findById(Integer id_trabajador) {
		return repository.findById(id_trabajador).orElse(null);}

	@Override
	public Collection<Trabajador> findAll() {
		return (Collection<Trabajador>) repository.findAll();}
}
