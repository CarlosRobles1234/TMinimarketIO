package com.pe.service;

import java.util.*;
import com.pe.model.*;

public interface ClienteService {
	public Cliente insert(Cliente cliente);
	public abstract void update(Cliente cliente);
	public abstract void delete(Integer id_cliente);
	public abstract Cliente findById(Integer id_cliente);
	public abstract Collection<Cliente> findAll();
}
