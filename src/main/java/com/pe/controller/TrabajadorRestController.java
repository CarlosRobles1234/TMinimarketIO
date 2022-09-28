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
@RequestMapping("/trabajador")
public class TrabajadorRestController {

	@Autowired
	private DocumentoService documentoService;

	@Autowired
	private TipoTrabajoService tipoTrabajoService;

	@Autowired
	private TrabajadorService trabajadorService;

	@GetMapping("/listar")
	ResponseEntity<?> listar() {
		Collection<Trabajador> itemsTrabajador = trabajadorService.findAll();
		Collection<MapperTrabajador> itemsTrabajadorMapper = MapperUtilTrabajador.convertTrabajador(itemsTrabajador);

		return new ResponseEntity<>(itemsTrabajadorMapper, HttpStatus.OK);
	}

	@PostMapping("/agregar")
	public ResponseEntity<?> agregar(@RequestBody Trabajador trabajador) {
		trabajador.setDocumento(documentoService.findById(trabajador.getDocumento().getId_documento()));
		trabajador.setTipoTrabajo(tipoTrabajoService.findById(trabajador.getTipoTrabajo().getId_tipotrabajo()));
		trabajadorService.insert(trabajador);
		return new ResponseEntity<>("Se creó correctamente", HttpStatus.CREATED);
	}

	@PutMapping("/editar/{id_trabajador}")
	public ResponseEntity<?> editar(@PathVariable Integer id_trabajador, @RequestBody Trabajador newTrabajador) {
		Trabajador trabajadorDB = trabajadorService.findById(id_trabajador);

		if (trabajadorDB != null) {

			trabajadorDB.setNombre(newTrabajador.getNombre());
			trabajadorDB.setTelefono(newTrabajador.getTelefono());
			trabajadorDB.setDireccion(newTrabajador.getDireccion());
			trabajadorDB.setDocumento(documentoService.findById(newTrabajador.getDocumento().getId_documento()));
			trabajadorDB.setTipoTrabajo(tipoTrabajoService.findById(newTrabajador.getTipoTrabajo().getId_tipotrabajo()));
			
			trabajadorService.update(trabajadorDB);
			return new ResponseEntity<>(
					"La estudiante con el cliente " + id_trabajador + " se actualizó correctamente.", HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/eliminar/{id_trabajador}")
	public ResponseEntity<?> eliminar(@PathVariable Integer id_trabajador)
	{
		Trabajador trabajadorDB= trabajadorService.findById(id_trabajador);
		if( trabajadorDB!= null) { 
			trabajadorService.delete(id_trabajador);
			return new ResponseEntity<>("producto eliminado.",HttpStatus.OK);
		}
		
	return new ResponseEntity<>("producto con ID: "+id_trabajador+" no existe.",HttpStatus.NOT_FOUND);
	}
}