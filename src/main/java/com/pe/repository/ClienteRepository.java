package com.pe.repository;

import org.springframework.data.repository.CrudRepository;
import com.pe.model.Cliente;

public interface ClienteRepository  extends CrudRepository<Cliente, Integer> {

}
