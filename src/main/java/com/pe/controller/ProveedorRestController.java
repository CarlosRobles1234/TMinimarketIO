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
@RequestMapping("/proveedor")
public class ProveedorRestController {

	@Autowired
	private ProveedorService proveedorService;
	
	@GetMapping("/listar")
	ResponseEntity<?> listar() {
		
		Collection<Proveedor> itemsProveedor = proveedorService.findAll();
		Collection<MapperProveedor> itemsProveedorMapper = 
				MapperUtilProveedor.convertProveedor(itemsProveedor);
		
		if (itemsProveedor.isEmpty())
		return new ResponseEntity<>(itemsProveedor, HttpStatus.NO_CONTENT);
	
		return new ResponseEntity<>(itemsProveedorMapper, HttpStatus.OK);
	}
	
	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody Proveedor proveedor) {
		

		proveedorService.insert(proveedor);
		return new ResponseEntity<>("Se creó correctamente", HttpStatus.CREATED);
	}

	@PutMapping("/editar/{id_proveedor}")
	public ResponseEntity<?> editar(@PathVariable Integer id_proveedor, @RequestBody Proveedor newProveedor) {
		Proveedor proveedorDB = proveedorService.findById(id_proveedor);	
		if (proveedorDB != null) {
			proveedorDB.setDireccion(newProveedor.getDireccion());
			proveedorDB.setNoombre(newProveedor.getNoombre() );
			proveedorDB.setRuc(newProveedor.getRuc());
			proveedorDB.setTelefono(newProveedor.getTelefono());
			
			proveedorService.update(proveedorDB);
			return new ResponseEntity<>("La estudiante con el cliente " + id_proveedor + " se actualizó correctamente.",HttpStatus.OK);							
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	
	@GetMapping("/buscar/{id_proveedor}")
	public ResponseEntity<?> buscar(@PathVariable Integer  id_proveedor){
		Proveedor itemsProveedor = proveedorService.findById(id_proveedor);
		MapperProveedor proveedorMapper = MapperUtilProveedor.convertProveedorList(itemsProveedor);
		
		if(	proveedorMapper!=null) {		
			return new ResponseEntity<>( proveedorMapper , HttpStatus.OK);}	
		return new ResponseEntity<>("Apoderado con el dni " + proveedorMapper + " no existente.", HttpStatus.NOT_FOUND);
		
	
	}
	
	@DeleteMapping("/eliminar/{id_proveedor}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id_proveedor)
	{
		Proveedor proveedorDB = proveedorService.findById(id_proveedor);
		if( proveedorDB!= null) { 
			proveedorService.delete(id_proveedor);
			return new ResponseEntity<>("proveedor eliminado.",HttpStatus.OK);
		}
		return new ResponseEntity<>("proveedor con ID: "+id_proveedor+" no existe.",HttpStatus.NOT_FOUND);

	}
}
