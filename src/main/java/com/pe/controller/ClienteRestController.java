package com.pe.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.pe.mapper.*;
import com.pe.model.*;
import com.pe.service.*;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/cliente")
public class ClienteRestController {

	@Autowired
	private DocumentoService documentoService;

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/listar")
	ResponseEntity<?> listar() {
		Collection<Cliente> itemsCliente = clienteService.findAll();
		Collection<MapperCliente> itemsClienteMapper = 
				MapperUtilCliente.convertCliente(itemsCliente);

		if (itemsCliente.isEmpty())
			return new ResponseEntity<>(itemsCliente, HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(itemsClienteMapper, HttpStatus.OK);
	}

	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody Cliente cliente) {
//		cliente.setDocumento(documentoService.findById(cliente.getDocumento().getId_documento()));
		clienteService.insert(cliente);
		return new ResponseEntity<>("Se creó correctamente", HttpStatus.CREATED);
	}
	
	@PutMapping("/editar/{id_cliente}")
	public ResponseEntity<?> editar(@PathVariable Integer id_cliente, 
			@RequestBody Cliente newCliente) {
		Cliente clienteDB = clienteService.findById(id_cliente);
		if (clienteDB != null) {
		
			clienteDB.setTelefono(newCliente.getTelefono());
			clienteDB.setDireccion(newCliente.getDireccion());
			clienteDB.setCorreo(newCliente.getCorreo());
		clienteDB.setDocumento(documentoService.findById(newCliente.getDocumento().getId_documento())); 
			clienteDB.setNombre(newCliente.getNombre());
			clienteDB.setNumero_documento(newCliente.getNumero_documento());
		
		clienteService.update(clienteDB);
		 return new ResponseEntity<>("La estudiante con el cliente " + id_cliente + " se actualizó correctamente.",HttpStatus.OK);
			}		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/eliminar/{id_cliente}")	
	public ResponseEntity<?> eliminar(@PathVariable Integer id_cliente)
	{
		Cliente clienteDB  = clienteService.findById(id_cliente);
		
		if( clienteDB!= null) { 
			clienteService.delete(id_cliente);
			return new ResponseEntity<>("producto eliminado.",HttpStatus.OK);
		}
		return new ResponseEntity<>("producto con ID: "+id_cliente+" no existe.",HttpStatus.NOT_FOUND);
	}
	
	
	
	
	
	
	
	
	
	
}
