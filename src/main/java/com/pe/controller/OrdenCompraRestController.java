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
@RequestMapping("/ordencompra")
public class OrdenCompraRestController {

	@Autowired
	private OrdenCompraService ordenCompraService;
	@Autowired
	private ProveedorService proveedorService;
	
	@GetMapping("/listar")
	ResponseEntity<?> listar() {
		
		Collection<OrdenCompra>itemsOrdenCompra= ordenCompraService.findAll();
		Collection<MapperOrdenCompra>itemsOrdenCompraMapper=MapperUtilOrdenCompra.convertOrdenCompra(itemsOrdenCompra);
		if (itemsOrdenCompra.isEmpty())
			return new ResponseEntity<>(itemsOrdenCompra, HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(itemsOrdenCompraMapper, HttpStatus.OK);	
	}
	
	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody OrdenCompra ordenCompra)
	{
		
		ordenCompra.setProveedor(proveedorService.findById(ordenCompra.getProveedor().getId_proveedor()));
		ordenCompraService.insert(ordenCompra);
		return new ResponseEntity<>("Se creó correctamente", HttpStatus.CREATED);
		
	}
	
	@PutMapping("/editar/{id_ordenCompra}")
	public ResponseEntity<?> editar(@PathVariable Integer id_ordenCompra, @RequestBody OrdenCompra newOrdenCompra) {
		OrdenCompra ordenCompraDB = ordenCompraService.findById(id_ordenCompra);
		
		if (ordenCompraDB != null) {
			ordenCompraDB.setObservacion(newOrdenCompra.getObservacion());
			ordenCompraDB.setCosto(newOrdenCompra.getCosto());
			ordenCompraDB.setProveedor(proveedorService.findById(newOrdenCompra.getProveedor().getId_proveedor()));
			ordenCompraDB.setFechaEntrada(newOrdenCompra.getFechaEntrada());
			ordenCompraDB.setFechaPerdido(newOrdenCompra.getFechaPerdido());
			
			ordenCompraService.update(ordenCompraDB);
		 return new ResponseEntity<>("orden de compra  " + id_ordenCompra + " se actualizó correctamente.",HttpStatus.OK);
			}	
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/eliminar/{id_ordenCompra}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id_ordenCompra)
	{
		OrdenCompra ordenCompraDB = ordenCompraService.findById(id_ordenCompra);
		if( ordenCompraDB!= null) { 
			ordenCompraService.delete(id_ordenCompra);
			return new ResponseEntity<>("producto eliminado.",HttpStatus.OK);
		}
		return new ResponseEntity<>("producto con ID: "+id_ordenCompra+" no existe.",HttpStatus.NOT_FOUND);
	}	
}
