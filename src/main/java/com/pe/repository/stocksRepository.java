package com.pe.repository;

import org.springframework.data.repository.CrudRepository;
import com.pe.model.Stock;

public interface stocksRepository extends CrudRepository<Stock, Integer>{

}
