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
@RequestMapping("/tipotrabajo")
public class TipoTrabajoRestController {

	@Autowired
	private TipoTrabajoService tipoTrabajoService;
	
	@GetMapping("/listar")
	ResponseEntity<?> listar() {
		Collection<TipoTrabajo> itemsTipoTrabajo = tipoTrabajoService.findAll();
		
		Collection<MapperTipoTrabajo> itemsTipoTrabajoMapper = 
				MapperUtilTipoTrabajo.convertTipoTrabajo(itemsTipoTrabajo);
		
		if (itemsTipoTrabajo.isEmpty())
			return new ResponseEntity<>(itemsTipoTrabajo, HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(itemsTipoTrabajoMapper, HttpStatus.OK);
	}
	
	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody TipoTrabajo tipoTrabajo) {
			
		tipoTrabajoService.insert(tipoTrabajo);
		return new ResponseEntity<>("Se creó correctamente", HttpStatus.CREATED);
	}
	
	@PutMapping("/editar/{id_tipotrabajo}")
	public ResponseEntity<?> editar(@PathVariable Integer id_tipotrabajo, 
			@RequestBody TipoTrabajo newTipotrabajo) {
		TipoTrabajo tipoTrabajoDB = tipoTrabajoService.findById(id_tipotrabajo);
		if (tipoTrabajoDB != null) {
		
			tipoTrabajoDB.setDescripcion(newTipotrabajo.getDescripcion());
			tipoTrabajoDB.setNombre(newTipotrabajo.getNombre());
			
		tipoTrabajoService.update(tipoTrabajoDB);
		 return new ResponseEntity<>("La estudiante con el cliente " + id_tipotrabajo + " se actualizó correctamente.",HttpStatus.OK);
			}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
			}
	
	
	
	
	@DeleteMapping("/eliminar/{id_tipotrabajo}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id_tipotrabajo)
	{
		TipoTrabajo tipoTrabajoDB  = tipoTrabajoService.findById(id_tipotrabajo);
		
		
		if(tipoTrabajoDB!= null) { 
			tipoTrabajoService.delete(id_tipotrabajo);
			return new ResponseEntity<>("producto eliminado.",HttpStatus.OK);
		}
		return new ResponseEntity<>("Detalle compras con ID: "+id_tipotrabajo+" no existe.",HttpStatus.NOT_FOUND);
		
	}

	
}
